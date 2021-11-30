import java.util.Scanner;

/** 
 * Name: Jay Nguyen              Student Number: 100384022
 * Course/Section: CPSC 1150-#   
 * Instructor: Bryan Green             Date:           Oct, 27, 2021
 * Assignment/Lab: 2             Last Modified: Oct, 30, 2021  
 * Purpose:The purpose is to ask for two names and then determine whether
 *  they sound the same based on the Soundex encoding scheme 

*/

public class App {
    static Scanner keyboard = new Scanner(System.in);
    final static String EXIT = "Exit";
    public static void main(String[] args) throws Exception 
    {
        boolean keepAsking = true;
        while(keepAsking)
        {
            System.out.println("What are two names do you want?");
            String firstName = getInput();
            String secondName = getInput();
            if(firstName.equals(EXIT) || secondName.equals(EXIT))
            {
                keepAsking = false;
                System.out.println("End of program. Thanks for asking!");
            }
            else{
                String name1 = convertToSoundex(firstName.toUpperCase());
                System.out.println("The soundex coding of "+ firstName + " is: " + name1);
                String name2 = convertToSoundex(secondName.toUpperCase());
                System.out.println("The soundex coding of the " + secondName + " is: " + name2);
                if(name1.equals(name2))
                {
                    System.out.println("Their names sound the same");
                }
                else
                {
                    System.out.println("Their names do not sound the same");
                }
            }
        }

    }
    private static void printIdentification()
    {
        System.out.println("### Lab 6: Menus   Author: Jay Nguyen  ###");
        System.out.println("### Course/Section - CPSC1150-7 ###");
        System.out.println("### St.# - 100384022 ###\n");
        System.out.println();
    } // printIdentification
    /**
     * Translates characters to their soundex code
     * @param c the character to translate
     * @return the soundex code of the character
     */
    private static String getSoundexCode(char c)
    {
    
        if(c == 'A' || c == 'E' || c == 'H' || c == 'I' || c == 'O' || c == 'U' || c == 'Y' || c == 'W')
            return "0";
        else if (c == 'B' || c == 'F' || c == 'P' || c == 'V')
            return "1";
        else if (c == 'C' || c == 'S' || c == 'K' || c == 'G' || c == 'J' || c == 'Q' || c == 'X' || c == 'Z')
            return "2";
        else if (c == 'D' || c == 'T')
            return "3";
        else if (c == 'L')
            return "4";
        else if (c == 'M' || c == 'N')
            return "5";
        else if (c == 'R')
            return "6";
        else
            return "";
    }
    /**
     * Translates a string to its soundex code
     * @param s the string to translate
     * @return the soundex code of the string
     */
    public static String convertToSoundex(String s)
    {
        String soundex = "";
        String code = "";
        String firstLetter = s.toUpperCase().charAt(0) + "";
        String temp = "7";
        for(int i = 0;i < s.length();i++)
        {
          String current = getSoundexCode(s.charAt(i));
          if(current.length() > 0 && !current.equals(temp))
          {
            code = code + current;
          }
          temp = current;
          
        }
        soundex = firstLetter + code.substring(1);
        if(soundex.contains("0"))
            soundex = soundex.replaceAll("0", "");
        // add zeros to the end of the code and trim it to 4 characters
        soundex = (soundex + "0000").substring(0, 4);
        return soundex;
    }
    /**
     * Removes the character at the specified index from the string.
     * @param str the string to be modified
     * @param index the index of the character to be removed
     * @return the new string without the character removed
     */
    private static String removeCharAt(String str, int index) {

        String str1 = str.substring(0,index);          
        String str2 = str.substring(index+1,str.length());
        return str1+str2;

    }
    private static String getInput()
    {
		String name = keyboard.nextLine();
        return name;

    }
    
        
 }
 
    
 /*
 firstname = getInput();
 secondname = getInput();
 soundex = convertToSoundex(firstname);
 convertToSoundex(secondname);
 zero = "ae";
 if(zero.contains("0"))
    s="0";
 */