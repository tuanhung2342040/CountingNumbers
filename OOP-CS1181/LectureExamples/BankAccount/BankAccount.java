/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
    private double balance;
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
    // this.balance = 0;
     this(0);
   
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double balance)
   {   
      this.balance = balance;
   }

   /**
      Deposits money into the bank account.
      @param amount to deposit
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
      
   }

   /**
      Withdraws money from the bank account.
      @param amount  to withdraw
   */
   public void withdraw(double amount)
   {   
      balance = balance - amount;
    
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }

  
}

