import java.util.ArrayList;
import java.util.Random;
// All casses have package access
public class GeometricShapeTester{
	
	private ArrayList<GeometricShape> shapes;
	public static void main(String[] args){
		GeometricShapeTester shapeTester = new GeometricShapeTester();
		// for(GeometricShape g : shapeTester.shapes){
		// 	System.out.println(g.getArea());
		// }
		System.out.println("\nTest case 1:");
		double average = shapeTester.findAverage();
		System.out.println("average: "+Math.round(average));
		
		System.out.println("\nTest case 2:");
		GeometricShape s = shapeTester.getMax();
		System.out.println(s);

		ArrayList<GeometricShape> shapes = shapeTester.getShapes();
		System.out.println("\nTest case 3:");
		System.out.println("list of the shapes:");
		for(GeometricShape e:shapes)
			System.out.println(e);

		System.out.println("\nTest case 4:");
		shapeTester.sort();
		System.out.println("shapes sorted in ascending order based on their area:");
		for(GeometricShape e:shapes)
			System.out.println(e);

	}
	public GeometricShapeTester(){
		shapes = new ArrayList<>();
		int size = 20;
		Random rand = new Random();
		int option;
		final int COORD = 50;
		final int LENGTH1 = 50;
		final int LENGTH2 = 100;
		for(int i=0; i<size; i++){
			option=rand.nextInt(4);
			switch(option){
				case 0:
				shapes.add(new Rectangle(
								rand.nextInt(COORD),
								rand.nextInt(COORD),
								rand.nextInt(LENGTH2),
								rand.nextInt(LENGTH2)));
				break;
				case 1:
				shapes.add(new Square(
								rand.nextInt(COORD),
								rand.nextInt(COORD),
								rand.nextInt(LENGTH2)));
				break;
				case 2:
				shapes.add(new Oval(
								rand.nextInt(COORD),
								rand.nextInt(COORD),
								rand.nextInt(LENGTH1),
								rand.nextInt(LENGTH2)));
				break;
				case 3:
				shapes.add(new Circle(
								rand.nextInt(COORD),
								rand.nextInt(COORD),
								rand.nextInt(LENGTH1)));
			}
		}	
	}

	/**
	 * This returns the average area of all shapes in the shapes array
	 * @return average area
	 */
	public double findAverage(){
		double sum = 0;
		for(GeometricShape gP : shapes){
			sum += gP.getArea();
		}
		return sum / shapes.size();
	}

	/**
	 * This returns the reference of the shape that has the maximum area
	 * @return reference of the shape
	 */
	public GeometricShape getMax(){
		GeometricShape max = shapes.get(0);
		for(GeometricShape gP : shapes){
			if(gP.getArea() > max.getArea())
				max = gP;
		}
		return max;
	}

	/**
	 * This sorts the shapes in ascending order based on their areas
	 */
	public void sort(){
		// selection sort
		for(int i = 0; i < shapes.size() - 1; i++){
			int min = i;
			for(int j = i + 1; j < shapes.size(); j++){
				if(shapes.get(j).getArea() < shapes.get(min).getArea())
					min = j;
			}
			// GeometricShape temp = shapes[i];
			// shapes[i] = shapes[min];
			// shapes[min]= temp; 
			GeometricShape temp = shapes.get(i);
			shapes.set(i, shapes.get(min));
			shapes.set(min, temp);
		}
	}

	/**
	 * This returns the reference of the shapes
	 * @return reference of the shapes
	 */
	public ArrayList<GeometricShape> getShapes(){
		return shapes;
	}
}

/**
 * This is an abstract class of GeometricShape
 */
abstract class GeometricShape{
	private int x; 
	private int y; 

	/**
	 * This constructs an general coordinate of a GeometricShape with x, and y
	 * @param x x-coordinate
	 * @param y y-coordinate
	 */
	public GeometricShape(int x,int y){
		this.x = x;
		this.y = y;
	}

	/**
	 * This returns the value of x
	 * @return value of x
	 */
	public int getX(){
		return x;
	}

