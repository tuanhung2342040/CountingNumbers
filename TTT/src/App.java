import java.lang.annotation.Target;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(factorial(5));
        System.out.println(factorial1(5));
        int index = 0;
        int target = 5;
        while(index <= target)
        {    
            System.out.println(fib(index));
            index++;
        }
        System.out.println(fac(5));
        countDown(5);
           
    }
    private static void countDown(int n)
    {
        if(n == 0)
            System.out.println(n);
        else
        {
            System.out.println(n);
            countDown(n-1);
        }
    }
    // 5! = 5 * 4 * 3 * 2* 1
    private static int fac(int n)
    {
        if(n == 1)
            return 1;
        else
            return n * fac(n-1);
    }
    // fibonacci number
    private static int fib(int n)
    {
        // using recursion: need base case: 
        /*
            n = 5
            fib(3) + fib(4)(2 + 3 = 5)
                    n = 4
                    fib(2) + fib(3)(1 + 2 = 3)
                            n = 3
                            fib(1) + fib(2)( 1 + 1 = 2)
                                    n = 2
                                    fib(0) + fib(1)
                                    0       +    1 = 1
                                            */
        if(n ==0)
            return 0;
        if(n <= 2)
            return 1;
        else
            return fib(n-2) + fib(n-1);
    }
    private static int factorial(int n)
    {
        // base case, recursion calls its method itself
        if(n == 1)
        {
            System.out.println("factorial(" + n + ") = 1");
            return 1;
        }
        else
        {   
            System.out.println("factorial("+ n +") = " + n + " * factorial(" + (n-1) + ")");
            return n * factorial(n-1);
        }
    }
    private static int factorial1(int n)
    {
        int result = 1;
        for(int i = 2; i <= n;i++)
        {
            result = result * i;
        }
        return result;
    }
}
