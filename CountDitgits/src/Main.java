import java.util.Scanner;



public class CountDigits {

    public static void main(String args[]){
        
        int NUMBER;
        int DIGIT;
        int NUM_DIGITS;

        System.out.println("Please enter your number");
        Scanner scan = new Scanner(System.in);
        NUMBER = scan.nextInt();
        NUM_DIGITS = 0;
        if (NUMBER < 0){
            NUMBER = -NUMBER;
        }
        while(NUMBER != 0){
            DIGIT = NUMBER % 10;
            NUM_DIGITS = NUM_DIGITS + 1;
            NUMBER = NUMBER/10;
        }
        System.out.println("The number of digits are: " + NUM_DIGITS);

        



    }
    
}
