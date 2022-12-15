
public class Example5{
	public static void main (String args[]) {
		ProcessString reverse = (str) -> {
			String res = "";
			for(int i = str.length()-1; i >= 0; i--)
				res += str.charAt(i);
			return res;
		};

		System.out.println(reverseStr(reverse, "CPSC 1180_002")); 
	}
	//----
	public static String reverseStr(ProcessString reverse, String str){
	  return reverse.process(str);
	}
}

interface ProcessString {
	String process(String str);
}
