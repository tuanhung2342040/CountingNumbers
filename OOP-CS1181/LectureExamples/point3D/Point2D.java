public class Point2D{
	private double x;
	private double y;
	public Point2D(){
	}
	public Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void move(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double distance(){
		return Math.sqrt(x*x+y*y);
	}
	@Override
	public String toString(){
		return "[x: "+x+", y: "+y+"]";

	}

}