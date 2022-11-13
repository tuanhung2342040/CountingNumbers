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
      @param balance the initial balance
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
      if(amount < 0){
         throw new negativeZeroAmountException("Error: You deposited the negative amount. The action cannot be processed");
      }
      else if(amount == 0){
         throw new negativeZeroAmountException("Error: You deposited nothing to the account. The action cannot be processed");
      }
		balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount  to withdraw
   */
   public void withdraw(double amount)
   {
      if(amount > balance){
         throw new IllegalAmountException("Error: withdraw exceeds your balance.");
      }
      else if(amount == 0){
         throw new negativeZeroAmountException("Error: You withdrew nothing from the account. The action cannot be processed");
      }
      else if(amount <0){
         throw new negativeZeroAmountException("Error: You withdrew the negative amount. The action cannot be processed");
      }
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

