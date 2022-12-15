//----
public class JapaneseCarTester
{  
  public static void main(String[] args)
  {  
    PathFinder pathFinder= new PathFinder();
    Civic civic = new Civic();
    Accord accord = new Accord();

    Honda honda = civic;// Honda is superclass of Civic
    Nissan nissan;
    Car acar; 

    honda.printSymbol();

    acar = accord; // Car is super class of all cars
    acar.printSymbol();

    acar = pathFinder;
    acar.printSymbol();    

  }  
}

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
//--------
class PathFinder extends Nissan{ 
   public PathFinder()  { 
      super(); 
   } 
    public void printSymbol()  { 
	System.out.print("Pathfinder: " );
         super.printSymbol();

    }
} 

//--------
class Corolla extends Toyota{ 
   public Corolla()  { 
      super(); 
   } 
    public void printSymbol()  { 
       System.out.print("Corolla: ");
       super.printSymbol();

   }
} 

//--------
class Camry extends Toyota{ 
   public Camry()  { 
       super(); 
   } 
    public void printSymbol()  { 
       System.out.print("Camry: ");
       super.printSymbol();

    }
} 

//--------
class Civic extends Honda{ 
   public Civic()  { 
       super(); 
   } 
    public void printSymbol()  { 
       System.out.print("Civic: ");
       super.printSymbol();

  }
} 
//--------
class Accord extends Honda{ 
   public Accord()  { 
      super(); 
   } 
    public void printSymbol()  { 
       System.out.print("Accord: ");
       super.printSymbol();

    }
} 
