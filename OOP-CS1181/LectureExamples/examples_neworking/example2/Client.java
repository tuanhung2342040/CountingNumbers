
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.net.Socket;
// Clinet side of one way connection
public class Client  implements Protocol{
	public static void main( String[] args )  throws IOException {
	
		Socket client = null;
            
		try {
			client = new Socket( "localhost", PORT);
			OutputStream outS = client.getOutputStream( );
			DataOutputStream out = new DataOutputStream(outS);
			for( int i = 0; i < 20; i++ ){
				out.writeInt(DATA);
				out.writeUTF("CPSC1181_"+i);
				out.flush();
			}	
			out.writeInt(END);  // terminate the connection
			out.flush();
		}
		catch( IOException e ) {
			System.out.println("Program terminated unexpectly!");
		}
		finally {
			System.out.println("End of request");
			client.close( );
		}

	}
}
  
 
