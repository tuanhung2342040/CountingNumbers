/**
 * Defines a circle by its center(xc,yc), and radius
 */ 
public class Circle{
	private double xc;
	private double yc;
	
	private double radius;
	/**
	 * creates a cricle at coordinates (0,0), radius =1
	 */ 
	public Circle(){
		radius = 1;
	}
	/**
	 * creates a cricle at coordinates (x,y), radius =r
	 * @param x: x coordinates of the center
	 * @param y: y coordinates of the center
	 * @param r: radius of the circle
	 */ 
	public Circle(double x, double y, double r){

		xc = x;
		yc = y;
		radius = r;
	}
	/**
	* Moves the center of the circle to new coordinates
	* @param newx: new x coordinates of the center
	* @param newy: new y coordinates of the center
	*/ 
	public void move(double newx, double newy){
		 xc = newx;
		 yc = newy;
	}
	/**
	* Sets the radius of the circle to a new value
	* @param radius: new value of the radius
	*/ 
	public void setRadius(double radius){
		this.radius = radius;
	}
	/**
	* Returns the radius of the circle
	* @return radius of the circle
	*/
	public double getRadius(){
		return radius;
	}

	/**
	* Returns the area of the circle
	* @return area of the circle
	*/
	public double getArea(){
		return Math.pow(radius,2)*Math.PI;
	}
	/* Wrong:
	public double getArea(double r){
		return r*r*Math.PI;
	}*/

	/**
	* Returns the circumference of the circle
	* @return circumference of the circle
	*/
	public double getCircumference(){
		return 2*radius*Math.PI;
	}
	/**
	 * Overrides the toString() method of the Object class
	 */ 
	@Override
	public String toString(){
		return "x: "+xc+", y: "+yc+", r: "+radius;
	}
}