import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner keyboard = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        //getInput();
        /*
        int [] oldArray =  {1, 2, 5, 9, 6};
        System.out.println(Arrays.toString(duplicateArray(oldArray)));

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        System.out.println(isTheSameArrays(array1, array2));
        int[] theArray = {1, 2, 4, 10, 3};
        printArray(theArray);
        long[] ids = new long[40];
        String[] name = new String[40];
        int howMany = 20;
        System.out.println("What is your name?");
        for(int i = 0; i < name.length && i < howMany; i ++)
        {
            name[i] = input.next();
        }
        printStudents(ids, name, howMany);*/
        //getAFile();
        //System.out.println(readInteger(input));
        System.out.println(sumDouble(input));
        

        
        
    }
    private static int getInput()
    {
        System.out.println("Pls enter value from 0-20");
        int value = input.nextInt();

        //assume illegal
        while(isIllegal(value))
        {
            System.out.println("This is an invalid value");
            System.out.println("Pls enter value from 0-20");
            value = input.nextInt();
        }
        return value;

    }
    private static boolean isIllegal(int num)
    {
        if(num>=0 && num<=20)
            return false;
        else
            return true;

    }
    // 1)Write a value returning method that duplicates an array passed as an argument
    // b=a; b = copyOf(a);
    private static int[] duplicateArray(int [] oldArray)
    {
        int index = 0;//copy
        int [] newArray = new int[oldArray.length];
        while(index < newArray.length)
        {
            newArray[index] = oldArray[index];
            index++;
        }
        return newArray;
    }
    private static boolean isTheSameArrays(int [] array1, int[] array2)
    {
        for(int i = 0; i < array1.length;i++)
        {
            if(array1.length == array2.length && array1[i] == array2[i])
                return true;
        }
        return false;
    }
    private static void printArray(int[] theArray)
    {
        for(int i = 0; i < theArray.length;i++)
        {
            System.out.print(theArray[i] + " ");
        }
    }
    private static void printStudents(long[] ids, String[] name, int howMany)
    {
        System.out.printf("%-12s%-12s%n", "StudentIds", "StudentNames");
        for(int i = 0; i < howMany && i < ids.length;i++)
        {
            ids[i] = getIDs();   
            System.out.printf("%-11d%-12s%n", ids[i], name[i]);
        }
    }
    private static long getIDs()
    {
        double a = Math.random() * 1000000000;
        long b = (long) a;
        return b;
    }
    private static String getNames()
    {
        String name = input.next();
        return name;
    }
    private static int getDate(String[] name, long[] ids, double[] grades) throws IOException
    {
        Scanner input = new Scanner(new File("data.dat"));
        int howMany = input.nextInt();
        for(int i = 0; i < howMany; i++)
        {
            junk = input.nextLine();
            name[i]= input.nextLine().trim();
            ids[i] = input.nextLong();
            grades[i] = input.nextDouble();
        }
        input.close();
        return howMany;
    }
    private static File getAFile()
    {
        File f;
        do{
            String path = keyboard.next();
            f = new File(path);
        }
        while(!f.exists()||!f.canWrite());
        return f;
        
    }
    // Write a method to read and return a single integer read from a Scanner passed as parameter
    private static int readInteger(Scanner input)
    {
        int value = input.nextInt();
        return value;
    }
    // Write a method to output the sum all real numbers from a Scanner passed as parameter
    private static double sum(Scanner input)
    {
        double sum = 0;
        for(int i = 0; i < 5;i++)
        {
            System.out.println("Number " + i + " is: ");
            double value = input.nextDouble();
            sum += value;
        }
        return sum;
    }
    private static double sumDouble(Scanner input)
    {
        double sum = 0;
        while(input.hasNext())
        {
            if(input.hasNextDouble())
            {
                double value = input.nextDouble();
                sum += value; 
            }
            else
            {
                input.next();
            }
        }
        return sum;
    }
    // Write a method to read and return three strings read from a Scanner passed as a parameter
    private static String[] readStrings(Scanenr input)
    {
        String[] values = new String[3];
        values[0] = input.next();
        values[1] = input.next();
        values[1] = input.next();
        return values;
    }
    // Write a program that will draw a histogram of the lengths of the words in this sentence
}
