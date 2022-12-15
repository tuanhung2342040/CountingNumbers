
public class Example4{
	public static void main(String args[]){

		// String version of TheGeneric 
		TheGeneric<String> reverse = (str) -> {
			String res = "";
			for(int i = str.length()-1; i >= 0; i--)
				res += str.charAt(i);
			return res;
		};

		// Integer version of TheGeneric
		TheGeneric<Integer> factorial = (Integer n) -> {
			int ans = 1;
			for(int i=1; i <= n; i++)
				ans = i * ans;
			return ans;
		};
		System.out.println(reverse.compute("Hello")); 
		System.out.println(factorial.compute(5)); 

	}
}
//----
interface TheGeneric<T> {
	T compute(T t);
}
