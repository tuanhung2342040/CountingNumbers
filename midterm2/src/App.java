import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner keyboard = new Scanner(System.in);
    static String allCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String noCaps =  "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) throws Exception {
        //1
        int[] age = {20, 16, 30, 40, 51, 19, 21};
        System.out.println("The average age is " );
        System.out.println(computeAverage(age));
        System.out.println("The median is: " + medianValue(age));
        //2
        System.out.println("the fourth largest value in the array is ");
        System.out.println(fourthLargest(age));
        //3
        String s = "silly words.  12 of them.";
        int key = getEncryptionShift();
        System.out.println(caesarEncrypt(s, key));

        //4 
        String original = "race car"; // race car, nurses run, mom, dad
        System.out.println("Is " + original + " palindrome: " + isPalindrome(original));
        //5
        int number = 11211;
        System.out.println("is " + number + " palindrome: " + isPalindromeNum(number));
        //6
        int num = 89;
        System.out.println("The next series number is: " + sumSquares(num));
        //7 find distinct chacters in a string
        String word = "ABcdabcd";
        System.out.println(findDistinctCha(word));
        System.out.println("The number is: " + numDistinctCha(word));
        System.out.println(distinctChaInsensitive(word));
        //8) chacters that are not in second string
        String a = "abba";
        String b = "bill";
        System.out.println("Chacters that are not in second string: "+ thirdString(a, b));
        //9 The number of characters that are not in second string
        System.out.println("The number of characters that are not in second string: " + numCharacterNotInSecond(a, b));
        
        //10
        System.out.println("Chacters that are not in second string: "+ thirdStringDistinct(a, b));
    }
    //1) Write a method that computes the average of an array of integers.
    //a.A harder version of this problem is to return the median instead
    private static double computeAverage(int[] age)
    {
        double sum = 0;
        for(int i = 0; i < age.length;i++)
        {
            sum += age[i];
        }
        return sum/age.length;
    }
    private static int medianValue(int[] age)
    {
        Arrays.sort(age);
        return age[age.length/2];
    }
    // 2) write a method that returns the 4th largest
    // of an array of integers
    private static int fourthLargest(int[] age)
    {
        int[] age1 = new int[age.length];
        for(int i = 0; i < age1.length;i++)
        {
            age1[i] = age[i];
        }
        // using sort arrange the array: and then take fourth element from the right
        Arrays.sort(age1);
        return age1[age1.length - 4];
    }
    //3 ) rite a methodthat will encrypt a string using the Caesar encryption method.  
    //The encryption method requires a key (an integer between 0 and 25 or -1 to -25). 
    //This key is the amount to shift each letter in the string; other symbols remain unaffected. 
    //For example, if the string were “silly words.  12 of them.” and the key were 2 then the encrypted string
    //would be “uknna yqtfu.  12 qh vjgo.” Notice that if the shift goes beyond the letter ‘z’ then you wrap around to ‘a’ aga
    private static String caesarEncrypt(String words, int shift){
        String encryptedString = "";
        words = words.toLowerCase();
        int originalLetterIndex; 
        int shiftedLetterIndex = 0;
        for (int i = 0; i < words.length(); i++){            
            if (allCaps.contains("" + words.charAt(i)) || noCaps.contains("" + words.charAt(i))){
                originalLetterIndex = (noCaps.indexOf("" + words.charAt(i)));
                if (originalLetterIndex + shift >= 26){
                    shiftedLetterIndex = originalLetterIndex + shift - 26;//1) get the new index, 2)encryptString
                }else{
                    shiftedLetterIndex = originalLetterIndex + shift;
                }
                if (allCaps.contains("" + words.charAt(i))){
                    encryptedString += allCaps.charAt(shiftedLetterIndex);
                }else{
                    encryptedString += noCaps.charAt(shiftedLetterIndex);
                }                
            }else{
                encryptedString += words.charAt(i);
            }
        }
        return encryptedString;
    }
    private static String encrypt(String words, int shift)
    {
        String encryptString = "";
        int originalLetterIndex;
        int shiftedLetterIndex = 0;
        for(int i = 0; i < words.length();i++)
        {
            if(noCaps.contains("" + words.charAt(i)) || allCaps.contains("" + words.charAt(i)))
            {
                originalLetterIndex = (noCaps.indexOf("" + words.charAt(i)));
                if(originalLetterIndex + shift >= 26)
                {
                    shiftedLetterIndex = originalLetterIndex + shift - 26;
                }
                else
                {
                    shiftedLetterIndex = originalLetterIndex + shift;
                }
                if(allCaps.contains("" + words.charAt(i)))
                {
                    encryptString += allCaps.charAt(shiftedLetterIndex);
                }
                else
                {
                    encryptString +=  noCaps.charAt(shiftedLetterIndex);
                }

            }
            else
            {
                encryptString += words.charAt(i);
            }
        }
        return encryptString;

    }
    
    private static boolean isValid(int shift)
    {
        if(shift >= -25 && shift <=25)
            return false;
        return true;
    }
    private static int getEncryptionShift(){
    
        System.out.println("How much would you like to shift the letters by? (value must be between -25 and 25)");
        int shift = keyboard.nextInt();

        //assume illegal
        while(isValid(shift))
        {
            System.out.println("This is an invalid input");
            System.out.println("value must be between -25 and 25");
            shift = keyboard.nextInt();
        }
        return shift;
    }
    // 4 palindrome: Write a method that returns true if a string is a palindrome, false otherwise.
    private static boolean isPalindrome(String original)
    {
        original = original.replaceAll(" ", "");
        String reverse = "";
        for(int i = original.length()-1; i >= 0; i--)
        {
            reverse += original.charAt(i);
        }
        for(int i = 0; i < original.length();i++)
        {
            if(original.charAt(i) != reverse.charAt(i))// if(original.charAt(i) != original.charAt(original.length() - 1 - i))
                return false;
        }
        return true;

    }
    // 5 Write a method that determines if a number is a palindrome/ do not use strings

    private static boolean isPalindromeNum(int num)
    {
        int temp = num;
        int reverse = 0;
        //if(num < 0 || num != 0 && num % 10 == 0)
            //return false;
        while(temp != 0)
        {  
            int pop = temp % 10;
            reverse = (reverse * 10) + pop;
            temp /= 10;
        }
        if(reverse == num)
            return true;
        return false;
        
    }
    //Write a method that will compute the next value in a funny mathematical series.
    //The next value in the series is the sum of the squares of the digits of the current value in the series
    private static int sumSquares(int num)
    {
        int square = 0;//num 89
        while(num > 0)
        {
            int pop = num % 10;//9
            square += pop * pop;//9*9
            num /= 10;//89/10 =9
        }
        return square;
    }
    // 7
    private static String findDistinctCha(String a)
    {
        String distinctChar = "";
        for(int i = 0; i < a.length();i++)
        {
            if(!(distinctChar.contains("" + a.charAt(i))))
                distinctChar += a.charAt(i);
        }
        return distinctChar;
    }
    private static int numDistinctCha(String a)
    {
        String distinctChar = "";
        for(int i = 0; i < a.length();i++)
        {
            if(!(distinctChar.contains("" + a.charAt(i))))
                distinctChar += a.charAt(i);
        }
        return distinctChar.length();
    }
    private static String distinctChaInsensitive(String a)
    {
        String distinctString = "";
        a = a.toLowerCase();
        for(int i = 0; i < a.length(); i++)
        {
            if(!(distinctString.contains("" + a.charAt(i))))
                distinctString += a.charAt(i);
        }
        return distinctString;
    }

    //8) Write a method that accepts two strings as parameters and returns a third string containing the characters that are in the first string but not in the second
    private static String thirdString(String first, String second)
    {
        String notInSecond = "";
        for(int i = 0; i < first.length(); i++)
        {
            if(!second.contains("" + first.charAt(i)))     // convert char to string by adding ""        
                notInSecond += first.charAt(i);
        }
        return notInSecond;
    }
    //9
    private static int numCharacterNotInSecond(String first, String second)
    {
        String notInSecond = "";
        for(int i = 0; i < first.length();i++)
        {
            if(!second.contains("" + first.charAt(i)))
                notInSecond += first.charAt(i);
        }
        return notInSecond.length();
    }
    private static String thirdStringDistinct(String first, String second)
    {
        String notInSecond = "";
        for(int i = 0; i < first.length(); i++)
        {
            if(!second.contains("" + first.charAt(i)))  
                if(!(notInSecond.contains("" + Character.toLowerCase(first.charAt(i)))))   // convert char to string by adding ""        
                notInSecond += first.charAt(i);
        }
        return notInSecond;
    }
    
    private static int getLength()
    {
        System.out.println("How many integers would you like your array to contain?");
        while(!keyboard.hasNextInt())
        {
            System.out.println("This is an invalid input");
        }
        return keyboard.nextInt;
    }
    private static int getIntegers()
    {
        System.out.println("Enter an integer: ");
        while(!keyboard.hasNextInt)
        {
            System.out.println("This is in invalid integer: Please enter again");
        }
        return keyboard.nextInt;
    }
    private static int[] fillArray(int[] numbers)
    {
        for(int i = 0; i < numbers.length;i++)
        {
            numbers[i] = getIntegers();
        }
        return numbers;
    }
}
