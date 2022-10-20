public class PyramidTester{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(10,20);
		System.out.println(r1);
		System.out.println(r1.equals(r2));
		System.out.println("------------");
		Pyramid p1 = new Pyramid(10,20,30);
		Pyramid p2 = new Pyramid(5,10,15);
		p2.scale(2);
		System.out.println(p2);
		System.out.println(p1.equals(p2));

	}
}
class Rectangle{
	private double width;
	private double length;
	
	public Rectangle(double w, double l){
		width  = w;
		length = l;
		
	}

	public void scale(double factor){
		width=width*factor;
		length = length*factor;

	}
	
	public double getWidth(){
		return width;
	}
	
	public double getLength(){
		return length;
	}

	public double getArea(){
		return width*length;
	}

	@Override
	public String toString(){
		return "[w: "+width+", l: "+length+"]";
	}

	@Override
	public boolean equals(Object otherObject){
		Rectangle r = (Rectangle) otherObject;
		return width==r.getWidth() && length == r.getLength();

	}

}

class Pyramid extends Rectangle{
	private double height;
	
	public Pyramid(double width, double length, double height){
		super(width,length);
		this.height =height;
	}
	
	public double getHeight(){
		return height;
	}
	
	@Override
	public double getArea(){
		return height * super.getArea();
	}
	
	@Override
	public void scale(double factor){
		height = height*factor;
		super.scale(factor);
	}

	@Override
	public String toString(){
		return "[h: "+height+super.toString()+"]";
	}

	@Override
	public boolean equals(Object otherObject){
		Pyramid p = (Pyramid)otherObject;
		return height==p.getHeight() && super.equals(otherObject);

	}

}