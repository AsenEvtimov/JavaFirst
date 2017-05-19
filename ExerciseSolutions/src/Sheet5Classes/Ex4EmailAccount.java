package Sheet5Classes;

class MailAccounts {

	private String mailAddress;
	private String password;
	private static final int passwordLimit = 7;
	private static int mailCounter = 1;
	private int mailNo;
	private int storageLimit;

	public static final int STORAGE_100_GB = 100;
	public static final int STORAGE_500_GB = 500;
	public static final int STORAGE_1_TB = 1;

	//constructors
	public MailAccounts (){
		mailNo = mailCounter;
		mailCounter++;

	}

	public MailAccounts (int storageLimit, String mailAddress, String password){
		this();
		setStorage(storageLimit);
		setMailAddress(mailAddress);
		setPassword(password);
	}

	//setters
	public void setStorage (int storageLimit) {

		if (storageLimit == STORAGE_100_GB || storageLimit == STORAGE_500_GB
				|| storageLimit == STORAGE_1_TB){
			this.storageLimit = storageLimit;
		} else {
			System.out.println("Error 01: Entar Valid Storage Limit: \nMust be 100, 500  or 1000");
		}

	}

	public void setMailAddress(String mailAddress) {// must contain @ and . 

		if (mailAddress.contains("@") && mailAddress.contains(".") 
				&& mailAddress.indexOf("@") < mailAddress.indexOf(".")){
			this.mailAddress = mailAddress;
		} else {
			System.out.println("Error 02: Invalid Email Addrss: Must contain @ and a dot");
		}

	}

	public void setPassword(String password){
		
		if (password.length() <= passwordLimit) {
			this.password = password;
		}
		else {
			System.out.println("Error 03: Invalid password: Enter max " + passwordLimit + " char");
		}
		
	}

	//getters

	int getStorage (){
		return storageLimit;

	}
	String getMailAddress() {
		return mailAddress;
	}

	String getPassword() {
		return password;
	}

	//get int to string

	/*public String getStorageLimitAsString() {
		switch (storageLimit) {
			case STORAGE_1_TB:
				return "1 TB";
		default:

		}
	}*/

	//print to string
	public String toString () {
		return "\nAccount: " + mailNo +
				"\nStorage limit: " + storageLimit + 
				((storageLimit == STORAGE_1_TB) ? " TB" : " GB") +//conditional operator
				"\nEmail: " + mailAddress +
				"\nPassword: " + password + "\n";
	}
}
