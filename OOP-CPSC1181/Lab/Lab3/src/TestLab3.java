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
		// Test modifyInfo() and getName(), getEmail(), and getPhoneNumber() methods
		Person p2 = new Person();
		System.out.println(p2);
		p2.modifyInfo("Hana Ng", "hanang@gmail.com", "778 882 1123");
		System.out.println(p2);

		System.out.println("------------");
		System.out.println("Test Employee:");
		// Creates an Employee with the constructor, which has 5 parameters
		Employee e1 = new Employee("Bill Gates","bgates@gmail.com","641 888 7766","B303",45000.99);
		System.out.println(e1);
	
		// Creates an Employee with the constructor, which has 3 parameters
		Employee e2 = new Employee("Hana Lexis", "hanalexis@gmail.com", "778 333 6578");
		System.out.println(e2);
		e2.setOffice("T123");
		e2.setSalary(49800.9);
		System.out.println(e2);
		// Creates an Employee with default constructor
		Employee e3 = new Employee();
		System.out.println(e3);
		e3.modifyInfo("Sana Ng", "sana12@gmail.com", "987 234 1345");
		e3.setOffice("L123");
		e3.setSalary(50020);
		System.out.println(e3);

		System.out.println("------------");
		System.out.println("Test Staff:");
		// Creates a Staff with the constructor, which has 5 parameters
		Staff s1 = new Staff("Clark Gable","cgable@gmail.com","1 800 888 8888","XB02",85600);
		System.out.println(s1);
		s1.setPosition("CEO");
		System.out.println(s1);

		// Creates a Staff with the constructor, which has 3 parameters
		Staff s2 = new Staff("Huyen Phan", "huyenphan@hotmail.com", "236 999 8990");
		System.out.println(s2);
		s2.setOffice("A239");
		s2.setSalary(90050);
		s2.setPosition("Manager");
		System.out.println(s2);	   

		// Creates a Staff with default constructor
		Staff s3 = new Staff();
		System.out.println(s3);
		s3.modifyInfo("Lyly Ho", "lylyho878@gmail.com", "236 412 5810");
		s3.setOffice("B439");
		s3.setSalary(30000);
		s3.setPosition("Receptionist");
		System.out.println(s3);
	}
}