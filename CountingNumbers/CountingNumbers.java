
 Name: General Student
 Student Number: 033550336
 Course: CPSC1150        Section 7
 Date: February 30th 2005
 Instructor: Vladimir Cheney
 Purpose: This program compute the total number of peas that a
          person has assuming that every peapod contains the same
          number of peas, that is, 9. 1 
          
 Input:   Number of peapods
 Output:  The total number of peas
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
        //countPeapods();
        //simpleEcho();
        //complexEcho();
        CountingNumbers();  
    }
         
    // runs the show!
    /*private static void countPeapods()
    {
        final int PEAS_PER_POD = 9;	// assume there are 9 peas in each pod
        int numberOfPods;			// number of pods of peas
        int totalPeas;		    	// total number of peas in all pods

        // Obtain the number pods of peas from user
        System.out.println("Enter the number of pods: ");
        numberOfPods = keyboard.nextInt();
        
        // Compute the total number of peas
        totalPeas = numberOfPods * PEAS_PER_POD;

        // Display the total number of peas
        System.out.println("If you have " + numberOfPods +
            " peapods\nand " + PEAS_PER_POD +
            " peas in each pod, then\n" +
            "you have " + totalPeas +
            " peas in all the pods.");
    } //countPeapods*/

    //========================================================
    // Method: Identification
    // Purpose: Prints several lines of identification/instructions, 
    //          including the current date and time.
    //========================================================
    private static void printIdentification()
    {
        System.out.println("### Count Numbers  Author: Jay Nguyen ###");
        System.out.println("### Course/Section - CPSC1150-7    St.# - 100384022 ###\n");
        System.out.println(new java.util.Date());
    } //printIdentification

   /* private static void simpleEcho(){
        final int ZERO_TARGET = 1;
        int numZeros;
        int value;
        numZeros = 0;
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
       /* private static void complexEcho(){
            final int ZERO_TARGET = 2;
            int numZeros;
            boolean isGoodInput;
            int value;
            numZeros = 0;
            isGoodInput = true;
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
            
        }*/
        private static void CountingNumbers(){
            final int ZERO_TARGET = 2;
            int numZeros;
            int evenCount;
            int oddCount;
            int largest;
            boolean firstTime;
            boolean isGoodInput;
            int value;
            numZeros = 0;
            evenCount = 0;
            oddCount = 0;
            largest = 0;
            firstTime = true;
            isGoodInput = true;
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
                System.out.println("There are " + oddCount + " odd numbers were inputted");
                System.out.println("There are " + evenCount + " even number were inputted");
                System.out.println("The largest number is " + largest);
            }
            System.out.println("End of program");
        }

}

/*
SAMPLE OUTPUT:

>java PeaPodCounter
### Pea Pod Counter  Author: General Student  ###
### Course/Section - CPSC1150-7    St.# - 33550336 ###

Mon Jan 31 18:14:08 PST 2005
Enter the number of pods: 3

If you have 3 pea pods
and 9 peas in each pod, then
you have 27 peas in all the pods.

*/
