
public class Example0{
	public static void main(String args[]) {
	  // create an inner class	  
	  class InnerTest implements NumericTest{
	  	public boolean computeTest(int n){
	  		return n>0;
	  	} 
	  }
	  InnerTest test1 = new InnerTest();
	  System.out.println(test1.computeTest(6));
	  

	  //create an anonymous class
	  NumericTest anonymousTest = new NumericTest(){
	  	public boolean computeTest(int n){
	  		return n>0;
	  	} 
	  };
	  System.out.println(anonymousTest.computeTest(-6));

	}
}

interface NumericTest {
  boolean computeTest(int n); 
}