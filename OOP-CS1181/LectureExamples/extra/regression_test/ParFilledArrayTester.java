import java.util.Scanner;
public class ParFilledArrayTester{
  public static void main (String[] args)  {
	double x;
	final int SIZE=5;
    Scanner myInput = new Scanner(System.in);    
	ParFilledArray sample = new ParFilledArray(SIZE);
	while(true){
		System.out.print("\ninput a number: "); 
		x = myInput.nextDouble();
		if(!sample.addElement(x)){
			System.out.println(x+" rejected. Arra is full");
			break;
		}
	}
	System.out.println("Sum of Elements: "+sample.getSum());
  }
}
class ParFilledArray{
	int count;
	double[] arr;
	public ParFilledArray(int size){
		arr = new double[size];
		count=0;
	}
	public int getSize(){
		return count;
	}
	public boolean addElement(double e){
		if(arr.length == count)
			return false;
		arr[count++]=e;
		return true;
	}
	public double getSum(){
		double sum=0;
		for(double e: arr)
			sum+=e;
		return sum;
	}
}
