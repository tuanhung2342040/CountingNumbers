import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class LineNumberer
{
   public static void main(String[] args)
   {
      Scanner in=null; 
      PrintWriter out=null;
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      System.out.print("Output file: ");
      String outputFileName = console.next();
      

      try
      {
         FileReader reader = new FileReader(inputFileName);
         in = new Scanner(reader);
         out = new PrintWriter(outputFileName);
         int lineNumber = 1;
         
         while (in.hasNextLine())
         {
            String line = in.nextLine();
            out.println("/* " + lineNumber + " */ " + line);
            lineNumber++;
         }
      }
      catch (IOException exception)
      {
         System.out.println("Error processing file: " + exception);
      }
      finally {
          out.close();
          in.close();
      }    
   }
}
