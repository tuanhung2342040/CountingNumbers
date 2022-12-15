
public class Example3{
	public static void main (String args[]) {
		ProcessString reverse = (str) -> {
			String res = "";
			for(int i = str.length()-1; i >= 0; i--)
				res += str.charAt(i);
			return res;
		};
		System.out.println(reverse.process("CPSC 1181_002")); 
	}
}

interface ProcessString{
	String process(String str);
}