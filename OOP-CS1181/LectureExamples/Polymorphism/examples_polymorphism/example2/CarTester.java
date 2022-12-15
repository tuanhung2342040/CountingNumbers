
public class CarTester
{  
   public static void main(String[] args)
   {  
      Honda myCar1 = new Honda( );
      myCar1.printSymbol();
      
      Toyota myCar2 = new Toyota( );
      myCar2.printSymbol();
         
      Nissan myCar3 = new Nissan( );
      myCar3.printSymbol();
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

//--------
class Nissan extends Car { 
  public Nissan( )  { 
    super(); 
  } 
  // define body of an abstract method
  public void printSymbol()  { 
    System.out.println(getType()+" : Nissan ");
  }
} 

//--------
class Toyota extends Car { 
  public Toyota( )  { 
      super(); 
  } 
  // define body of an abstract method
  public void printSymbol()  { 
    System.out.println(getType()+" : Toyota ");
  }
} 

//--------
class Honda extends Car { 
  public Honda( )  { 
    super(); 
  } 
  // define body of an abstract method
  public void printSymbol()  { 
    System.out.println(getType()+" : Honda ");
  }
} 
