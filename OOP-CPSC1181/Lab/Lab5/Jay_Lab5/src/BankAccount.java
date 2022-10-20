/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount implements Comparable<BankAccount>
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
   public BankAccount(double initialBalance)
   {   
      this.balance = initialBalance;
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

   /**
    Compares two bank accounts.
    @param other the other BankAccount
    @return 1 if this bank account has a greater balance than the other one,
    -1 if this bank account is has a smaller balance than the other one,
    and 0 if both bank accounts have the same balance
    */
   public int compareTo(BankAccount other)
   {
      if(balance > other.getBalance()){
         return -1;
      }
      else if(balance < other.getBalance()){
         return 1;
      }
      else {
         return 0;
      }
   }



}

