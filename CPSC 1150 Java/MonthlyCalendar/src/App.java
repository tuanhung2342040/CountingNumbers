import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which month?");
        String month = keyboard.nextLine();
        calendar(month);
        int date = 7;
        
    }
    // write a java program that will output a calendar for any particular month.
    private static void outputCalendar(String month)
    {
        int day = 31;
        switch(month){
            case "January":
                for(int i = 0; i < day; i++)
                {
                   System.out.print(i + " ");
                }
                break;
            case "February":
                for(int j = 0; i < day - 3; j++)
                {
                    System.out.print(j + " ");
                }
                break;
            case "March":
                for(int i = 0; i < day; i++)
                {
                    System.out.print(i + " ");
                }
                break;
            case "April":
                for(int i = 0; i < day - 1; i++)
                {
                    System.out.print(i + " ");
                }
                break;
            case "May":
                for(int i = 0; i < day; i++)
                {
                    System.out.print(i + " ");
                }
                break;
            case "June":
                for(int i = 0; i < day - 1; i++)
                {
                    System.out.print(i + " ");
                }
                break;
            case "July":
                for(int i = 0; i < day - 1; i++)
                {
                    System.out.print(i + " ");
                }
                break;
            case "August":
                for(int i = 0; i < day; i++)
                {
                    System.out.print(i + " ");
                }
                break;
            case "September":
                for(int i = 0; i < day - 1; i++)
                {
                    System.out.print(i + " ");
                }break;
            case "October":
                for(int i = 0; i < day; i++)
                {
                    System.out.print(i + " ");
                }
                break;
            case "November":
                for(int i = 0; i < day - 1; i++)
                {
                    System.out.print(i + " ");
                }
                break;
            case "December":
                for(int i = 0; i < day; i++)
                {
                    System.out.print(i + " ");
                }
                break;
            default:
                System.out.println("Not a month");


        }

    }


    
}
/**
 * main
 * month = getMath();
 * year = getYear();
 * Outputcalendar(month, year)
 * --------------------------
 * Methods
 * outputCalendar(month, year) includes
 * outputCaldendarHeader(month)
 * start = whichDayToStart(month, year);
 * numDay = numberOfDayIn(month);
 * 
 * main --> outputcalendar() 
 * ouputCanlenderheader  determinStartingDayOfWeek   numberOfDaysInMonth   OutputRestOfCalendar
 * getMonthName                                         isLeapYear
 * private static void outputCalendar(int month, int year)
 * {
 * sysout("Outputting the calendar");
 * sysout("Month is:" + month + " and year was " + year) + "<");
 * 
 * }
 * 
 * private static void driverForGetMonthName(){
 * sysouit("Testing getMonthName");
 * testMOnthInput = 1;
 * expectedMonth = "January";
 * sysout("%5s%15s%15s, testMonthInput, expectedMoth, actualMonth")
 * }
 */
