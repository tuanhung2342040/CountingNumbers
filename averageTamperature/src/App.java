import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class App {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("How many days in a month?");
        int days = getDaysInMath();
        double values = getTempDate(days);
        System.out.println(competeAverageTemp(values));
    }
    private static void competeAverageTemp(double [] temp)
    {
        double average = 0;
        double sum = 0;
        
        for(int i = 1; i <= temp.length; i++)
        {
            sum += temp[i];
        }
        average = sum/temp.length;
        System.out.println(average);
    }
    private static int getDaysInMath()
    {
        int days = keyboard.nextInt();
        return days;
    }
    private static double getTempDate(int days)
    {
        int index = 1;
        double[] temp = new double[days + 1];

        while(index <= temp.length)
        {
            System.out.println("what is the temp of day " + index + " ?");
            temp[index] = keyboard.nextDouble();
            index++;
        }
        return temp;
    }
    
    /**
     * index = 0;
     * while(index < temp.length)
     * {
     *  sysout ("What is the tem of the day " + index + "");
     * tem[index] = keyboard.nextDouble()
     * index++
     * }
         * int day = 0;
         * while(day < temp.length)
         * {
         * average += temp[day];
         * }
         */

    
}
