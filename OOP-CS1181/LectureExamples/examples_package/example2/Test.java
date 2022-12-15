import sedan.Sedan;
public class Test{
  public static void main(String[] args){
    Sedan myCar = new Sedan();
    myCar.move();
    myCar.stop();
    System.out.println(myCar.getType());
  }
}