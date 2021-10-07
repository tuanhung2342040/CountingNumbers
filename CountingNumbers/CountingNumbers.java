
/* 
=======

>>>>>>> 7c48d71b40eb9e9d26131ae6254c206eee4d2cbd
 Name: Jay Nguyen
 Student Number: 100384022
 Name: Angus Angell 
 Student Number: 100317903
 Name: Guillaume Goudie  
 Student Number: 100384786

 Course: CPSC1150        Section 7
 Date: October 27th 2021
 Instructor: Bryan Green
 Purpose: This program computes how many oddNums and evenNum were read? And this also shows the largest of those inputted numbers
          
 Input:   Numbers
 Output:  oddNum, evenNum, largest, 
*/

import java.util.Scanner;


public class CountingNumbers
{
    // a piece of magic - to allow values to be read from the keyboard
    private static Scanner keyboard = new Scanner(System.in);

    // "main" has to be here!
    public static void main (String[] args)
    {
        printIdentification();  
        //simpleEcho();
        //complexEcho();
        countNumbers();  
    }
         

    //========================================================
    // Method: Identification
    // Purpose: Prints several lines of identification/instructions, 
    //          including the current date and time.
    //========================================================
    private static void printIdentification()
    {
        System.out.println("### Count Numbers  Author: Jay Nguyen ###");
        System.out.println("### Course/Section - CPSC1150-7    St.# - 100384022 ###\n");
        System.out.println("### Count Numbers  Author: Angus Angell  ###");
        System.out.println("### Course/Section - CPSC1150-7    St.# - 100317903 ###\n");
        System.out.println("### Count Numbers  Author: Guillaume Goudie  ###");
        System.out.println("### Course/Section - CPSC1150-7    St.# - 100384786 ###\n");
        System.out.println(new java.util.Date());
    } //printIdentification
    /* 
        
        Test Data
        87687 8744 456 65 0

    */

    /*private static void simpleEcho()
   {
        final int ZERO_TARGET = 1;
        int numZeros = 0;
        int value;
        
        while(numZeros < ZERO_TARGET) 
        {
            System.out.println("Please enter a number:");
                value = keyboard.nextInt();
                if(value == 0)
                    numZeros++;
                System.out.println(value);
        }   
        System.out.println("End of program");

    }*/
    /*

        Test data
        Legal numbers: 56 2 -789 0 0
        Invalid numbers: 0.1 2.6 3000000000 -35.28 -4000000000


    */
        /*private static void complexEcho()
       {
            final int ZERO_TARGET = 2;
            int numZeros = 0;
            boolean isGoodInput = true;
            int value;

            while(numZeros < ZERO_TARGET && isGoodInput ==true) 
            {
                System.out.println("Please enter a number:");
                if(keyboard.hasNextInt())
                {
                    value = keyboard.nextInt();
                    if(value == 0)
                        numZeros++;
                    System.out.println(value);
                }
                else
                    isGoodInput =false;
            }   
            if(isGoodInput == false)
                System.out.println("Program ended with illegal input");
            System.out.println("End of program");
            
        } */
        /*
            Test data: 
                Legal numbers: 1 2 3 4 5 0 0

                Invalid numbers: -5.8 0.0003 -8.22222 7000000000 -8000000000

        */
        private static void countNumbers(){
            final int ZERO_TARGET = 2;
            int numZeros = 0;
            int evenCount = 0;;
            int oddCount = 0;
            int largest = 0;
            boolean firstTime = true;
            boolean isGoodInput = true;
            int value;
            while(numZeros < ZERO_TARGET && isGoodInput ==true) 
            {
                System.out.println("Please enter a number:");
                if(keyboard.hasNextInt())
                {
                    value = keyboard.nextInt();
                    if(value == 0)
                        numZeros++;
                    if(value % 2 == 0)
                        evenCount++;
                    else    
                        oddCount++;
                    if(firstTime == true)
                    {
                        firstTime = false;
                        largest = value;
                    }
                    else
                    {
                        if(largest < value)
                            largest = value;
                    }

                }
                else
                    isGoodInput =false;
            }   
            if(isGoodInput == false)
                System.out.println("Program ended with illegal input");
            else
            {
                System.out.println("There are " + oddCount + " odd numbers were read");
                System.out.println("There are " + evenCount + " even number were read");
                System.out.println("The largest number is " + largest);
            }
            System.out.println("End of program");
        }

}

/*
OUTPUT:

>java CountingNumbers
### Count Numbers  Author: Jay Nguyen  ###
### Course/Section - CPSC1150-7    St.# - 100384022 ###

Mon Jan 31 18:14:08 PST 2005
Enter the number: 1, 2, 3, 4, 5, 0, 0

There are 3 odd numbers
There are 4 even numbers
The largest number is 5

Enter the number: -5.8 0.0003 -8.22222 7000000000 -8000000000
Program ended with illegal input
End of program


*/
