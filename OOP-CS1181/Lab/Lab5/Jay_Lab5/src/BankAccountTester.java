import java.util.ArrayList;
import java.util.Collections;

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
		ArrayList<BankAccount> list = new ArrayList<>();
		list.add(new BankAccount(10000));
		list.add(new BankAccount(50000));
		list.add(new BankAccount(20000));
		list.add(new BankAccount(40000));
		list.add(new BankAccount(30000));

		Collections.sort(list);

		for(int i = 0; i < list.size(); i++){
			BankAccount b = list.get(i);
			System.out.println(b.getBalance());
		};


	}
} 
