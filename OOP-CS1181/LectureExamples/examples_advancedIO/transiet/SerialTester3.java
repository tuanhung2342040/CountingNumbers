import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.*;


public class SerialTester3
{
   public static void main(String[] args)
         throws IOException, ClassNotFoundException
   {     
 		ArrayList<MyPoint> myList;		
		
      File f = new File("myData3.dat");
      if (f.exists())
      {
         ObjectInputStream in = new ObjectInputStream (new FileInputStream(f));
         myList = (ArrayList<MyPoint>) in.readObject();
         in.close();
      }
      else 
      {
	     myList = new ArrayList<MyPoint>();
        MyPoint a2 = new MyPoint(100.0,100.0);
        MyPoint b2 = new MyPoint(120.0,30.0);
        MyPoint c2 = new MyPoint(20.0,130.0);
		  myList.add(a2);
		  myList.add(b2);
		  myList.add(c2);	
	  
      }

     
      ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(f));
      out.writeObject(myList);
      out.close();
		for (MyPoint y : myList)
      {
         System.out.println(y.toString());       
		}


   }
}
