public class TestLab3{
	public static void main(String[] args){
		
		System.out.println("Test Faculty:");
		Faculty f1 = new Faculty("jack palace","jpalace@gmail.com","804 123 5888","A101",68000.00, Status.PART_TIME);
		System.out.println(f1);

		Faculty f2 = new Faculty("jack palace","jpalace@gmail.com","804 123 5888");
		System.out.println(f2);

		f2.setStatus(Status.FULL_TIME);
		System.out.println(f2.getStatus());
		f2.setOffice("C102");
		f2.setSalary(65000);
		System.out.println(f2);

		System.out.println("------------");
		System.out.println("Test Person:");
		Person p1 = new Person("Mary Poppins","mpoppins@gmail.com", "604 123 4567");
		System.out.println(p1);
		// add more test cases as required


		System.out.println("------------");
		System.out.println("Test Employee:");
		Employee e1 = new Employee("Bill Gates","bgates@gmail.com","641 888 7766","B303",45000.99);
		System.out.println(e1);
		// add more test cases as required
		

		System.out.println("------------");
		System.out.println("Test Stuff:");
		Employee s1 = new Employee("Clark Gable","cgable@gmail.com","1 800 888 8888","XB02",85600);
		System.out.println(s1);
		// add more test cases as required


		


	}
}