	/**
	 * This returns the value of y
	 * @return value of y
	 */
	public int getY(){
		return y;
	}

	/**
	 * 
	 * @return
	 */
	abstract public double getArea();
	abstract public String toString();
}

class Rectangle extends GeometricShape{
	private int width;
	private int height;

	/**
	 * This constructs a Rectangle with x, y, width, and height
	 * @param x the x-coordinate
	 * @param y the y-coordinate
	 * @param width the width of the rectangle
	 * @param height the height the rectangle
	 */
	public Rectangle(int x, int y, int width, int height){
		super(x, y);
		this.width = width;
		this.height = height;
	}

	/**
	 * This returns the width of the rectangle
	 * @return rectangle's width
	 */
	public int getWidth(){
		return width;
	}

	/**
	 * This returns the height of the rectangle
	 * @return rectangle's height
	 */
	public int getHeight(){
		return height;
	}

	/**
	 * This returns the area of the rectangle, and it overrides the getArea() method of the GeometricShape class
	 * @return rectangle's area
	 */
	public double getArea(){
		if(width < 0 || height < 0){
			// -1 is a value that represents the either width or height is invalid
			return -1;
		}
		return Math.round(width * height * 1.0)/1.0;
	}

	/**
	 * This overrides the toString() method of the GeometricShape class
	 */
	@Override
	public String toString(){
		return "Rectangle: [x:" + getX() + ", y:" + getY() + ", width:" + width + ", height:" + height + ", area:" + getArea() + "]" ;
	}
}
class Square extends Rectangle{
	
	/**
	 * This constructs a Square with 3 dimensions x, y, and length
	 * @param x x-coordinate
	 * @param y y-coordinate
	 * @param length the length of the Square
	 */
	public Square(int x, int y, int length){
		super(x, y, length, length);
	}
	
	/**
	 * This overrides the toString() method of the Rectangle class
	 */
	@Override	
	public String toString(){
		return "Square: [x:" + getX() + ", y:" + getY() + ", length: "+ getWidth() + ", area:" + getArea() + "]";
	}
}

class Oval extends GeometricShape{

	// hR is the horizontal radius, and vR is the vertical radius
	private int hR;
	private int vR;

	/**
	 *  This constructs an Oval with x, y , horizontalRadius, and verticalRadius
	 * @param x x-coordinate of the Oval
	 * @param y y-coordinate of the Oval
	 * @param horRadius the horizontal radius of the Oval 
	 * @param verRadius the vertical radius of the Oval
	 */
	public Oval(int x, int y, int horRadius, int verRadius){
		super(x, y);	
		this.hR = horRadius;
		this.vR = verRadius;
	}

	/**
	 * This returns the horizontal radius of the Oval
	 * @return horizontal radius
	 */
	public int getHR(){
		return hR;
	} 

	/**
	 * This returns the vertical radius of the Oval
	 * @return vertical radius
	 */
	public int getVR(){
		return vR;
	}

	/**
	 * This return the area of the Oval, and it overrides the getArea() method of the GeometricShape class
	 * @return Oval's area
	 */
	public double getArea(){
		if(hR < 0 || vR < 0)
			// -1 is a value that represents the either width or height is invalid
			return -1;
		return Math.round(Math.PI * hR * vR * 1.0)/1.0;
	}
	
	/**
	 * This overrides the toString() method of the GeometricShape class
	 */
	@Override
	public String toString(){
		return "Oval: [x:" + getX() + ", y:" + getY() + ", h_radius:" + hR + ", v_radius:" + vR + ", area:" + getArea() + "]";
	}
}
class Circle extends Oval{
	
	/**
	 * This constructs a Circle with x, y, and radius
	 * @param x x-coordinate
	 * @param y y-coordinate
	 * @param radius the radius of the Circle
	 */
	public Circle(int x, int y, int radius){
		super(x, y, radius, radius);
	}

	/**
	 * This overrides the toString() method of the Oval class
	 */
	@Override
	public String toString(){
		return "Circle: [x:" + getX() + ", y:" + getY() + ", radius:" + getHR() + ", area:" + getArea() + "]"; 
	}
}
