

import java.util.Date;
public class RunnableTest {
  public static void main(String[] args) {
    
    System.out.println("=== RunnableTest ===");
    
    // Anonymous class Runnable
    Runnable r1 = new Runnable(){
      int count =10;
      @Override
      public void run(){
        for(int i=0; i<count; i++)
          System.out.println("One!");
      }
    };
    Thread t1 = new Thread(r1);

    // Lambda Runnable
    Runnable r2 = () -> {
      int count=10;
     for(int i=0; i<count; i++)
          System.out.println("Two!");
    }; 
     
    Thread t2 = new Thread(r2);
    
    t1.start();
    t2.start();
    
  }
}

