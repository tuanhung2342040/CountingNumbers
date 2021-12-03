public class App {
    public static void main(String[] args) throws Exception {
        int number = 3;
        //count(number);
        //count1(number);
        System.out.println(F1(number));
    }
    private static void count(int number)
    {
        if(number >=0){
            count(number - 1);
            System.out.println(number + " ");
        }
    }
    private static void count1(int number)
    {
        if(number > 0){
            System.out.println(number + " ");
            count1(number - 1);
            System.out.println(number + " ");
        }
        else
            System.out.println(number + " ");
    }
    private static long F1(int n)
    {
        if(n == 0)
            return 1;
        else
            return n * F1(n-1);
    }
    private static double F2(double x, int n)
    {

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
}
