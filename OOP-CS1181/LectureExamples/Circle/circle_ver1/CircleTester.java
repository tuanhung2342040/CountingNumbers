public class CircleTester{
	public static void main(String[] args){

		Circle c1=new Circle();
		Circle c2=new Circle(15,16,5);

		c1.move(20,30);
		c1.setRadius(10);
		System.out.println("c1:");
		System.out.println(c1.getArea());
		System.out.println(c1.getCircumference());
		System.out.println("c2:");
		System.out.println(c2.getArea());
		System.out.println(c2.getCircumference());

		c2.move(10,-5);
		System.out.println(c2);
		System.out.println(c1);
	}
}