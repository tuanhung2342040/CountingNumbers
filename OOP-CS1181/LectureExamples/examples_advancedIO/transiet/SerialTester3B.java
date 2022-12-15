import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.*;


public class SerialTester3B
{
   public static void main(String[] args)
         throws IOException, ClassNotFoundException
   {     
 		ArrayList<MyPointB> myList;		
		
      File f = new File("myData3B.dat");
      if (f.exists())
      {
         ObjectInputStream in = new ObjectInputStream (new FileInputStream(f));
         myList = (ArrayList<MyPointB>) in.readObject();
         in.close();
      }
      else 
      {
	     myList = new ArrayList<MyPointB>();
        MyPointB a2 = new MyPointB(100.0,100.0);
        MyPointB b2 = new MyPointB(120.0,30.0);
        MyPointB c2 = new MyPointB(20.0,130.0);
		  myList.add(a2);
		  myList.add(b2);
		  myList.add(c2);	
	  
      }

     
      ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(f));
      out.writeObject(myList);
      out.close();
		for (MyPointB y : myList)
      {
         System.out.println(y.toString());       
		}


   }
}
