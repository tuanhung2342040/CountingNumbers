/**
	StudentTester tests class Student and class Address 

*/
class StudentTester{
	public static void main(String[] args){
		//Case 1
		// test Student constructor
		Student student = new Student("Marry","jones",10000001);
		System.out.println(student);

		//Case 2
		// test Student getName, geyStudentNumber(), getLoginId()
		System.out.println(student.getName());
		System.out.println(student.getStudentNumber());
		System.out.println(student.getLoginId());

		//Case 3
		// test Student getInfo()
		System.out.println(student.getInfo());

		//Case 4
		// test Student addQuiz and getAverage
		student.addQuiz(6.0);
		student.addQuiz(8.5);
		student.addQuiz(9.8);
		System.out.println(student.getQuizAverage());

		// add your test cases:

		//Case 5
		// test Student setName(), getName(), getLoginId()
		student.setName("Jay", "Nguyen");
		System.out.println(student.getName());
		System.out.println(student.getLoginId());

		//Case 6
		// test Student setAddress() and getAddress()

		student.setAddress("1234", "Hastings", "Vancouver",
				"BC", "V5K1Q1");
		System.out.println(student.getAddress());

	}
}
