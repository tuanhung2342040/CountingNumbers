import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * int number = 3;
         * count(number);
         * System.out.println(factorial(number));
         * int n = 8;
         * System.out.println(fib(n));
         * double[] list = {1, 5, 3, 10, 6, 11, 2};
         * int start = 0;
         * int end = list.length;
         * double target = 11;
         * System.out.println("The index of " + target + " is: ");
         * System.out.println(binarySearch1(list, target, start, end));
         * System.out.println(binarySearch2(list, target, start, end));
         
        int[] arr = { 1, 2, 3 };
        printSS(arr);*/
        //String a = "abcd";
        //String b = "efgh";
        //int n = 2;
        //System.out.println(interleave(a, b, n));
        count(3);
        System.out.println();
        count1(3);
        

    }

    private static String interleave(String s1, String s2, int n) {
        String result = "";
        if (s1.length() == 0) {
            return s2;
        }
        if (s2.length() == 0) {
            return s1;
        } else {
            for (int i = 0; i < s1.length() / n; i++) {
                result += s1.substring(i, n) + s2.substring(i, n);
                result += s1.substring(i + n, n + n) + s2.substring(i + n, n + n);
            }
        }
        return result;

    }

    private static void count(int number) {
        if (number < 0) {
            System.out.print("Done ");
        }
        else{
            System.out.print(number + " ");
            count(number - 1);
            System.out.print(number + " ");
        }
    }

    private static void count1(int number) {
        if (number >= 0) {
            System.out.print(number + " ");
            count1(number - 1);
            System.out.print(number + " ");
        } else
            System.out.print(number + " Done ");
    }

    private static long F1(int n) {
        if (n == 0)
            return 1;
        else
            return n * F1(n - 1);
    }
    private static double F2(double x, int n){
        if(n == 0)
            return 0;
        else
            return x + F2(x,n-1);
    }

    private static int F4(int n) {
        if (n == 0)
            return 0;
        else
            return F4(n / 10) + n % 10;
    }

    private static int F3(int n) {
        if (n < 2)
            return 0;
        else
            return 1 + F3(n / 2);
    }
    private static int F10(int num1, int num2){
        if(num1 > num2)
            return 0;
        else if(num2 == num1+1)
            return 1;
        else
            return F10(num1+1,num2-1) + 2;
    }
    
    private static double factorial(int n) {
        if (n <= 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    private static long fib(int n) {
        if (n < 2)
            return n;
        else
            return fib(n - 1) * fib(n - 2);
    }

    private static int binarySearch1(double[] list, double target, int start, int end) {
        while (start < end) {
            int middle = (start + end) / 2;
            if (list[middle] == target)
                return middle;
            else if (list[middle] > target)
                end = middle;
            else
                start = middle + 1;
        }
        return -start - 1;
    }// while loop

    private static int binarySearch2(double[] list, double target, int start, int end) {
        if (start >= end)
            return -start - 1;
        int middle = (start + end) / 2;
        if (target == list[middle])
            return middle;
        if (list[middle] > target)
            return binarySearch2(list, target, start, end);
        else
            return binarySearch2(list, target, middle + 1, end);
    }// recursion
     // subsets int n; 2^n

    public static void printSS(int arr[]) {
        int limit = (int) Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            String st = "";
            int temp = i;
            for (int j = 0; j < arr.length; j++) {
                int r = temp % 2;
                temp = temp / 2;
                if (r == 0)
                    st += "-\t";
                else
                    st += arr[j] + "\t";
            }
            System.out.println(st);
        }
    }
    // Write a method to read and return a single integer read from a Scanner passed as parameter
    private static int readInteger(Scanner input)
    {
        int value = input.nextInt();
        return value;
    }
    // Write a method to output the sum all real numbers from a Scanner passed as parameter
    private static double sum(Scanner input)
    {
        double sum = 0;
        for(int i = 0; i < 5;i++)
        {
            System.out.println("Number " + i + " is: ");
            double value = input.nextDouble();
            sum += value;
        }
        return sum;
    }
    private static double sumDouble(Scanner input)
    {
        double sum = 0;
        while(input.hasNext())
        {
            if(input.hasNextDouble())
            {
                double value = input.nextDouble();
                sum += value; 
            }
            else
            {
                input.next();
            }
        }
        return sum;
    }
    // Write a method to read and return three strings read from a Scanner passed as a parameter
    private static String[] readStrings(Scanenr input)
    {
        String[] values = new String[3];
        values[0] = input.next();
        values[1] = input.next();
        values[1] = input.next();
        return values;
    }
    // Write a program that will draw a histogram of the lengths of the words in this sentence

}
