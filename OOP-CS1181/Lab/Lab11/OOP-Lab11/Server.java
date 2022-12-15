import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        Inventory inventory = new Inventory();
        inventory.addItem("Monitor", 3);
        inventory.addItem("Monitor", 2);
        inventory.addItem("Keyboard", 2);
        inventory.addItem("HardDisk", 12);
        inventory.addItem("Mouse", 4);
        final int PORT = 4999;
        ServerSocket server = new ServerSocket(PORT);
        int count = 1;
        while(true){
            System.out.println("Waiting for clients to connect...");
            Socket client = server.accept();
            System.out.println("Client " + count++ + " connected.");
            InventoryService service = new InventoryService(client, inventory);
            Thread t = new Thread(service);
            t.start();
        }
    }
}

class InventoryService implements Runnable, Protocol {
    private Socket client;
    private DataInputStream in;
    private DataOutputStream out;
    private Inventory inventory;

    public InventoryService(Socket client, Inventory inventory){
        this.client = client;
        this.inventory = inventory;
    }

    @Override
    public void run() {
        try {
            in = new DataInputStream(client.getInputStream());
            out = new DataOutputStream(client.getOutputStream());
            doService();
        }
        catch (IOException exception){
            System.out.println("Errors occur");
        }
        finally {
            try{
                client.close();
            }
            catch (IOException exception){
                // do nothing
            }
        }
    }

    private void doService() throws IOException {
        int command = 0;
        String productName;
        int quantity;

        while(command !=QUIT){
            command = in.readInt();
            switch (command){
                case ADD_ITEM:
                    productName = in.readUTF();
                    quantity = in.readInt();
                    inventory.addItem(productName, quantity);
                    out.writeUTF(SUCCEED);
                    out.flush();
                    break;
                case CHECK_INVENTORY:
                    productName = in.readUTF();
                    int num1 = inventory.checkInventory(productName);
                    out.writeInt(num1);
                    if(num1 == -1){
                        out.writeUTF(FAIL);
                    }
                    else {
                        out.writeUTF(SUCCEED);
                    }
                    out.flush();
                    break;
                case TAKE_ITEM:
                    productName = in.readUTF();
                    quantity = in.readInt();
                    int num2 = inventory.takeItem(productName, quantity);
                    if(num2 == -1){
                        out.writeUTF(FAIL);
                    }
                    else {
                        out.writeUTF(SUCCEED);
                    }
                    out.writeInt(num2);
                    out.flush();
                    break;
                case GET_THRESHOLD:
                    quantity = in.readInt();
                    String products = inventory.getThreshold(quantity);
                    if(products == ""){
                        out.writeUTF(FAIL);
                    }
                    else {
                        out.writeUTF(SUCCEED);
                    }
                    out.writeUTF(products);
                    out.flush();
                    break;
                case QUIT:
                    out.writeUTF(CLOSED);
                    out.flush();
                    break;
                default:
                    out.writeUTF(FAIL);
                    out.flush();
            }
        }
    }
}
