public class Quiz {
    private double maxGrade; 
    private double studentGrade;

    public Quiz(double maxGrade, double studentGrade){
        this.maxGrade = maxGrade;
        this.studentGrade = studentGrade;
    }
    public double getStudentGrade(){
        return studentGrade;
    }
}
