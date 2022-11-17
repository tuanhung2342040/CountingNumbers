import java.text.SimpleDateFormat;

public class DataVerifier {
    private String day;
    private String month;
    private String year;
    public DataVerifier(String day, String month, String year){
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public String checkDay() throws NumberFormatException{
        // 31:1, 3, 5, 7, 8, 10, 12
        //30:4,6,9,11
        //28||29 2
        if(Integer.parseInt(day) < 0){
            throw new CPSC1181Exception("You input a negative day. It is impossible!!");
        }
        else if(Integer.parseInt(day) > 31){
            throw new CPSC1181Exception("It cannot be > 31");
        }
        else if(day == null) {
            throw new CPSC1181Exception("Error: it is empty");
        }
        else if(day.matches("[a-zA-Z]+")){
            throw new CPSC1181Exception("The day is not valid because it contains chars");
        }
        else {
            if(month.equals("02") || month.equals("2")){
                if(Integer.parseInt(day) > 28){
                    throw new CPSC1181Exception("Error: This is February. The last day of this month is 28");
                }
            }
            else if(month.equals("4") || month.equals("04")
                    || month.equals("4") || month.equals("04")
                    || month.equals("4") || month.equals("04")
                    || month.equals("11")){
                if(Integer.parseInt(day) > 30){
                    throw new CPSC1181Exception("Errors: This is " + month + " month. It must have 30 days");
                }
            }
            else if(month.equals("1") || month.equals("01")
                    || month.equals("3") || month.equals("03")
                    || month.equals("5") || month.equals("05")
                    || month.equals("7") || month.equals("07")
                    || month.equals("8") || month.equals("08")
                    || month.equals("10") || month.equals("12")){
                if(Integer.parseInt(day) > 31) {
                    throw new CPSC1181Exception("Errors: This is " + month + " month. It must have 31 days");
                }
            }
        }

        return day;
    }



    public String checkMonth() throws NumberFormatException{
        if(Integer.parseInt(month) < 0){
            throw new CPSC1181Exception("You input a negative month. It is impossible!!");
        }
        else if(month == null) {
            throw new CPSC1181Exception("Error: it is empty");
        }
        else if(Integer.parseInt(month) > 12){
            throw new CPSC1181Exception("It cannot be > 12");
        }
        else if(month.matches("[1-12]+")
            || month.equals("01") || month.equals("02") || month.equals("03")
                || month.equals("04") || month.equals("05") || month.equals("06")
                || month.equals("07") || month.equals("08") || month.equals("09")){
            return month;
        }
        else if(day.matches("[a-zA-Z]+")){
            throw new CPSC1181Exception("The day is not valid because it contains chars");
        }
        else {
            throw new CPSC1181Exception("Error: Not a valid month");
        }

    }

    public String checkyear() throws NumberFormatException{
        if(Integer.parseInt(year) < 0){
            throw new CPSC1181Exception("You input a negative year. It is impossible!!");
        }
        else if(year == null) {
            throw new CPSC1181Exception("Error: it is empty");
        }
        else if((Integer.parseInt(year) <  1000 || Integer.parseInt(year) > 3000)){
            throw new CPSC1181Exception("Not a valid year");
        }
        else if(day.matches("[a-zA-Z]+")){
            throw new CPSC1181Exception("The day is not valid because it contains chars");
        }
        return year;
    }

//    private boolean isLeapYear() {
//        int intYear = Integer.parseInt(year);
//        if((intYear % 4 == 0 && intYear % 100 != 0) || (intYear % 400 == 0))
//            return true;
//        return false;
//    }
}
