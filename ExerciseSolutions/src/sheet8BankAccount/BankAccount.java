package sheet8BankAccount;

public class BankAccount {

	private String name;
	private String address;
	private int accountNumber;
	private double balance;
	private double intrest;
	//private int numbersOfaccounts;
	private double newDepositamount;

	public static int accountCounter;
	private static int accoutnNumCounter = 40005100;
	private static double annualIntrest = 0.07;

	public BankAccount () {
		this.accountNumber = ++accoutnNumCounter;
		balance = 0;
		accountCounter++;
	}

	public BankAccount (String name, String address){
		this();
		setName(name);
		setAddress(address);
	}

	public BankAccount (String name, String address, double newDepositAmount){
		this();
		setName(name);
		setAddress(address);
		deposit(newDepositAmount);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAccountNumber() {
		return accountNumber;
	}	
	
	public double getBalance() {
		return balance;
	}

	public void deposit (double newDepositAmount) {
		if (newDepositAmount > 0){
			this.balance = balance + newDepositAmount;
			System.out.println("\nNew balance after deposit " + this.balance);
		}
		else {
			System.out.println("Invalid Deposit Amount");
		}
		//return balance;
	}

	public double withdraw (double withdrawAmount) {
		if (withdrawAmount <= balance) {
			this.balance = balance - withdrawAmount;
			System.out.println("\nNew balance after withdraw " + this.balance);
		}
		else {
			System.out.println("Cannot be overdrawn, max withdraw: " + balance);
		}
		return balance;
	}

	public void annualIntrest () {
		this.intrest = balance*annualIntrest;
	}
	
	public double getAnnualIntrest(){
		return intrest;
	}
	
	public void withdrawAll () {
		System.out.println("Withdraw all - Avaialable: " + this.balance);
		this.balance = 0;
	}

	@Override
	public String toString() {
		return "\nAccount Number " + accountNumber +
				"\n" + name +
				"\n" + address +
				"\nBalance: " + balance;
	}
}

