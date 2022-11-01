public class Circle{
	private double xc;
	private double yc;
	private double radius;
	// default constructor
	public Circle(){
		radius = 1;
	}

	public Circle(double x, double y, double r){
		xc = x;
		yc = y;
		radius = r;
	}

	public void move(double newx, double newy){
		 xc = newx;
		 yc = newy;
	}
	public void setRadius(double r){
		radius = r;
	}
	public double getArea(){
		return Math.pow(radius,2)*Math.PI;
	}
	/* Wrong:
	public double getArea(double r){
		return r*r*Math.PI;
	}*/
	public double getCircumference(){
		return 2*radius*Math.PI;
	}

	@Override
	public String toString(){
		return "x: "+xc+", y: "+yc+", r: "+radius;
	}
}