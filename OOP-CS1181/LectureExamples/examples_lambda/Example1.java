
public class Example1{
	public static void main(String args[]) {

	/* NumericTest isNegative = new NumericTest(){
	  	public boolean computeTest(int n){
	  		return n<0;
	  	} 
	  };
	  System.out.println(isNegative.computeTest(-5));

	  NumericTest isEven = new NumericTest(){
	  	public boolean computeTest(int n){
	  		return (n % 2) == 0;
	  	} 
	  };
	  System.out.println(isEven.computeTest(5));
	*/


	  NumericTest isNegative = (n) -> (n < 0);
	   // Output: true
	  System.out.println(isNegative.computeTest(-5));
	  
	  NumericTest isEven = (n) -> (n % 2) == 0;
	  // Output: false
	  System.out.println(isEven.computeTest(5));
	 
	}
}

interface NumericTest {
  boolean computeTest(int n); 
}