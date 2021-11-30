import java.util.Scanner;
/** 
 * Name: Jay Nguyen              Student Number: 100384022
 * Course/Section: CPSC 1150-003   
 * Instructor: Bryan Green             Date:           Nov, 5, 2021
 * Assignment/Lab: 4             Last Modified: Nov, 11, 2021  
 * Purpose:accept commands from the user to draw a single filled-in rectangle 
 * within the positive Cartesian quadrant
*/
public class App {
    static Scanner keyboard = new Scanner(System.in);
    private static final int MAX_X = 40;
    private static final int MIN_X = 0;
    private static final int MIN_Y = 0;
    private static final int ROW = 20;
    private static final int COLUMN = 44;
    public static void main(String[] args) throws Exception {
        printIdentification();
        int x = getInputX();
        int y = getInputY();
        drawRecAndY(x, y);
        drawXAxis();
        drawXAxisNum();
    }
    private static void printIdentification()
    {
        System.out.println("### Lab 6: Menus   Author: Jay Nguyen  ###");
        System.out.println("### Course/Section - CPSC1150-003 ###");
        System.out.println("### St.# - 100384022 ###\n");
        System.out.println();
    } // printIdentification
    /**
     * draw the y axis and the rectangle within the positive Cartesian quadrant
     * @param x the x value of the rectangle
     * @param y the y value of the rectangle
     */
    private static void drawRecAndY(int x, int y)
    {
        drawThreeSpaces();
        System.out.println("^");

        for(int i = 0;i < ROW;i++)
        {
            for(int j = 0;j < COLUMN;j++)
            {
                if(j==0 && i == 0)
                    System.out.print(2);
                else if(j==0 && i == 5)
                    System.out.print(1);
                else if(j==0 && i == 10)
                    System.out.print(1);
                else if(j==1 && i == 0)
                    System.out.print(0);
                else if(j==1 && i == 10)
                    System.out.print(0);
                else if(j==1 && (i == 5 || i == 15))
                    System.out.print(5);
                else if(j==3 && (i % 5 == 0))
                    drawPlus();
                else if(j==3)
                    drawVerticalbar();
                else if (j==0)
                    drawASpace();
                else
                {
                    if(i == y && j == x + 3)
                        drawALine();
                    else if(i == y + 1 && j == x + 3)
                        drawALine();
                    else if (i == y + 2 && j == x + 3)
                        drawALine();
                    else if(i == y + 3 && j == x + 3)
                        drawALine();
                    else if(i == y + 4 && j == x + 3)
                        drawALine();
                    else if(i == y + 5 && j == x + 3)
                        drawALine();
                    else if(i == y + 6 && j == x + 3)
                        drawALine();
                    else
                    {
                        drawASpace();
                    }
                    
                }
            }
            System.out.println();
        }
        System.out.print(" " + MIN_Y +  " +");
    }
    private static void drawASpace()
    {
        System.out.print(" ");
    }
    private static void drawALine()
    {
        int n = 4;
        for(int i =0; i < n; i ++)
        {
            System.out.print("*");
        }
    }
    private static void drawPlus()
    {
        System.out.print('+');
    }
    private static void drawVerticalbar()
    {
        System.out.print("|");
    }

    private static void drawThreeSpaces()
    {   
        System.out.print("   ");
    }
    private static void drawEqual()
    {
        System.out.print("=");
    }
    private static void drawXAxis()
    {  
        for(int i = 1;i <= MAX_X;i++)
        {
            if(i%5 == 0)
                drawPlus();
            else
                drawEqual();
        }
        System.out.println('>');
    }
    private static void drawXAxisNum()
    {
        System.out.printf("%4d", MIN_X);
        for(int i = 5; i <= MAX_X; i+=5)
        {
            System.out.printf("%5d", i);
        }
    }
    /**
     * get the x value of the rectangle
     * @return the x value of the rectangle
     */
    private static int getInputX()
    {
        System.out.println("Pls enter x from 1-37");
        int x = keyboard.nextInt();
        //assume illegal
        while(isInvalidX(x))
        {
            System.out.println("This is too large to put the rectangle into the Cartesian quadrant");
            System.out.println("Pls enter x from 1-37");
            x = keyboard.nextInt();
        }
        return x;
    }
    /**
     * get the y value of the rectangle
     * @return the y value of the rectangle
     */
    private static int getInputY()
    {
        System.out.println("Pls enter y from 0-13");
        int y = keyboard.nextInt();
        //assume illegal
        while(isInvalidY(y))
        {
            System.out.println("This is too large to put the rectangle into the Cartesian quadrant");
            y = keyboard.nextInt();
        }
        return y;
    }
    /**
     * check if the x value is invalid
     * @param x the x value to be checked
     * @return true if the x value is invalid, false if is valid
     */
    private static boolean isInvalidX(int x)
    {
        if(x > 0 && x <= 37)
            return false;
        return true;
    }
    /**
     * check if the y value is invalid
     * @param y the y value to be checked
     * @return true if the y value is invalid, false if is valid
     */
    private static boolean isInvalidY(int y)
    {
        if(y >= 0 && y <= 13)
            return false;
        return true;
    }
}
