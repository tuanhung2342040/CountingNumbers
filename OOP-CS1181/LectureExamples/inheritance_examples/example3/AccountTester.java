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
      
      SavingsAccount dadsSavings  = new SavingsAccount(0.5);
      dadsSavings.deposit(10000);

      momsSavings.transfer(500,dadsSavings);   
	   
	  System.out.println("mom: "+momsSavings.getBalance());
	  System.out.println("dad: "+dadsSavings.getBalance());

     System.out.println(momsSavings);
     System.out.println(dadsSavings);
   }
}
