public class PairTester
{
   public static void main(String[] args)
   {
      Pair<Integer> p = new Pair<Integer>(17, 19);
      p.swap();
      System.out.println(p.getFirst());
      System.out.println(p.getSecond());

      Pair<String> p2 = new Pair<String>("First", "Second");
      p2.swap();
      System.out.println(p2.getFirst());
      System.out.println(p2.getSecond());
   }
}
