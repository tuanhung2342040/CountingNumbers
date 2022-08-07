import java.util.Scanner;

// Name: ###########               Student Number: #############
// Course/Section: CPSC ####-#     
// Instructor: #######             Date:           #####
// Assignment/Lab: ###             Last Modified:  #####
//
// Purpose:  This is the skeleton of a "digital" banner program
//

  

public class App {

    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
        printIdentification();
        System.out.println("How many lines do you want to print out?");
        int user = keyboard.nextInt();
        printSymbol(user, '*');
        System.out.println("What number do you want to find if if is a perfect number?");
        int number = keyboard.nextInt();
        isPerfectNumber(number);
        System.out.println("How many fibonacci numbers do you want to see?");
        int howMany = keyboard.nextInt();
        fibonacciaNumber(howMany);
        System.out.println();
        System.out.println("what number do you want to check?");
        int n = keyboard.nextInt();
        System.out.println("The largest digit that comes in a pair is: " + adjacentPair(n));
        
    }
    public static boolean SameDigits(int num) {
        int add = 0, add2 = 0;
    
        while (num > 0) {
            add = add + num % 10;
            add2 = add2 + add % 10;
            num = num / 10;
        }
        if (add == add2) {
            return true;
        } else {
            return false;
        }
    
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
    private static int adjacentPair(int number)
    {
        int remainder1;
        int remainder2;
        int largest = 0;
        int temp;

        while(number!=0)
        {
            remainder1 = number % 10;
            temp = number/10;
            remainder2 = temp%10;
            if(remainder2 > largest && remainder1 == remainder2 ) 
            largest = remainder2;
            number/=10;
            
        }
        
        return largest;
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
    private static void fibonacciaNumber(long howMany)
    {
        long firstNum = 0;
        long secondNum = 1;
        long thirdNum;
        long n = 1;
        while(n <= howMany)
        {
            thirdNum = firstNum + secondNum;
            System.out.print(thirdNum +"\t");
            firstNum = secondNum;
            secondNum = thirdNum;
            n++;

        }
    
    }

    
    
}
