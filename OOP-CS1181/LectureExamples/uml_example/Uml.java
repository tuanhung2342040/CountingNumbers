public class Uml{
	public static void main(String[] args){
		D d = new D(25);
		System.out.println(d.sum());
	}
}	
	
interface A {
	int sum();
}

abstract class B{
	abstract public int getX();
	abstract public int getY();
}

abstract class C1 extends B{
    int x=10;
	public int getX() {
      return x;
   }
}

class D extends C1 implements A{
	private E e;
	private int y;
	public D(int y){
		e = new E(y);
     	this.y = y;
	}
	public int getY(){
		return y;
	}
	public int sum(){
       return getX() + y + e.getZ();
	}    
}

class E {
	int z;
    public E(int z) { 
        this.z = 2*z ;
    }
    public int getZ(){
        class P{
			public int doIt(){
       			return z*2 ;
       		}	
		}    
		P p = new P();
		z=p.doIt();
		return z;
	}	
}