

/** 
 * Name: Jay Nguyen              Student Number: 100384022
 * Course/Section: CPSC 1150-#   
 * Instructor: Bryan Green             Date:           Oct, 21, 2021
 * Assignment/Lab: 6             Last Modified: Oct, 24, 2021  
 * Purpose:The purpose is to provide a menu to the user so the user 
 * can choose which shape they want to draw to the console

*/
 

import java.util.Scanner;

public class Menu
{
    final static char EXIT = 'E';
    final static char TRIANGLE = 'T';
    final static char SQUARE = 'S';
    final static char DIAMOND = 'D';

    public static void main (String[] args) throws Exception
    {
        printIdentification();
        interactiveMenu();
        
    }
    /**
     * This method prints all the shapes that are available to the user
     */
    private static void testAllShapes()
    {
        drawTriangle();
        printBlankLine();
        drawSquare();
        printBlankLine();
        drawDiamond();
        printBlankLine();
        drawLine(15);
        printBlankLine();
        System.out.println("Program Finished.  Thanks for playing.");
    } // testAllShapes
    /**
     * This method prints a square with the given length, which is 5
     */
    private static void drawSquare()
    {
        final int N = 5;
        drawLine(N);
        printBlankLine();
        drawLine(N);
        printBlankLine();
        drawLine(N);
        printBlankLine();
        drawLine(N);
        printBlankLine();
        drawLine(N);
        printBlankLine();
        
    } // drawSquare

    /**
     * This method prints a triangle from using the drawSpaces method,
     *  the drawLine method, and the printBlackLine method
     */
    private static void drawTriangle()
    {
        drawSpaces(2);
        drawLine(1);
        printBlankLine();
        drawSpaces(1);
        drawLine(3);
        printBlankLine();
        drawSpaces(0);
        drawLine(5);
        printBlankLine();

    } // drawTriangle
    /**
     * This method prints an upside down triangle from using the drawSpaces method, 
     * the drawLine method, and the printBlackLine method
     */
    private static void drawUpsideDownTriangle()
    {
        drawSpaces(1);
        drawLine(2);
        printBlankLine();
        drawSpaces(2);
        drawLine(1);
        printBlankLine();
    }//drawUpsideDownTriangle

    /**
     * This method prints a diamond from using some of the other methods, which are 
     * the drawTriangle and drawUpsideDownTriangle methods.
     */
    private static void drawDiamond()
    {
        drawTriangle();
        drawUpsideDownTriangle();
    } // drawDiamond
    /**
     * This method prints spaces to the console
     * @param length the number of spaces to print
     */
    private static void drawSpaces(int length)
    {
        final String SPACE = " ";
        int count = 1;
    
        while (count <= length)
        {
            System.out.print(SPACE);
            count++;
        }
    } // drawLine
    /**
     * This method prints a line to the console
     * @param length the length of the line
     */
    private static void drawLine(int length)
    {
        final char STAR = '*';
        int count = 1;
    
        while (count <= length)
        {
            System.out.print(STAR);
            count++;
        }
    } // drawLine
    /**
     * This method prints a blank line to the console
     */
    private static void printBlankLine() {
        System.out.println();
    } // printBlankLine
    /**
     * This method prints the identification of the student including course name,
     *  name, student number, and assignment number
     */
    private static void printIdentification()
    {
        System.out.println("### Lab 6: Menus   Author: Jay Nguyen  ###");
        System.out.println("### Course/Section - CPSC1150-7 ###");
        System.out.println("### St.# - 100384022 ###\n");
        System.out.println();
    } // printIdentification

    // ----------------------------------------------------------------------
    // The methods defined below are for part 3 of this lab.
    //
    /**
     * This method prints the interactive menu to the console
     */
    private static void interactiveMenu()
    {
        Scanner keyboard = new Scanner(System.in);
            char command = ' '; //initialize command to any other value so I can start the loop
            while (command != EXIT)
            {
                displayMenu(); // display the menu so the user knows what is available
                command = keyboard.next().toUpperCase().charAt(0);
                // get the single letter command while (!isValidInput(command)) 
                // test command to see if it is an invalid letter
                // if so then display an error message
                //displayerrormessage //tellingwhattheusershouldtype
            
                doCommands(command);
            }
            System.out.println("Program Finished.  Thanks for playing.");
    }// interactiveMenu
    /**
     * This method displays the menu to the user
     */
    private static void displayMenu()
    {
        // you'll need to do something here so that I have a menu to use
        
        System.out.println("Your menu goes here");
        System.out.println( "(" + EXIT + ")xit -- Exit the program" );
        System.out.println( "(" + TRIANGLE + ")riangle -- Draw the triangle");
        System.out.println( "(" + SQUARE + ")quare -- Draw the square");
        System.out.println( "(" + DIAMOND + ")iamond -- Draw the diamond");
    } // displayMenu
    /**
     * This method will test the command to see if it is valid or not
     * @param character the command that the user inputs
     * @return true if user inputs 'T', 'S', or 'D', and false if user does not input those 3 characters 
     */
    private static boolean isValidInput(char character)
    {
		
        if(character == 'T'  || character == 'S' || character == 'D'  )
		    return true;
        else
            return (character == EXIT);

    } // isValidInput
    /**
     * This method will do the commands that the user inputs
     * @param command the command that the user inputs
     */
    private static void doCommands(char command)
    {
        
        if (command == EXIT) // test if the command is the EXIT command
        {
            System.out.println("End of program");; // do nothing when you exit
        }
        else
        {    
            if(command == TRIANGLE)
            {
                drawTriangle();
            }
            else if(command == SQUARE)
            {
                drawSquare();
            }
            else if(command == DIAMOND)
             {   
                 drawDiamond();
             }
            else
			    {
                    System.out.println("doCommands method discovered an unknown command: '" + command + "'");
                }
        }
    } // doCommands
    
}