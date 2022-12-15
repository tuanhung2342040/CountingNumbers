public class MinMaxTester
{
   public static void main(String[] args)
   {
      BankAccount[] accounts = 
      {
         new BankAccount(1000, 2000),
         new BankAccount(1001, 4000),
         new BankAccount(1002, 200),
         new BankAccount(1003, 8000),
         new BankAccount(1004, 150)
      };

      Pair<BankAccount, BankAccount> p = PairUtil.minmax(accounts);
      System.out.println(p.getFirst());
      System.out.println("Expected: min");
      System.out.println(p.getSecond());
      System.out.println("Expected: max");
   }
}
