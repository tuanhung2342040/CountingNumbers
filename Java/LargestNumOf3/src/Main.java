import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int num1;
        int num2;
        int num3;
        int largestNum;

        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        largestNum = num1;
        if(num1 < num2){
            largestNum = num2;
        }
        if(num2 < num3){
            largestNum = num3;
        }

        System.out.println("The largest num is: " + largestNum);



    }
}
