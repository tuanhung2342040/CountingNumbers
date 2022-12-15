
public class Example2{
	public static void main(String args[]) {
		ProcessString first = (str) -> "Good Morning " + str + "!";
		ProcessString second = (str) -> "Len: " + str.length();
		System.out.println(first.process("Gary"));
		System.out.println(second.process("Gary"));	
	}
}

interface ProcessString{
	String process(String str);
}