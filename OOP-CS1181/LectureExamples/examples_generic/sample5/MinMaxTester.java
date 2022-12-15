public class MinMaxTester
{
   public static void main(String[] args)
   {
      String[] words = 
      {
         "Mary", "had", "a", "little", "lamb"
      };

      Pair<String, String> mm = PairUtil.minmax(words);
      System.out.println(mm.getFirst());
      System.out.println("Expected: Mary");
      System.out.println(mm.getSecond());
      System.out.println("Expected: little");
   }
}
