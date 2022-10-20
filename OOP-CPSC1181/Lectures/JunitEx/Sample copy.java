public class Sample{
	private int x;
	private double y;
	private String z;
	public Sample(int x, double y, String z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public String getZ(){
		return z;
	}

	// returns dummy value for test purpose
	public boolean getBoolean(){
		return true;
	}

	// returns dummy value for test purpose
	public Object getReference(){
		return null;
	}



}