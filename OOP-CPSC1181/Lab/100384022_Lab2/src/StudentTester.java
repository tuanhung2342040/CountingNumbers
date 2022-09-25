public class StudentTester {
    public static void main(String[] args) {
        Student s = new Student("Jay", "Nguyen");
        for(int i = 0; i < 3; i++){
            s.addQuiz(10, 6 + i);
        }
        System.out.println(s.getName());
        System.out.println(s.getStudentNumber());
        System.out.println(s.toString());
        System.out.println(s.getQuizAverage());

    }
}
