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
public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        printIdentification();
        String rle = input.nextLine();
        char delimiter = input.next().charAt(0);
        String s = RLE.decodeRLE(rle, delimiter);
        //System.out.println(s);
        File f = getAFile();
        Scanner scan = new Scanner(f);
        while(scan.hasNextLine())
        {
            System.out.println(scan.nextLine());
        }
        
        
    }
    ///Users/hungnguyen/Documents/VScode/Lab10BatchingTesting/src/dataLab10.docx
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
            String path = input.next();
            file = new File(path);
        }
        while(!file.exists()||!file.canWrite());
        return file;  
    }
    

    
}
