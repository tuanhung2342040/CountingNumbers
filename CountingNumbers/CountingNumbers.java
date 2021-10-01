/*
 Name: General Student
 Student Number: 033550336
 Course: CPSC1150        Section 7
 Date: February 30th 2005
 Instructor: Vladimir Cheney
 Purpose: This program compute the total number of peas that a
          person has assuming that every peapod contains the same
          number of peas, that is, 9. 1 thang dien
          
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
        simpleEcho();
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
        System.out.println("### Pea Pod Counter  Author: Jay Nguyen ###");
        System.out.println("### Course/Section - CPSC1150-7    St.# - 100384022 ###\n");
        System.out.println(new java.util.Date());
    } //printIdentification

    private static void simpleEcho(){
        final int ZERO_TARGET = 1;
        int numZeros;
        int value;
        numZeros = 0;
        while(numZeros < ZERO_TARGET) do
        {
            System.out.println("Please enter a number:");
                value = keyboard.nextInt();
                if(value == 0)
                    numZeros++;
                System.out.println(value);
        }

        
        
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
