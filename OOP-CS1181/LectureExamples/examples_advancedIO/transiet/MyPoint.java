import java.io.*;

public class MyPoint implements Serializable
{   
	private transient double x;
	private transient double y;
   public MyPoint()
   {
		x=0;
		y=0;
   }

   public MyPoint(double x, double y)
   {
      this.x = x;
	  this.y = y;
   }
   public String toString(){
			return "x: "+x+" y: "+y;
	}
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.defaultWriteObject();
		out.writeDouble(x);
		out.writeDouble(y);
		System.out.println("write");
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		in.defaultReadObject();
		this.x = in.readDouble();
		this.y = in.readDouble();
		System.out.println("read");
	}
  
}
