import java.util.Scanner;

public class App {
    static Scanner keyboard = new Scanner(System.in);
    final static String EXIT = "Exit";
    public static void main(String[] args) throws Exception {
      boolean keepAsking = true;
      while(keepAsking)
      {
          System.out.println("What are two names do you want?");
          String firstName = getInput();
          String secondName = getInput();
          if(firstName.equals(EXIT) || secondName.equals(EXIT))
          {
              keepAsking = false;
              System.out.println("End of program");
          }
          else{
              String name1 = convertToSoundex(firstName.toUpperCase());
              System.out.println("The soundex coing of the first name is: " + name1);
              String name2 = convertToSoundex(secondName.toUpperCase());
              System.out.println("The soundex coing of the second name is: " + name2);
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
    
    private static String getCode(char c){
        switch(c){
          case 'B': case 'F': case 'P': case 'V':
            return "1";
          case 'C': case 'G': case 'J': case 'K':
          case 'Q': case 'S': case 'X': case 'Z':
            return "2";
          case 'D': case 'T':
            return "3";
          case 'L':
            return "4";
          case 'M': case 'N':
            return "5";
          case 'R':
            return "6";
          default:
            return "";
        }
      }
       
      public static String convertToSoundex(String s){
        String code, previous, soundex;
        code = "";
        String firstLetter = s.toUpperCase().charAt(0) + "";
        previous = "7";
        for(int i = 0;i < s.length();i++)
        {
          String current = getCode(s.toUpperCase().charAt(i));
          if(!current.equals("0") && !current.equals(previous)){
            code = code + current;
          }
          previous = current;
          
        }
        soundex = firstLetter + code.substring(1);
        soundex = (soundex + "0000").substring(0, 4);
        return soundex;
      }
      private static String getInput()
    {
		  String name = keyboard.nextLine();
        return name;

    }
    public static String convertToSoundex1(String s){
      String code, previous, soundex;
      code = s.toUpperCase().charAt(0) + "";
      previous = "7";
      for(int i = 1;i < s.length();i++){
        String current = getCode(s.toUpperCase().charAt(i));
        if(!current.equals("0") && !current.equals(previous)){
          code = code + current;
        }
        previous = current;
        
      }
      soundex = (code + "0000").substring(0, 4);
      return soundex;
    }

    
  }
      
 /*while(index < s.length())
 {
     code += getSoundexCode(s.charAt(index));// translate the character to a soundex code
     index++;
 }
 if(code.charAt(0) == code.charAt(1))// check if the first two characters are the same
     code = firstLetter + code.substring(2);
 else//if they are not the same then add the first letter to the code
     code = firstLetter + code.substring(1);

     
 for(int i = 1; i < code.length(); i++)
 {    
     if(code.charAt(i - 1) == code.charAt(i)) 
     {
         soundex += removeCharAt(code, i);
         code = soundex;
     }    
     else
         i++;
 }
 if(code.contains("0"))
 {
     code = code.replaceAll("0", "");
 }
 
 // add zeros to the end of the code and trim it to 4 characters
 code = (code + "0000").substring(0, 4);
 return code;
 firstname = getInput();
 secondname = getInput();
 soundex = convertToSoundex(firstname);
 convertToSoundex(secondname);
 zero = "ae";
 if(zero.contains("0"))
    s="0";
 */
    
    
        
    
