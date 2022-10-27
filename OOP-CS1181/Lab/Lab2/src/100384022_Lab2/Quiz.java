public class Quiz {
    private double maxGrade; 
    private double studentGrade;
    /**
     * This constructs a quiz with max grade and student grade
     * @param maxGrade max grade of the quiz
     * @param studentGrade student's grade
     */ 
    public Quiz(double maxGrade, double studentGrade){
        this.maxGrade = maxGrade;
        this.studentGrade = studentGrade;
    }
    public double getAverage(){
        return studentGrade/maxGrade*100;
    }
}
