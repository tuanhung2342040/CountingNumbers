import java.util.Scanner;

// Name: ###########               Student Number: #############
// Course/Section: CPSC ####-#     
// Instructor: #######             Date:           #####
// Assignment/Lab: ###             Last Modified:  #####
//
// Purpose:  This is the skeleton of a "digital" banner program
//

  

public class lab5 {
    public static void main(String[] args) throws Exception 
    {
        printIdentification();
        
        //int user = keyboard.nextInt();
        //printSymbol(user, '*');
        printSymbol(3, '*');
        isPerfectNumber(6);
        System.out.println(faNum(50));
    }
       
        

    /*
O   utputs a single row of characters onto the console. Different values of howMany will produce rows of different lengths.
    @param howMany how many of this symbol should be output
    @param whatSymbol the single symbol to print onto the console
    */
    private static void printIdentification() // put some id on the screen
    {
        System.out.println("Name: Jay Nguyen   Student Number: 100384022 ");
        System.out.println("Course: CPSC 1050-3         Instructor: Bryan Green\n");
        System.out.println("~~~ Lab 5 -  ~~~\n\n");
    } 
    
    private static void printSymbol(int howMany, char symbol)
    {
        int i = 1;

        while(i <= howMany)
        {
            int j = i;
            while(j <= howMany)
            {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k <= i)
            {
                System.out.print(symbol);
                k++;
            }
            i++;
            System.out.println();
        }
    }
    private static boolean isPerfectNumber(int number)
    {
        int i = 1;
        int sum = 0;
        while(i < number)
        {
            if(number % i == 0)
                sum += i;
            i++;
        }
        if(sum == number)
        {
            System.out.println("It's a perfect number");
            return true;
        }
        else
        {
            System.out.println("It's not a perfect number");
            return false;
        }

    }
    private static int faNum(int howMany)
    {
        int firstNum = 0;
        int secondNum = 1;
        int thirdNum;
        int n = 1;
        while(n <= howMany)
        {
            thirdNum = firstNum + secondNum;
            System.out.print(thirdNum);
            firstNum = secondNum;
            secondNum = thirdNum;
            n++;

        }
        return thirdNum;
    }
   

    
    
}
