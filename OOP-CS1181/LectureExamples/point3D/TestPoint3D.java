public class TestPoint3D{
	public static void main(String[] args){
		Point3D p1 = new Point3D();
		Point3D p2 = new Point3D(10,22,30);
		p1.move(1,2,3);
		System.out.println(p1.getZ());
		System.out.println(p2.getX());
		p2.move(100,200,300);
		System.out.println(p2.distance());

		System.out.println(p1);
		System.out.println(p2);

	}
}