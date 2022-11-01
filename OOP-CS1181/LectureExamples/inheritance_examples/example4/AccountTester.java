/**
   This program tests the BankAccount class and
   its subclasses. 
*/
public class AccountTester
{  
   public static void main(String[] args)
   {  
      SavingsAccount momsSavings  = new SavingsAccount(0.5);
      momsSavings.deposit(10000);
	   
      CheckingAccount harrysChecking  = new CheckingAccount(100);
      momsSavings.transfer(500,harrysChecking);   
	   
	System.out.println("mom: "+momsSavings.getBalance());
	System.out.println("harry: "+harrysChecking.getBalance());
	   
      
     
   }
}
