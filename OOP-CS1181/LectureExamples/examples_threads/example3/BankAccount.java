
/**
*   A bank account has a balance that can be changed by 
*   deposits and withdrawals.
*/
public class BankAccount
{
   private double balance;

   /**
   *   Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {
      balance = 0;
   }

   /**
   *   Deposits money into the bank account.
   *   @param amount the amount to deposit
   */
   public void deposit(double amount)
   {
         double newBalance = balance + amount;
         balance = newBalance;
         System.out.println("After deposit: " + balance);
      
   }
   
   /**
   *   Withdraws money from the bank account.
   *   @param amount the amount to withdraw
   */
   public void withdraw(double amount) 
   {
      double newBalance = balance - amount;
      balance = newBalance;
      System.out.println("After withdraw: " + balance);
   }
   
   /**
   *   Gets the current balance of the bank account.
   *   @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
   
  
}
