import java.io.Serializable;

public class MyPointB implements Serializable
{   
   public MyPointB()
   {
		x=0;
		y=0;
   }

   public MyPointB(double x, double y)
   {
      this.x = x;
		this.y = y;
   }
   public String toString(){
			return "x: "+x+" y: "+y;
	}
   private double x;
	private double y;
}
