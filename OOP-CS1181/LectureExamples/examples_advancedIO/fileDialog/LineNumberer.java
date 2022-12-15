import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JFileChooser;



public class LineNumberer
{
   public static void main(String[] args)
   {
        Scanner in=null; 
        PrintWriter out=null;
        File inFile=null,outFile=null;
     
  		JFileChooser chooser = new JFileChooser();
			
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			inFile = chooser.getSelectedFile();
		else{
			System.out.println("Error");
			System.exit(0);
		}	
		
		if(chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
			outFile = chooser.getSelectedFile();
		else{
			System.out.println("Error");
			System.exit(0);
		}	
	
			
        try
        {
         FileReader reader = new FileReader(inFile);
         in = new Scanner(reader);
         out = new PrintWriter(outFile);
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
