import java.util.*;

public class App {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       /* int number = 37912;
        System.out.println("What position do you want?");
        int position = keyboard.nextInt();
        // position: how many times that the number divide
        int answer = extract(number, position);
        
        System.out.println(i);*/
        for (int i = 1000; i <= 9999; i++){
            int n = i;
            int remandier1, remandier2,finalanswer;
            double result1=0;
            while(n <=9999){
                remandier1 = n % 100;
                remandier2 = n /100;
                finalanswer = remandier1 + remandier2;
                result1 = Math.pow(finalanswer, 2);
                n++;
            }
            if (result1 == n){
                System.out.println(i);
            }
        }
    }
    /*
        	Write a method to extract a particular digit from a number
		Extract(37912, 3) --> 7
		Extract(37912, 2) --> 9
		Extract(37912, 0) --> 2
		
		37912 divided by 10
		3791 /10
		379 % 10 = 9

    */
    private static int extract(int number, int position)
    {
        while(position > 0)
        {
            number/=10;
            position--;
        }
        return number % 10;
    }
}
