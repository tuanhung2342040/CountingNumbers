import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import java.util.Timer;

public class Client  implements Protocol{
    private Socket client;
    private DataInputStream in;
    private DataOutputStream out;
    public Client(){
        client = new Socket("localhost",Protocol.PORT);
        in = new DataInputStream(client.getInputStream());
        out= new DataOutputStream(client.getOutputStream());
    }

    private int delay(){
        return (int) (Math.random());
    }



    public void run(){
        String response;
        int num;
        System.out.println("Add 10 monitors");
        out.writeInt(ADD_ITEM);
        out.writeUTF("Monitor");
        out.writeInt(10);
        out.flush();
        response = in.readUTF();
        System.out.println("Received: " + response);
        System.out.println();

        System.out.println("send invalid command: ");
        out.writeInt(123123);
        out.flush();
        response = in.readUTF();
        System.out.println("Received: " + response);
        System.out.println();

        System.out.println("Add 5 mice");
        out.writeInt(ADD_ITEM);
        out.writeUTF("Mouse");
        out.writeInt(5);
        out.flush();
        response = in.readUTF();
        System.out.println("Received: " + response);
        System.out.println();

        System.out.println("Check keyboard");
        out.writeInt(CHECK_INVENTORY);
        out.writeUTF("Keyboard");
        out.flush();
        num = in.readInt();
        response = in.readUTF();
        System.out.println("Received: " + response + ", " + num);
        System.out.println();

        System.out.println("Take 4 keyboard");
        out.writeInt(TAKE_ITEM);
        out.writeUTF("Keyboard");
        out.writeInt(4);
        out.flush();
        response = in.readUTF();
        num  = in.readInt();
        System.out.println("Received: " + response + ", " + num);
        System.out.println();

        System.out.println("Check keyboard");
        out.writeInt(CHECK_INVENTORY);
        out.writeUTF("Keyboard");
        out.flush();
        num = in.readInt();
        response = in.readUTF();
        System.out.println("Received: " + response + ", " + num);
        System.out.println();



        System.out.println("Take 10 HardDisks");
        out.writeInt(TAKE_ITEM);
        out.writeUTF("HardDisk");
        out.writeInt(10);
        out.flush();
        response = in.readUTF();
        num = in.readInt();
        System.out.println("Received: " + response + ", " + num);
        System.out.println();

        System.out.println("Get all products that have below 5 products");
        out.writeInt(GET_THRESHOLD);
        out.writeInt(5);
        out.flush();
        response = in.readUTF();
        String str = in.readUTF();
        System.out.println("Received: " + response + ", " + str);
        System.out.println();

        System.out.println("Take 3 HardDisks");
        out.writeInt(TAKE_ITEM);
        out.writeUTF("HardDisk");
        out.writeInt(3);
        out.flush();
        response = in.readUTF();
        num = in.readInt();
        System.out.println("Received: " + response + ", " + num);
        System.out.println();

        System.out.println("Check HardDisk");
        out.writeInt(CHECK_INVENTORY);
        out.writeUTF("HardDisk");
        out.flush();
        num = in.readInt();
        response = in.readUTF();
        System.out.println("Received: " + response + ", " + num);
        System.out.println();


        System.out.println("Quit");
        out.writeInt(QUIT);
        out.flush();
        response = in.readUTF();
        System.out.println("Received: " + response);
        System.out.println();
        client.close();

    }


    private static int randomInterval(){
        Random r = new Random();
        return r.nextInt()*400 + 100;
    }
}
