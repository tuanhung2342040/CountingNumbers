/**
   This program tests the Bank class.
*/
   public class BankTester
   {
      public static void main(String[] args)
      {
         Bank firstBankOfJava = new Bank();
         firstBankOfJava.addAccount(new BankAccount(1001, 20000));
         firstBankOfJava.addAccount(new BankAccount(1015, 10000));
         firstBankOfJava.addAccount(new BankAccount(1729, 15000));
       
         double threshold = 15000;
         int c = firstBankOfJava.count(threshold);
         System.out.println(c + " accounts with balance >= " + threshold);
      
         int accountNumber = 1015;
         BankAccount a = firstBankOfJava.find(accountNumber);
         if (a == null) 
            System.out.println("No account with number " + accountNumber);
         else
            System.out.println("Account with number " + accountNumber
               + " has balance " + a.getBalance());
      
         System.out.println("Highest balance = "+ firstBankOfJava.getMaximum().getBalance());
         
         System.out.println(firstBankOfJava);
      
      }

   }
