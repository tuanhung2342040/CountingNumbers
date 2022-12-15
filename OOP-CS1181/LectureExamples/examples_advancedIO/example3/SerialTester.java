import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
   This program tests serialization of a Bank object.
   If a file with serialized data exists, then it is
   loaded. Otherwise the program starts with a new bank.
   Bank accounts are added to the bank. Then the bank 
   object is saved.
*/
public class SerialTester
{
   public static void main(String[] args)
         throws IOException, ClassNotFoundException
   {     
      ArrayList <BankAccount> bank;
      
      File f = new File("bank.dat");
      if (f.exists())
      {
         ObjectInputStream in = new ObjectInputStream
               (new FileInputStream(f));
        
         bank = (ArrayList<BankAccount>) in.readObject();
         in.close();
      }
      else 
      {
         bank = new ArrayList<BankAccount>();
         bank.add(new BankAccount(1001, 20000));
         bank.add(new BankAccount(1015, 10000));
			bank.add(new BankAccount(1025, 11000));

      }

      // Deposit some money
      BankAccount a = bank.get(1);
      a.deposit(100);
      System.out.println(a.getAccountNumber() + " :  " + a.getBalance());
      

      ObjectOutputStream out = new ObjectOutputStream
            (new FileOutputStream(f));
      out.writeObject(bank);
      out.close();
   }
}
