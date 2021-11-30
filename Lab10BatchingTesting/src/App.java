
/** 
 * Name: Jay Nguyen              Student Number: 100384022
 * Course/Section: CPSC 1150-#   
 * Instructor: Bryan Green             Date:           Nov, 25, 2021
 * Assignment/Lab: 10             Last Modified: N   Dec, 02, 2021  
 * Purpose: Batching Testing
*/
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class RLEDriver {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        printIdentification();   
        File f = getAFile();
        Scanner scan = new Scanner(f);
        
        ///Users/hungnguyen/Documents/VScode/Lab10BatchingTesting/src/dataLab10.docx
    }
    private static void printIdentification()
    {
        System.out.println("### Lab 10: Menus   Author: Jay Nguyen  ###");
        System.out.println("### Course/Section - CPSC1150-7 ###");
        System.out.println("### St.# - 100384022 ###\n");
        System.out.println();
    } // printIdentification
    private static File getAFile() throws IOException
    {
        File file;
        do{
            System.out.println("Enter the name of the file you would like to use in batch testing");
            String path = input.next();
            file = new File(path);
        }
        while(!file.exists()||!file.canWrite());
        return file;  
    }
    private static String readLine(Scanner fromFileScanner)
    {
        while(input.hasNextLine())
        {
            return input.nextLine();
        }
        
    }
    }
    private static boolean testPassed(String expectedOutput, String actualOutput)
    {
        if(expectedOutput.equals(actualOutput))
            return true;
        return false;
    }
    private static boolean testAgain()
    {
        char again;
        System.out.println("Press E if want to exist, ... ");
        again = input.next().charAt(0);
        if(again == 'e' || again == 'E')
            return false;
        return true;
    }
    private static void batchTest(Scanner fromFile)
    {
        int totalTests = 0;
        int totalTestsPassed = 0;
        while(fromFile.hasNext())
        {
            String encoded = readData(fromFile);
            char delim = readData(fromFile).charAt(0);
            Scanner expectedOutput = readData(fromFile);
            String actualOutput = RLE.decodeRLE(encoded, delim);
            if(testPassed(expectedOutput, actualOutput))
            {
                totalTestsPassed++;
            }
            totalTests++;
        }
        printTestStatments(totalTestsPassed, totalTests);

    }
    private static String readLine(Scanner fromFile) {
        return null;
    }
    private static void printTestStatments(int totalTestsPassed, int totalTests)
    {
        System.out.println("There were " + totalTests + ", and there were " + totalTestsPassed + " passed");
    }
    private static String readData(Scanner fromFile)
    {
        while(input.hasNext())
        {

        }
        input.close();
    }
    

    
}
