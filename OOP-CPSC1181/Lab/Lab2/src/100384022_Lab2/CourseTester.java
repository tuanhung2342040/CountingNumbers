public class CourseTester {
    public static void main(String[] args){

        //Case 1
        //test default constructor 
		System.out.println("Case 1: ");
        Course course = new Course();
        System.out.println(course);
        System.out.println();

        //Case 2
        //test addAddStudent() and addQuiz() and getAverage() 
		System.out.println("Case 2:");
        course.addStudent("Tian", "Wei");
        course.addStudent("Hung", "Nguyen");
        course.addStudent("Pham", "Tran");
        course.addQuiz(10000001, 15, 5);
        course.addQuiz(10000001, 14, 7);
        course.addQuiz(10000002, 10, 7);
        course.addQuiz(10000002, 8, 8);
        course.addQuiz(10000003, 14, 10);
        course.addQuiz(10000003, 12, 10);
		System.out.println(course.getAverage());
        System.out.println(course);
        System.out.println();

        //Case 3
		//Test findStudent()
		System.out.println("Case 3:");
        System.out.println(course.findStudent(10000002));
        System.out.println(course.findStudent(1000000));
        System.out.println();

        //Case 4
		//Test findTopStudent() 
		System.out.println("Case 4:");
        System.out.println(course.findTopStudent());
        System.out.println();

        //Case 5
		//Test deleteStudent() 
		System.out.println("Case 5:");
		System.out.println(course.deleteStudent(10000001));
	    System.out.println(course.deleteStudent(312314558)); 
        System.out.println();
        
        //Case 6
        // Test toString() after deleting a student from the course
        System.out.println("Case 6:");
        System.out.println(course.toString());
        System.out.println();
    }
}