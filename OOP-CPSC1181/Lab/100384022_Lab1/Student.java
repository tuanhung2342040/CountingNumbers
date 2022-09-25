import java.util.Stack;
public class Student {
    private String firstName;
    private String surname;
    private final long studentNumber;
    private Address address;
    private double quizAverage;
    private final String loginId;
    private Stack<Double> grades;
    /**
     * This constructs a student with first name, surname, student number, loginId, and grades of the student
     * @param firstName the first name of the student
     * @param surName the surname of the student
     * @param studentNumber the student number of the student
     */
    public Student(String firstName, String surName, long studentNumber){
        this.firstName = firstName;
        this.surname = surName;
        this.studentNumber = studentNumber;
        this.loginId = generateLoginId();
        grades = new Stack<>();

    }
    /**
     * Sets student's name and surname to a new name
     * @param firstName the new first name of the student
     * @param surName the new surname of the student
     */
    public void setName(String firstName, String surName){
        this.firstName = firstName;
        this.surname = surName;
    }

    /**
     * Return the full name of the student
     * @return full name of the student
     */
    public String getName(){
        return firstName+ " " + surname;
    }

    /**
     * Returns the student of number
     * @return the student number
     */
    public long getStudentNumber(){
        return studentNumber;
    }

    /**
     * Returns loginId for student based on a certain format.
     * @return  the loginId
     */
    private String generateLoginId(){
        char firstLetter = firstName.toLowerCase().charAt(0);
        String middlePart = "";
        for(int i = 0; i < surname.length(); i++){
            if(i == 4){
                break;
            }
            middlePart += surname.toLowerCase().charAt(i);
        }
        long temp = studentNumber;
        String lastPart = String.valueOf(temp);
        int len = lastPart.length();
        lastPart = lastPart.substring(len - 2, len);

        return  firstLetter + middlePart + lastPart;
    }

    /**
     * Returns the login id of the student
     * @return loginId
     */
    public String getLoginId(){
        return loginId;
    }

    /**
     * Returns information of the student based on first name, surname, loginId, and studentNumber of the student
     * @return the information of the student
     */
    public String getInfo(){
        return firstName + ", " + surname + " (" + loginId + ", " + studentNumber + ")";
    }

    /**
     * Set the address of the student based on what the student inputs.
     * @param number the number of the address
     * @param street the name of the street of the address
     * @param city the city of the address
     * @param province the province of the address
     * @param postalCode the postalCode of the address
     */
    public void setAddress(String number, String street, String city, String province, String postalCode){
        address = new Address(number, street, city, province, postalCode);
    }

    /**
     * This returns the address of the student
     * @return  student's address
     */
    public String getAddress(){
        return address.toString();
    }

    /**
     * Adds quiz's grades of the student
     * @param quiz the grade of the quiz
     */
    public void addQuiz(double quiz){
        grades.push(quiz);

    }

    /**
     * This returns the average grade of the quiz that the student gets
     * @return the average grade of the quiz
     */
    public double getQuizAverage(){
        int length = grades.size();
        while(!grades.isEmpty()){
            quizAverage += grades.pop();
        }
        quizAverage /= length;
        return quizAverage;
    }

    /**
     * Overrides the toString() method of the Object class
     */
    @Override
    public String toString(){
        return "[" + firstName + ", " + surname + ", " +
                studentNumber + ", " + loginId + "]";
    }


}
