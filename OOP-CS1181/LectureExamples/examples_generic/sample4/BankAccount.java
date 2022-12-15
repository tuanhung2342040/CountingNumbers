public class BankAccount implements Measurable
{ 
   private long id;
   private double balance;

   public BankAccount(long id, double balance) 
   { 
      this.id = id;
      this.balance = balance;
   }

   public double getBalance() 
   {
      return balance;
   }

   public double getMeasure()
   {
      return balance;
   }

   public long id() 
   {
      return id;
   }
   
   public String toString()
   {
      return "BankAccount[id=" + id + ",balance=" + balance + "]";
   }
}
