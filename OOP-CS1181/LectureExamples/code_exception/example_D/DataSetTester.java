import java.io.*;
import java.util.*;

public class DataSetTester
{
	public static void main(String[] args) 
   {
		DataSetReader reader = new DataSetReader();
		String filename ="test.txt";
		
		try{ 
			double[] data= reader.readFile(filename);
			double sum = 0;    
			for (double d : data)
				sum = sum + d; 
			System.out.println("The sum is " + sum);
		} catch(FileNotFoundException e){
			System.out.println("Wrong file name. Try again");
		} // Note that NoSuchElementException is super class of
		  // InputMismatchException
		catch(NoSuchElementException e){
			System.out.println("File corrupted");
		} catch (IOException exception)  {
			exception.printStackTrace();
		}		
		
	}
}
