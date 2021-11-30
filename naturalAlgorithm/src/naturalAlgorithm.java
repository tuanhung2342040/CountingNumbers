// Name: Jay Nguyen              Student Number: 100384022
// Course/Section: CPSC ####-#     
// Instructor: #######             Date:           #####
// Assignment/Lab: 2            Last Modified:  #####
//
// Purpose:  compute the ln(2) without using Math.log(2)
// Ln(2) = " + ln2Forward"

public class naturalAlgorithm {

    final private static int NUMBER_TERMS = 100000;
    final private static String PRINT_RESULT = "The result of ln(2) of the ";
    
    public static void main(String[] args) throws Exception 
    {
        printIdentification();
        System.out.printf("%f", 10.1);
        
        
        System.out.println("The table of ln(2) values:");
        
        System.out.printf("Ln(2) of the sumForwards Method is: \n%17.15f", sumForwards(NUMBER_TERMS));
        System.out.println();
        System.out.printf("Ln(2) of the sumBackwards  Method is: \n%17.15f", sumBackwards(NUMBER_TERMS));
        System.out.println();
        System.out.printf("Ln(2) of the sumForwardsInTwoHalves Method is: \n%17.15f", sumForwardsInTwoHalves(NUMBER_TERMS));
        System.out.println();
        System.out.printf("Ln(2) of the sumBackwardsInTwoHalves Method is: \n%17.15f", sumBackwardsInTwoHalves(NUMBER_TERMS));
        System.out.println();
        System.out.printf("Ln(2) of the sumForwardsFloat Method is: \n%17.15f",sumForwardsFloat(NUMBER_TERMS));
        System.out.println();
        System.out.printf("Ln(2) of the sumForwardsFloat Method is: \n%17.15f", sumBackwardsFloat(NUMBER_TERMS));
        System.out.println();
        System.out.println("The result of ln(2) by using Math.log is: \n" +
                                 Math.log(2)); 
    }
    // printIdentification
    private static void printIdentification() // put some id on the screen
    {
        System.out.println("Name: Jay Nguyen   Student Number: 100384022");
        System.out.println("Course: CPSC 1050-3         Instructor: Bryan Green\n");
        System.out.println("~~~ Assignment 2 - Compute ln(2) ~~~\n\n");
    } 

    //a
    private static double sumForwards(int numberOfTerms)
    {
        double sum = 0;
        double index = 1.0;
        while(index <= numberOfTerms)
        {       
            sum -= Math.pow(-1, index)/index;  
            index++; 
        }
        return sum;


    }
    //b
    private static double sumBackwards(int numberOfTerms)
    {
            double sum = 0;
            double index = 1;
            while(index <= numberOfTerms)
            {
                sum -= Math.pow(-1, numberOfTerms)/numberOfTerms;
                numberOfTerms--;
            }
            

        return sum;
    }
    //c
    private static double sumForwardsInTwoHalves(int numberOfTerms)
    {
        double sumPositiveTerm = 0.0;
        double sumNegativeTerm = 0.0;
        double index = 1.0;
        while(index <= numberOfTerms)
        {
            if(index%2 == 0)
                sumPositiveTerm -= Math.pow(-1, index)/index;
            else
                sumNegativeTerm -= Math.pow(-1, index)/index;
            index++;
        }

        return sumPositiveTerm + sumNegativeTerm;
    }
    //d
    private static double sumBackwardsInTwoHalves(int numberOfTerms)
    {
            double sumPositiveTerm = 0.0;
            double sumNegativeTerm = 0.0;
            double index = 1.0;
            while(index <= numberOfTerms)
            {
                if(numberOfTerms%2 == 0)
                    sumPositiveTerm -= Math.pow(-1, numberOfTerms)/numberOfTerms;
                else
                    sumNegativeTerm -=Math.pow(-1, numberOfTerms)/numberOfTerms;
                
                numberOfTerms--;
            }
            

        return sumPositiveTerm + sumNegativeTerm;
        
    }

    //e
    private static float sumForwardsFloat(int numberOfTerms)
    {
        float sum = 0.0f;
        float index = 1.0f;
        while(index <= numberOfTerms)
        {
            sum -= Math.pow(-1, index)/index;
            index++;
        }
        return sum;
    }
    //f
    private static float sumBackwardsFloat(int numberOfTerms)
    {
        float sum = 0.0f;
        float index = 1.0f;
        while(index <= numberOfTerms)
        {
            sum -= Math.pow(-1, numberOfTerms)/numberOfTerms;
            numberOfTerms--;

        }
        return sum;
    }


}
