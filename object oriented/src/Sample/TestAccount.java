package Sample;

import com.ibm.bank.AccountFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;

public class TestAccount {

	public static void main(String[] args) {
//	    Bank c = AccountFactory.openCurrent("Polo");
		// parent class reference for polymorphic nature intact
		// the purpose of having abstract method is to keep the super class polymorphic
		// nature intact
//		c.withdraw(4000);
//		c.withdraw(6000);
//		
//		c.deposit(3000);
//		c.deposit(5000);
//		c.statement();

		Bank s = AccountFactory.openSavings("Jack");
		try {
			s.withdraw(4000);
		} catch (BalanceException e) {
//			e.printStackTrace(); // For developers - to troubleshoot errors
//			System.out.println(e); //For logging - to aduit the behaviour of applications
			System.out.println(e.getMessage()); // for end users
		}
//		s.deposit(2000);
//		s.withdraw(1000);
//		s.deposit(1000);
//		s.withdraw(1500);
//		s.statement();
	}
}
