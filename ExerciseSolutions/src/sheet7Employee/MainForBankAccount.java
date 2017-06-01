package sheet7Employee;

import sheet8BankAccount.BankAccount;

public class MainForBankAccount {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount("Asen Evtimov","11 Cedar Square, Swords");
		System.out.println(account1);
		
		account1.deposit(555550);
		
		account1.withdraw(15550);
		
		account1.annualIntrest();
		System.out.printf("\nAnnual Intrest: %.2f", account1.getAnnualIntrest());
		
		System.out.println("\n----------------------------");
		
		/*BankAccount account2 = new BankAccount("Asen Evtimov","11 Cedar Square, Swords", 550550);
		System.out.println(account2);
		
		account2.withdrawAll();
		//System.out.println("New balance " + account2.getBalance());
				
		BankAccount account3 = new BankAccount("Asen Evtimov", "11 Cedar Square", 0.10);
		
		System.out.println(account3);
		account3.deposit(10500);
		*/
				
	System.out.println("\nNumbers of accounts created " + BankAccount.accountCounter);
	}
		

}
