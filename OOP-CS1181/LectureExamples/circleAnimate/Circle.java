public class Circle{

	private Point2D center;
	private double radius;

	public Circle(){
		center = new Point2D();
		radius =1;

	}
	public Circle(double x, double y, double r){
		center = new Point2D(x,y);
		radius = r;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public void move(double x, double y){
		
		center.move(x,y);
	}

	public double getArea(){
		return radius*radius*Math.PI;
	}
	public double getCircumference(){
		return 2*radius*Math.PI;
	}

	public String toString(){
		return "["+center.toString()+", r= "+radius+"]";
	}
}

 