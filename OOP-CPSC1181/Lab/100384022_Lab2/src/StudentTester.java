public class StudentTester {
    public static void main(String[] args) throws Exception{
        Student s = new Student("Jay", "Nguyen");
        s.addQuiz(15, 12);
        s.addQuiz(12, 9);
        s.addQuiz(8, 4);
        System.out.println(s.getName());
        System.out.println(s.getStudentNumber());
        System.out.println(s.toString());
        System.out.println(s.getQuizAverage());

    }
}
