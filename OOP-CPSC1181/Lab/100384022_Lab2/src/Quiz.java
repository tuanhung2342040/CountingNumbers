public class Quiz {
    private double maxGrade; 
    private double studentGrade;

    public Quiz(){
        maxGrade = 0;
        studentGrade = 0;
    }
    public void addQuiz(double maxGrade, double studentGrade){
        this.maxGrade = maxGrade;
        this.studentGrade = studentGrade;
    }
    public double getAverage(){
        return studentGrade;
    }
}
