
public class Example1 {  
  public static void main(String[] args) {  
    Honda myCar = new Honda();
    myCar.printSymbol();
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
class Honda extends Car { 
  public Honda() { 
    super(); 
  } 
  // define body of an abstract method
  public void printSymbol()  { 
    System.out.println(getType()+" : Honda");
  }
} 


