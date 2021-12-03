import java.util.Arrays;
import java.util.Scanner;

public class MasterMind {
    static int totalGuesses = 0;
    static boolean cheatMode = false;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        printInstructions();
        int[] secretNum = new int[2];
        getARandomNumber(secretNum);
        int[] guess = new int[2];
        compareTwoNumbers(secretNum, guess);

    }
    /**
     * get a random number from 10 to 99
     * @return a random num for computer
     */
    private static int randomNum()
    {
        double random = (Math.random()*90) + 10;
        int randomInt = (int)random;
        return randomInt;
    }
    /**
     * get a random and store it into an integer array
     * @param secretNum  the array that contains the random number
     * @return array that contains the random number
     */
    private static int[] getARandomNumber(int[] secretNum)
    {
        int num;
        num = randomNum();
        for(int i = secretNum.length - 1; i >= 0; i--)
        {
            int temp = num % 10;
            secretNum[i] = temp;
            num /= 10;
        }
        return secretNum;
    }
    /**
     * to check if the user inputs the valid number or not
     * @param guess the number that user enters
     * @return false if the user chooses from 10 to 99, otherwise true
     */
    private static boolean isInvalidInput(int guess)
    {
        if(guess >= 10 && guess <100)
            return false;
        return true;
    }
    /**
     * get the input of the user
     * @param guess the array that contains user's input
     * @return the array that contains the number
     */
    private static int[] getGuess(int[] guess)
    {
        System .out.println("Enter your guess.......");
        int input = scanner.nextInt();
        while(isInvalidInput(input)){
            System.out.println("This is an invalid input, pls try again!");
            System.out.println("Pls enter the right number is from 10 to 99");
            input = scanner.nextInt();  
        }
        for(int i = guess.length-1; i >=0; i--)
            {
                int temp = input % 10;
                guess[i] = temp;
                input /= 10;

            }
        return guess;

    }
    /**
     * check if two digits are unique or not
     * @param secretNum the array that contains the secret number
     * @return  true if the two digits are unique, otherwise false
     */
    private static boolean uniqueDigits(int[] secretNum)
    {
        if(secretNum[0] == secretNum[1])
            return false;
        return true;
    }
    /**
     * check if the user's guess is correct or not
     * @param secretNum the array that contains the secret number
     * @param guess the array that contains the user's guess
     * @return true if the user's guess is correct, otherwise false
     */
    private static boolean checkIfEqual(int[] secretNum, int[] guess)
    {
        if(Arrays.equals(secretNum, guess))
            return true;
        return false;
    }
    /**
     * compare the two numbers and print the result
     * @param secretNum the array that contains the secret number
     * @param guess the array that contains the user's guess
     */
    private static void compareTwoNumbers(int[] secretNum, int[] guess)
    {
        int count = 0;
        while (count < 10 && secretNum != guess )
        {
            getGuess(guess);
            totalGuesses++;
            cheatMode(secretNum);
            if(checkIfEqual(secretNum, guess))
            {
                System.out.println("Your guess is correct");
                break;
            }
            else
            {
                int wrongDigits = 0;
                int rightDigitButWrongPlace = 0;
                int rightDigit = 0;
                if(guess[0] == secretNum[0] || guess[1] == secretNum[1])
                {
                    System.out.println("You have one right digit");
                    rightDigit++;
                }
                else if(guess[0] == secretNum[1] || guess[1] == secretNum[0])
                {
                    System.out.println("You have one right digit, but it is in different position");
                    rightDigitButWrongPlace++;
                }
                else
                {
                    System.out.println("You have no right digits, pls try again");
                    wrongDigits++;
                }
                System.out.println("Total right digits: " + rightDigit);
                System.out.println("Total right digits in different position: " + rightDigitButWrongPlace);
                System.out.println("Total wrong: " + wrongDigits);
            }
            count++;
        }
        if(count == 10)
            System.out.println("You have no guesses left");
        System.out.println("You took " + totalGuesses + " guesses to find the correct answer");
    }
    /**
     * if the user chooses cheat mode, the computer will print the secret number
     * if the user doesn't choose cheat mode, the computer will not print the secret number
     * @param secretNum the array that contains the secret number
     */
    private static void cheatMode(int[] secretNum)
    {
        if(isCheatModeOn()){
            System.out.println("The number you are looking for is ");
            System.out.println(Arrays.toString(secretNum));
        }
    }
    /**
     * check if the user wants to use cheat mode or not
     * @return  true if the user wants to use cheat mode, otherwise false
     */
    private static boolean isCheatModeOn()
    {
        System.out.println("Press Y if you wan to get help, other keys if you don't need help");
        char support = scanner.next().charAt(0);
        if(support == 'Y' || support == 'y')
            return true;
        return false; 
    }
    /**
     * print the instructions
     */
    private static void printInstructions()
    {
        System.out.println("Welcome to MasterMind Game with Numbers");
        System.out.println("You have 10 guesses in tolal, and you have to guess at least two times");
        System.out.println("If you guess a correct digit but in the wrong place, the program will print a message.");
        System.out.println("If you guess a number in its right place, the program will print a message");
        System.out.println("Good luck!! and Have fun!!!");
        System.out.println("Let's get started!");
        System.out.println("You can only enter values from 10 to 99");
    }


     
}
