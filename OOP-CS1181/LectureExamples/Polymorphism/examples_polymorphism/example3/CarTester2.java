
public class CarTester2
{  
  public static void main(String[] args)
  {  
    Camry car1 = new Camry();
    Toyota car2 = car1;
    Car car3 = car2;
    car1.printSymbol();
    car2.printSymbol();
    car3.printSymbol();
  }
}
//----
abstract class Car {
  private String type;
  public Car ( ) { 
    type = "Car";
  }    
  public String getType() {
    return type;
  }
  public abstract void printSymbol(); 
} 
//----
class Toyota extends Car { 
  public Toyota( )  { 
    super(); 
  } 
  // define body of an abstract method
  public void printSymbol()  { 
    System.out.println(getType()+" : Toyota ");
  }
} 
//----
class Camry extends Toyota{ 
  public Camry()  { 
    super(); 
  } 
  public void printSymbol()  { 
    System.out.print("Camry: ");
    super.printSymbol();
  }
} 


