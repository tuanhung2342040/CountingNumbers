import java.util.Scanner;
public class CourseRunner{
	static boolean promptBack=true;
	public static void main(String[] args){
		Course course = new Course();
		int option;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("\nCourse directory commands:"); 
			System.out.println("1. add a new Student"); 
			System.out.println("2. find Student"); 
			System.out.println("3. delete Student"); 
			System.out.println("4. add quiz"); 
			System.out.println("5. find student with the highest quiz score ");
			System.out.println("6. get course average ");
			System.out.println("7. quit ");
			System.out.print("select option: ");
			option = in.nextInt();
			if(promptBack)
				System.out.println(option);
			switch(option){
				case 1: 
					addNewStudent(in,course);
					break;
				case 2: 
					findStudent(in,course);
					break;
				case 3: 
					deleteStudent(in,course);
					break;
				case 4: 
					addQuiz(in,course);
					break;
				case 5: 
					findStudentWithHighersQuiz(in,course);
					break;
				case 6: 
					courseAverage(in,course);
					break;
				case 7: 
					System.out.println("Quitting");
					break;
				default:
					System.out.println("invalid option. Try again!");
			}
		}while (option != 7);
		System.out.println("------------");
		System.out.println(course);
	
	}

	public static void addNewStudent(Scanner in,Course course){
		String name;
		String surname;
		System.out.println("Add a new Student: ");
		System.out.print("student's name: ");
		name = in.next();
		if(promptBack)
			System.out.println(name);
		System.out.print("student's surname: ");
		surname = in.next();
		if(promptBack)
			System.out.println(surname);
		Student tmp = course.addStudent(name,surname);
		System.out.println("student added: "+tmp.getInfo());

	}

	public static void findStudent(Scanner in,Course course){

		long id;
		System.out.println("Find student:");
		System.out.print("student's number(id): ");
		id = in.nextLong();
		if(promptBack)
			System.out.println(id);
		Student tmp = course.findStudent(id);
		if(tmp == null)
			System.out.println("student not found! ");
		else
			System.out.println(tmp.getInfo());
	}

	public static void deleteStudent(Scanner in, Course course){
		long id;
		System.out.println("Delete student:");
		System.out.print("student's number(id): ");
		id = in.nextLong();
		if(promptBack)
			System.out.println(id);
		Student tmp = course.deleteStudent(id);
		if(tmp == null)
			System.out.println("student not found! ");
		else
			System.out.println(tmp.getInfo());
	}


	public static void addQuiz(Scanner in, Course course){
		long id;
		double maxGrade;
		double studentGrade;
		System.out.println("Add quiz:");
		System.out.print("student's number(id): ");
		id = in.nextLong();
		if(promptBack)
			System.out.println(id);
		System.out.print("quiz scale: ");
		maxGrade = in.nextDouble();
		if(promptBack)
			System.out.println(maxGrade);
		System.out.print("student's grade: ");	
		studentGrade = in.nextDouble();
		if(promptBack)
			System.out.println(studentGrade);
		boolean tmp = course.addQuiz(id, maxGrade, studentGrade);
		if(tmp == false)
			System.out.println("student not found!");
		else
			System.out.println("Quiz added");
	}

	public static void findStudentWithHighersQuiz(Scanner in, Course course){
		System.out.println("Find student with the highest quiz score:");
		Student tmp = course.findTopStudent();
		if(tmp == null){
			System.out.println("The course has no students!");
		}
		else
			System.out.println(tmp.getInfo());

	}

	public static void courseAverage(Scanner in, Course course){
		System.out.println("Get course average:");
		System.out.println("course average: " + course.getAverage());
	} 

	

}