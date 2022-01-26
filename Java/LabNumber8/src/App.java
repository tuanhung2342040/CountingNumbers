import java.util.Random;
import java.util.Scanner;

/** 
 * Name: Jay Nguyen              Student Number: 100384022
 * Course/Section: CPSC 1150-#   
 * Instructor: Bryan Green             Date:           Oct, 27, 2021
 * Assignment/Lab: 8             Last Modified: Oct, 30, 2021  
 * Purpose:The purpose is to use array 

*/
public class App {
    static Scanner keyboard = new Scanner(System.in);
    final static char [] VOWELS = {'a', 'e', 'i', 'o','u'};
    public static void main(String[] args) throws Exception {
        printIdentification();
        System.out.println("What is the size you want?");
        int size = keyboard.nextInt();
        arrayInt(size);
        System.out.println("Print 30 integers per row");
        int [] numbers = new int[30]; 
        printInteger(numbers);
        System.out.println("The random character from the constant array is ");
        getRandomChar();
        System.out.println("100 random vowels from the constant array is ");
        char [] random = new char[100];
        getRamdomAHundredChar(random);
        System.out.println("Print 30 characters per rom");
        char [] randomVowels = new char[100];
        print30CharacterPerRow(randomVowels);
        while(check4ConsecutivePosition(randomVowels) == false)
        {
                for(int i = 0; i<randomVowels.length;i++)
                {
                    System.out.println(randomVowels[i]);
                }
            
        }
                System.out.println("End of program");
        
                

    }
    private static void printIdentification()
    {
        System.out.println("### Lab 6: Menus   Author: Jay Nguyen  ###");
        System.out.println("### Course/Section - CPSC1150-7 ###");
        System.out.println("### St.# - 100384022 ###\n");
        System.out.println();
    } // printIdentification
    private static int randomInteger()
    {
        double randNumber = Math.random();
        double d = randNumber * 100;
        int randomInt = (int)d;
        return randomInt;
    }
    private static void printInteger(int [] numbers)
    {
        for(int i = 0; i < 3; i ++)
        {
            for(int j = 0; j < numbers.length/3;j++)
            {
                System.out.print(randomInteger());
            }
            System.out.println();
        }
    }
    //Write a Java program that will create an array of 30 random integers and prints it on the screen 10 per line. The random integers will be from 0 to 100. There should be two stages in the program: 1) Generate the array and 2) print it.
    private static void arrayInt(int size)
    {
        int temp = 0;
        int [] numInt = new int [size];
        for(int i = 0; i < numInt.length;i++)
        {
            numInt[i] = randomInteger();
            System.out.println(numInt[i]);
            
        }

    }
    

    private static void getRandomChar() {
        
      	Random r = new Random();        
      	int randomNumber=r.nextInt(VOWELS.length);
      	System.out.println(VOWELS[randomNumber]);
    }
    private static void getRamdomAHundredChar(char [] randomVowels)
    {

        Random r = new Random();        
        for(int i = 0; i < randomVowels.length;i++)
        {
            int randomNum=r.nextInt(VOWELS.length);
            randomVowels[i] = VOWELS[randomNum];
            System.out.println(randomVowels[i]);
            
        }

    }
    private static void print30CharacterPerRow(char [] randomVowels)
    {
        int row = 3;
        int column = 30;
        Random r = new Random();
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++ )
            {
                int randomNum=r.nextInt(VOWELS.length);
                randomVowels[i] = VOWELS[randomNum];
                System.out.print(randomVowels[i]);
            }
            System.out.println();
        }
    }
    private static boolean check4ConsecutivePosition(char[]randomVowels)
    {
        for(int i = 0; i< randomVowels.length;i++)
        {
            if(randomVowels[i]  == randomVowels[i+1] &&  randomVowels[i+1] == randomVowels[i+2] &&
            randomVowels[i+2]  == randomVowels[i+3] && randomVowels[i+3]  == randomVowels[i+4])
                return true;

        }
        return false;

    }

}
