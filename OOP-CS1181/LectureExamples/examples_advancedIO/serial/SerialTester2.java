import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.*;


/**
   This program tests serialization of a Bank object.
   If a file with serialized data exists, then it is
   loaded. Otherwise the program starts with a new bank.
   Bank accounts are added to the bank. Then the bank 
   object is saved.
*/
public class SerialTester2
{
   public static void main(String[] args)
         throws IOException, ClassNotFoundException
   {     
  		ArrayList<Rectangle> myList;
		ArrayList<Point> myList2;		
		
      File f = new File("myData2.dat");
      if (f.exists())
      {
         ObjectInputStream in = new ObjectInputStream (new FileInputStream(f));
         myList = (ArrayList<Rectangle>) in.readObject();
			myList2 = (ArrayList<Point>) in.readObject();

         in.close();
      }
      else 
      {
		  myList = new ArrayList<Rectangle>();
        Rectangle a = new Rectangle (100,100,20,30);
        Rectangle b = new Rectangle (100,100,120,30);
        Rectangle c = new Rectangle (100,100,20,130);
		  myList.add(a);
		  myList.add(b);
		  myList.add(c);	
		  
	     myList2 = new ArrayList<Point>();
        Point a2 = new Point (100,100);
        Point b2 = new Point (120,30);
        Point c2 = new Point (20,130);
		  myList2.add(a2);
		  myList2.add(b2);
		  myList2.add(c2);	
	  
      }

     
      ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream(f));
      out.writeObject(myList);
		out.writeObject(myList2);
      out.close();
		for (Rectangle x : myList)
      {
         System.out.println(x.toString());       
		}
		
		for (Point y : myList2)
      {
         System.out.println(y.toString());       
		}


   }
}
