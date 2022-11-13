import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DataSetTester {
	public static void main(String[] args)  
	{
		DataSetReader reader = new DataSetReader();
		try   
		{
			String filename = "test.txt";
			double[] data = reader.readFile(filename);
			double sum = 0;
			for (double d : data) sum = sum + d; 
			    System.out.println("The sum is " + sum);
		}
		catch (FileNotFoundException exception)  {
			System.out.println("File not found.");
		}
		catch (BadDataException exception)   {
			System.out.println("Bad data: " + exception.getMessage());
		}
		catch (IOException exception)  {
			exception.printStackTrace();
		}
	}
}
