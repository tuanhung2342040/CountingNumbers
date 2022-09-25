import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private long studentNumber;
    private String loginId;
    private ArrayList<Quiz> quizzes;
    private static long generateStudentNumber = 10000001L;

    /**
     * This constructs a student with first name, surname, student number
     * and grades of the student
     * 
     * @param name    the first name of the student
     * @param surname the surname of the student
     */
    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.studentNumber = generateStudentNumber++;
        this.loginId = generateLoginId();

    } 

    /**
     * Sets student's name and surname to a new name
     * 
     * @param firstName the new first name of the student
     * @param surName   the new surname of the student
     */
    public void setName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Return the full name of the student
     * 
     * @return full name of the student
     */
    public String getName() {
        return name + " " + surname;
    }

    /**
     * Returns the student of number
     * 
     * @return the student number
     */
    public long getStudentNumber() {
        return studentNumber;
    }

    /**
     * Returns loginId for student based on a certain format.
     * 
     * @return the loginId
     */
    private String generateLoginId() {
        char firstLetter = name.toLowerCase().charAt(0);
        String middlePart = "";
        for (int i = 0; i < surname.length(); i++) {
            if (i == 4) {
                break;
            }
            middlePart += surname.toLowerCase().charAt(i);
        }
        long temp = studentNumber;
        String lastPart = String.valueOf(temp);
        int len = lastPart.length();
        lastPart = lastPart.substring(len - 2, len);

        return firstLetter + middlePart + lastPart;
    }

    /**
     * Returns the login id of the student
     * 
     * @return loginId
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * Returns information of the student based on first name, surname, loginId, and
     * studentNumber of the student
     * 
     * @return the information of the student
     */
    public String getInfo() {
        return name + ", " + surname + " (" + studentNumber + ", " + loginId + ")";
    }

    /**
     * Adds quiz's grades of the student
     * 
     * @param quiz the grade of the quiz
     */
    public void addQuiz(double maxGrade, double studentGrade) {
        if(quizzes == null){
            quizzes = new ArrayList<>();
        }
        Quiz newQuiz = new Quiz(maxGrade, studentGrade);
        quizzes.add(newQuiz);
    }

    /**
     * This returns the average grade of the quiz that the student gets
     * 
     * @return the average grade of the quiz
     */
    public double getQuizAverage() {
        int length = quizzes.size();
        double sum = 0;
        for(Quiz q : quizzes){
            sum += q.getStudentGrade();
        }
        return sum /= length;
    }

    /**
     * Overrides the toString() method of the Object class
     */
    @Override
    public String toString() {
        return "[name:" + name + ", surname:" + surname +  
            "(StudentNumber:" + studentNumber + ", loginId:" + loginId + ")]";
    }

}
