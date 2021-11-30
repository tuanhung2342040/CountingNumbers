import java.util.Arrays;
import java.util.Scanner;
/** 
 * Name: Jay Nguyen              Student Number: 100384022
 * Course/Section: CPSC 1150-#   
 * Instructor: Bryan Green             Date:           Nov, 17, 2021
 * Assignment/Lab: 9             Last Modified: N   Nov, 24, 2021  
 * Purpose:Searching and sorting

*/
public class App {
    static Scanner keyboard = new Scanner(System.in);
    static int numberOfComparisons = 0;
    public static void main(String[] args) throws Exception {
        //printArray(10);
        /*int size = 10;
        double[] a = randomArray(size);
        printArray(a);
        double [] list = {1, 52, 3, 10, 90, 7, 12};
        System.out.println("What is the start?");
        int start = keyboard.nextInt();
        System.out.println("What is the end?");
        int end = keyboard.nextInt();
        selectionSort(list, start, end);*/

        //double [] list = {5, 4, 3, 10, 6, 7, 12};
        int size = getSize();
        double[] list = randomArray(size);
        int start = getStart();
        int end = getEnd(size);
        //int target = getTarget();
        printArray(list);
        System.out.println();
        //System.out.println("The size of the array is: " + size);
        //System.out.print("The index of " + target + " is: ");
        //System.out.println(linearSearch(list, target, start, end));
        //System.out.println("The number of comparisons is: " + numberOfComparisons);
        //System.out.println();
      

        //System.out.print("The index of " + target + " is: " );
        //int index = binarySearch(list, target, start, end);
        //System.out.println(Arrays.toString(ascendingOrder(list)));
        //System.out.println("The size of the array is: " + size);
        //System.out.println("The index of " + target + " is: " + index);
        //System.out.println("The number of comparisons is: " + numberOfComparisons);
        System.out.println("The array before sorting: ");
        System.out.println(Arrays.toString(list));
        System.out.println("The array after sorting:" );
        selectionSort(list, start, end);
        System.out.println("The number of comparisons is: " + numberOfComparisons);
        
        
        
    }
    private static void printIdentification()
    {
        System.out.println("### Lab 9: Menus   Author: Jay Nguyen  ###");
        System.out.println("### Course/Section - CPSC1150-7 ###");
        System.out.println("### St.# - 100384022 ###\n");
        System.out.println();
    } // printIdentification
    private static double getRandomNums()
    {
        double a = Math.random()*40;
        a = Math.round(a * 1)/1.0;
        return a;
    }
    private static double[] randomArray(int size)
    {
        double[] numIn = new double[size];
        for(int i = 0; i < size;i++)
        {   
            numIn[i] = getRandomNums();
        }
        return numIn;
    }
    private static void printArray(double[] numbers){
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = randomArray(numbers.length)[i];
            System.out.printf("%5.1f%s", numbers[i], ",");
        }
        System.out.println("]");
    }
    private static int linearSearch (double[] list, double target,
                                          int start,
                                          int end)
    {
        for(int i = start; i < end; i++)
        {
            numberOfComparisons++;
            if(list[i] == target)
                return i; 
        }
        
        return -1;
    }
    private static void swap(double smallest, double index)
    {
        double temp = index;
        index = smallest;
        smallest = temp;

    }
    private static void selectionSort (double[] list, int start, int end)
    {
        for(int i = start; i < end - 1; i++)
        {
            int smallest = i;
            for(int j = i + 1; j < end;j++)
            {
                numberOfComparisons++;
                if(list[smallest] > list[j])
                    smallest = j;
            }
            double temp = list[i];
            list[i] = list[smallest];
            list[smallest] = temp;
            //swap(list[smallest], list[i]);
        }  
        System.out.println(Arrays.toString(list));
       // swap(list[i], list[smallest]); 
    }
    private static double[] ascendingOrder(double[] list)
    {
        Arrays.sort(list);
        return list;
    }
    private static int binarySearch (double[] list, double target,
                                          int start,
                                          int end)
    {
        ascendingOrder(list);
        while(start < end)
        {
            int middle = (start + end)/2;
            if(target == list[middle])
            {
                numberOfComparisons++;
                return middle;
            }
            else if(target < list[middle])
            {
            numberOfComparisons++;
                end = middle;
            }
            else
            {
                numberOfComparisons++;
                start = middle + 1;
            }
        }
        return -start-1;
    } 
    private static boolean isIllvalidStart(int start)
    {
        if(start == 0)
            return false;
        return true;
    }
    private static int getStart()
    {
        System.out.println("Pls enter the start...");
        int start = keyboard.nextInt();
        while(isIllvalidStart(start))
        {
            System.out.println("This is the wrong input");
            System.out.println("Pls try again!!");
            start = keyboard.nextInt();
        }
        return start;
    }
    private static boolean isIllvalidEnd(int end, int size)
    {
        if(end == size)
            return false;
        return true;
    }
    private static int getEnd(int size)
    {
        System.out.println("Pls enter the end...");
        int end = keyboard.nextInt();
        while(isIllvalidEnd(end, size))
        {
            System.out.println("This is the wrong input");
            System.out.println("Pls try again!!");
            end = keyboard.nextInt();
        }
        return end;
    }
    private static int getSize()
    {
        int size;
        System.out.println("How big do you want the array is?");
        return size = keyboard.nextInt();
    }
    private static int getTarget()
    {
        int target;
        System.out.println("What is the target??");
        return target = keyboard.nextInt();
    }

}
