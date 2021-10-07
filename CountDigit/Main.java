import java.util.Scanner;


public class CountDigit(){
	public static void main(String[] args){

        int number;
        int digit;
        int numDigits = 0;
        int originalNumber = number;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");
        number = keyboard.nextInt();

        if(number < 0)
            number = -number;
        if(number == 0)
            numDigits++;
        else
        {
            while(number != 0)
            {
                
                number /= 10;//number = number /10;
                numDigits++;
                
            }
        }
            System.out.println("The number of digits in " + originalNumber + "is" + numDigits);
     
    }
}

