import java.io.*;
import java.util.Scanner;

public class DataSetTester
{
   public static void main(String[] args) throws FileNotFoundException, IOException
   {
      DataSetReader reader = new DataSetReader();
      
		String filename="test.txt";
         
      double[] data = reader.readFile(filename);
      double sum = 0;
      
      for (double d : data) 
         sum = sum + d; 
      System.out.println("The sum is " + sum);
   }
}
