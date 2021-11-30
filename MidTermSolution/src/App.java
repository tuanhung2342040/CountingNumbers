import java.util.Scanner;

public class App {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        printUpSideDownTriangle(4);
        System.out.println("what number do you want?");
        int number = keyboard.nextInt();
        System.out.println("What digit do you want?");
        int digit = keyboard.nextInt();
        System.out.println(replaceInteger(number, digit));
        
    }
    //an algorithm is a series of instructions
    // telling a computer how to transform a set of facts about the world into useful information. 

    //4D
    private static void printUpSideDownTriangle(int n)
    {
        for(int i = 1; i <= n;i++)
        {
            for(int j = 1; j <= i ; j++)// increasing
            {
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++)// decreasing
            {
                if(i%2 == 0)
                    System.out.print('%');
                else
                    System.out.print('*');
            }
            for(int j = i; j < n; j++)
            {
                if(i%2 == 0)
                    System.out.print('%');
                else
                    System.out.print('*');
            }
            System.out.println();
        }
    }

    //4A
    private static int replaceInteger(int number, int digit)
    {
        int newDigit;
        int newNum = 0;
        int factor = 1;
        while(number!=0)
        {
            newDigit = number%10;
            if(newDigit == digit)
                newDigit = digit;
            else
                newDigit = 0;
            newNum += newDigit*factor;
            factor *=10;

            number/=10;
        }
        return newNum;
    }
    // Write a method to count the number of words in a very long String
    private static int countWords(String s, char c)
    {
        int index = 0;
        int count = 1;
        while(index < s.length())
        {
            if(s.toLowerCase().charAt(index) == 'a' || s.charAt(index + 1) == c)
                count++;
            index++;
        }
        return count;
    }
    private static boolean determineAAndE(String s)
    {
        int index = 0;
        int countE = 0;
        int countA = 0;
        while(index < s.length())
        {
            if(s.toLowerCase().charAt(index) == 'a')
                countA++;
            if 
        }
    }
    //Write a program that will ask for two names and then determine whether they sound the same based on the Soundex encoding scheme 
    
    
    
}
