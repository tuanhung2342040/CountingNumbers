public class CourseTester {
    public static void main(String[] args) throws Exception {
        Course course = new Course();
        course.addStudent("Jay", "Nguyen");
        course.addStudent("Hung", "Nguyen");
        course.addStudent("KKIm", "Nguyen");

        System.out.println(course);
        
    }
}