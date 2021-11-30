//
// Name: ###########               Student Number: #############
// Course/Section: CPSC ####-#     
// Instructor: #######             Date:           #####
// Assignment/Lab: ###             Last Modified:  #####
//
// Purpose:  This is the skeleton of a "digital" banner program
//

public class Banner {
    final private static String BIG_GAP = "             ";

    public static void main(String[] args) 
    {
        printIdentification();
        printSpecialNumber();
        printStudentNum();
    } // main

    private static void printIdentification() // put some id on the screen
    {
        System.out.println("Name: Jay Nguyen & Vincent Luong   Student Number: 100384022 & 100384939");
        System.out.println("Course: CPSC 1050-3         Instructor: Bryan Green\n");
        System.out.println("~~~ Lab 4 - Program to Draw Numbers ~~~\n\n");
    } // printIdentification

    // ===========================================================================================
    //In this section write a method that will print a multiple digit number
    private static void printSpecialNumber() {
        printATwo();
        printAThree();
        printAFive();
        printAEight();
    } // printSpecialNumber
    private static void printStudentNum()
    {
        printAOne();
        printAZero();
        printAZero();
        printAThree();
        printAEight();
        printAFour();
        printAZero();
        printATwo();
        printATwo();
    }

    // ===========================================================================================
    // In this section write the higher-level methods necessary to print entire
    // digits
    // One method for each digit - think about all the steps required to print one
    // single digit
    //
    // Do not delete this next method - ever!
    private static void printAOne() // prints a 1
    {
        print11111();
        print11111();
        print11111();
        print11111();
        printBlankLine();
    } // printAOne 
    private static void printAZero()
    {
        print11111();
        print11111();
        print10001();
        print10001();
        print11111();
        print11111();
        printBlankLine();
    }

     private static void printATwo()
    {
        print11101();
        print11101();
        print10111();
        print10111();
        printBlankLine();
    } // prints a two
 
    private static void printAThree()
    {
        print10101();
        print10101();
        print11111();
        print11111();
        printBlankLine();
    }
 private static void printAFour()
    {
        print00111();
        print00111();
        print00100();
        print11111();
        print11111();
        printBlankLine();
    }
 private static void printAFive()
    {
        print10111();
        print10111();
        print10101();
        print11101();
        print11101();
        printBlankLine();
    }
 private static void printASix()
    {
        print11111();
        print11111();
        print10101();
        print10101();
        print11100();
        printBlankLine();
    }
     

     private static void printASeven()
    {
        print00001();
        print00001();
        print00001();
        print11111();
        print11111();
        printBlankLine();
    }
    
    private static void printAEight() {
        print11111();
        print11111();
        print10101();
        print10101();
        print11111();
        print11111();
        printBlankLine();
    }

    private static void printANine()
    // 
    {
    // 
        print00111();
        print00111();
        print00101();    
        print11111();
        print11111();
        printBlankLine();
    }
 // ===========================================================================================
    // In this section write the methods necessary to print out specific *pieces* of a single digit
    // Notice the naming convention for the method and the specific task that it performs
    //
    // Do not delete these next meth private static void print11111()
    
     private static void print11111()
     {
         System.out.println(BIG_GAP + "***************");
     }

     private static void print11101()
    {
        System.out.println(BIG_GAP + "*********   ***");
    } // prints 11101
 private static void print10111()
    {
        System.out.println(BIG_GAP + "***   *********");
    }
     private static void print10101()
    {
        System.out.println(BIG_GAP + "***   ***   ***");
    }
 private static void print00111()
    {
        System.out.println(BIG_GAP + "      *********");
    }
 private static void print00100()
    {
        System.out.println(BIG_GAP + "      ***      ");
    }
 private static void print00101()
    {
        System.out.println(BIG_GAP + "      ***   ***");
    }
 private static void print10100()
    {
        System.out.println(BIG_GAP + "***   ***      ");
    }
 private static void print00001()
    {
        System.out.println(BIG_GAP + "            ***");
    }

    private static void print11100()
    {
        System.out.println(BIG_GAP + "*********      ");
    }

    private static void print10001()
    {
        System.out.println(BIG_GAP + "***         ***");
    }

    private static void printBlankLine()
    {
        System.out.println();
    } // printBlankLine
}