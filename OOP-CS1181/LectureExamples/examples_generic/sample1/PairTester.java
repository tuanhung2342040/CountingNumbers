public class PairTester
{
   public static void main(String[] args)
   {
      Pair<Integer, Integer> p = new Pair<Integer, Integer>(17, 19);
      System.out.println(p.getFirst());
      System.out.println(p.getSecond());

      Pair<String, Double> p2 = new Pair<String, Double>("test", 19.8);
      System.out.println(p2.getFirst());
      System.out.println(p2.getSecond());
   }
}
