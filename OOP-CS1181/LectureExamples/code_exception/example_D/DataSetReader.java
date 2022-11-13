import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
*  Reads a data set from a file. The file must have the format
*  numberOfValues
*  value1
*  value2
*  . . .
*/
public class DataSetReader
{
   private double[] data;
   /**
   *   Reads a data set.
   *   @param filename the name of the file holding the data
   *   @return the data in the file
   */
   public double[] readFile(String filename) throws IOException, NoSuchElementException
   {
      FileReader reader = null;
      try
      {
         reader = new FileReader(filename);
         Scanner in = new Scanner(reader);
         readData(in);
      }finally{
         reader.close(); // will run no matter what
      }
      return data;
   }

   /**
   *   Reads all data.
   *   @param in the scanner that scans the data
   */
   private void readData(Scanner in) throws NoSuchElementException
   {
      int numberOfValues = in.nextInt();
      data = new double[numberOfValues];

      for (int i = 0; i < numberOfValues; i++)
         readValue(in, i);

   }

   /**
   *   Reads one data value.
   *   @param in the scanner that scans the data
   *   @param i the position of the value to read
   */
   private void readValue(Scanner in, int i)  throws NoSuchElementException
   {
      data[i] = in.nextDouble();      
   }
 
}
