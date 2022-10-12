package point3D_ver1;

public class Point3D extends Point2D{
	private double z;

	public Point3D(){
		super();
		z=0;
	}

	public Point3D(double x, double y, double z){
		super(x,y);
		this.z=z;
	}
	
	public void move(double x, double y, double z){
		super.move(x,y);
		this.z = z;
	}

	public double getZ(){
		return z;
	}
	@Override
	public double distance(){
		return Math.sqrt(getX()*getX()+getY()*getY()+z*z);
	}

	@Override
	public String toString(){
		return "[z: "+z+super.toString()+"]";

	}

}