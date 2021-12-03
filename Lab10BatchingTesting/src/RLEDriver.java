
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
    static Scanner scan = new Scanner(System.in);
    static Scanner input;
    public static void main(String[] args) throws IOException {
        printIdentification();   
        File f = getAFile();
        input = new Scanner(f);
        readTests(input);
        //data.txt
    }
    private static void printIdentification()
    {
        System.out.println("### Lab 10: Menus   Author: Jay Nguyen  ###");
        System.out.println("### Course/Section - CPSC1150-003 ###");
        System.out.println("### St.# - 100384022 ###\n");
        System.out.println();
    } // printIdentification
    /**
     * get the file name from the user and return the file
     * @return file that contains input values and expected output
     * @throws IOException
     */
    private static File getAFile() throws IOException
    {
        File file;
        do{
            System.out.println("Enter the name of the file:");
            String path = scan.next();
            file = new File(path);
            if(!file.exists()){
                System.out.println("File does not exist");
            }
        }
        while(!file.exists()||!file.canWrite());
        return file;  
    }
    /**
     * test if the expectOutput is equal to the actualOutput or not
     * @param expectedOutput
     * @param actualOutput
     * @return return true if expectedOutput = actualOutput, otherwise return false
     */
    private static boolean testPassed(String expectedOutput, String actualOutput)
    {
        if(expectedOutput.equals(actualOutput))
            return true;
        return false;
    }
    /**
     * ask users if they want to test again
     * @return false if e or E, otherwise return true
     * @throws IOException
     */
    private static boolean command()
    {
        char command;
        System.out.println("Press E if want to exist and print the results, or any other key to run the test");
        command = scan.next().charAt(0);
        if(command == 'e' || command == 'E')
            return false;
        return true;
    }
    
    /**
     * read the test cases from the file and return the results
     * @param inputFIle
     * @throws IOException
     */
    private static void readTests(Scanner inputFile) throws IOException
    {
        int totalTests = 0;
        int totalTestsPassed = 0;
        while(inputFile.hasNext() && command())
        {
            String junk = readData(inputFile);
            String junk1 = readData(inputFile);
            String encoded = readData(inputFile);
            char delim = readData(inputFile).charAt(0);
            String expectedOutput = readData(inputFile);
            String actualOutput = RLE.decodeRLE(encoded, delim);
            System.out.println("RLE Code: " + encoded);
            System.out.println("Delimiter: " + delim);
            System.out.println("ExpectedOutput: " + expectedOutput);
            System.out.println("ActualOutput:   " + actualOutput);
            System.out.println();
            System.out.println();
            if(testPassed(expectedOutput, actualOutput))
            {
                totalTestsPassed++;
            }
            totalTests++;
            
        }
        printTestStatements(totalTestsPassed, totalTests);
        



    }
    /**
     * print the results of the test: total tests, total tests passed, and percentage of tests passed
     * @param totalTestsPassed the number of tests that passed in the test
     * @param totalTests the number of tests that were run
     * @throws IOException
     */
    private static void printTestStatements(int totalTestsPassed, int totalTests)
    {
        System.out.println("Total Tests: " + totalTests);
        System.out.println("Total Tests Passed: " + totalTestsPassed);
        System.out.println("Total Tests Failed: " + (totalTests - totalTestsPassed));
        System.out.println("Percentage of tests passed: " + ((double)totalTestsPassed/totalTests)*100 + "%");
    }
    /**
     * read data from the file and return it
     * @param inputFile
     * @return the data read from the file
     * @throws IOException
     */
    private static String readData(Scanner fromFile) throws IOException
    {
        while(input.hasNext())
        {
            return input.nextLine();
        }   
        input.close();
        return input.nextLine();
    }
    
}
