public class App {
    public static void main(String[] args) throws Exception {
        /*int number = 3;
        count(number);
        System.out.println(factorial(number));
        int n = 8;
        System.out.println(fib(n));
        double[] list = {1, 5, 3, 10, 6, 11, 2};
        int start = 0;
        int end = list.length;
        double target = 11;
        System.out.println("The index of " + target + " is: ");
        System.out.println(binarySearch1(list, target, start, end));
        System.out.println(binarySearch2(list, target, start, end));*/
        char a = 'Z';
        System.out.println(Character.isAlphabetic(a));
        int b = a;
        System.out.println(b);

    }

    private static void count(int number)
    {
        if(number >=0){
            count(number - 1);
            System.out.print(number + " ");
        }
    }
    private static void count1(int number)
    {
        if(number > 0){
            System.out.print(number + " ");
            count1(number - 1);
            System.out.print(number + " ");
        }
        else
            System.out.print(number + " ");
    }
    private static long F1(int n)
    {
        if(n == 0)
            return 1;
        else
            return n * F1(n-1);
    }

    private static int F4(int n)
    {
        if(n == 0)
            return 0;
        else
            return F4(n/10) + n%10;
    }
    private static int F3(int n){
        if(n < 2)
            return 0;
        else
            return 1 + F3(n/3);
    }
    private static double factorial(int n){
        if(n <= 0)
            return 1;
        else
            return n * factorial(n-1);
    }
    private static long fib(int n)
    {
        if(n < 2)
            return n;
        else 
            return fib(n-1)* fib(n-2);
    }
    private static int binarySearch1(double[] list, double target, int start, int end){
        while(start < end)
        {
            int middle = (start + end)/2;
            if(list[middle] == target)
                return middle;
            else if(list[middle] > target)
                end = middle;
            else
                start = middle + 1;
        }
        return -start-1;
    }//while loop
    private static int binarySearch2(double[] list, double target, int start, int end){
        if(start >= end)
            return -start-1;
        int middle = (start + end)/2;
        if(target == list[middle])
            return middle;
        if(list[middle] > target)
            return binarySearch2(list, target, start, end);
        else
            return binarySearch2(list, target, middle + 1, end);
    }// recursion
    // subsets int n; 2^n
    

}
