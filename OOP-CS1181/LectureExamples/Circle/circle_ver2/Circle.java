public class Circle{
	/*private double xc;
	private double yc;*/
	private Point2D center;
	private double radius;

	public Circle(){
		radius = 1;
		center = new Point2D();
	}

	public Circle(double xc, double yc, double r){

		center = new Point2D(xc,yc);
		radius = r;
	}

	public void move(double newx, double newy){
		/* xc = newx;
		 yc = newy;*/
		 center.move(newx, newy);
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public double getArea(){
		return Math.pow(radius,2)*Math.PI;
	}

	public double getCircumference(){
		return 2*radius*Math.PI;
	}

	// sample call
	public double getX(){
		return center.getX();
	}

	public Point2D getCenter(){
		return center;

	}

	@Override
	public String toString(){
		return center.toString()+", r: "+radius;
	}
}