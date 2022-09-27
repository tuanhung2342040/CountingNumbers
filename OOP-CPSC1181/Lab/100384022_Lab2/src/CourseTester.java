public class CourseTester {
    public static void main(String[] args) throws Exception {
        Course course = new Course();
        course.addStudent("Tian", "Wei");
        course.addStudent("Hung", "Nguyen");
        course.addStudent("Pham", "Tran");

        System.out.println(course);

       course.addQuiz(10000001, 10, 5);
       course.addQuiz(10000001, 10, 7);

       course.addQuiz(10000002, 10, 7);
       course.addQuiz(10000002, 10, 8);

       course.addQuiz(10000003, 10, 10);
       course.addQuiz(10000004, 10, 10);

       course.printStudentNumbers();
       System.out.println(course.findStudent(10000002));
       System.out.println(course.findStudent(1000000));
    

       System.out.println(course.findTopStudent());
       
       System.out.println(course.addQuiz(50000, 10, 7));        

       
        
    }
}