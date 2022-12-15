public class JapaneseCarArrayTester
{  
   public static void main(String[] args)
   {  
  Object [] objArr = new Object[10];
  objArr[0] = new PathFinder();
  objArr[1] = "this is a text";
  objArr[2] = new Civic();
  objArr[3] = new Toyota();
  objArr[4] = new Double(10);
  objArr[5] = new Camry();
  objArr[6] = "another String";
  objArr[7] = new Nissan();
        
  for (int i=0; i<objArr.length; i++){
    if (objArr[i] instanceof Car)
      ((Car)objArr[i]).printSymbol();
  } 
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
//----

