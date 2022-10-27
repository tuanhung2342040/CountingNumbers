/**
  A class to test the BankAccount class.
*/
public class BankAccountTester
{
    /**
       Tests the methods of the BankAccount class.
       @param args not used
    */
    public static void main(String[] args)
    {
	BankAccount harrysChecking = new BankAccount();
	System.out.println(harrysChecking.getBalance());
	harrysChecking.deposit(2000.98);
	harrysChecking.withdraw(500.34);
	System.out.println(harrysChecking.getBalance());
   }
} 
