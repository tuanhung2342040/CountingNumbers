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

	public double geyX(){
		return x;
	}
	public double geyY(){
		return y;
	}

	public String toString(){
		return "[x= "+x+",y= "+y+"]";
	}
}