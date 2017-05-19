package Sheet5Classes;

//import javax.swing.JOptionPane;

public class MainForEx4Emails {

	public static void main(String[] args) {

		MailAccounts acount1 = new MailAccounts(999,"asenevtmiov@mail.bg", "123456");
		System.out.println(acount1);

		MailAccounts acount2 = new MailAccounts(150, "ewelinadzidzina","12345678");
		System.out.println(acount2);
		
		MailAccounts acount3 = new MailAccounts(MailAccounts.STORAGE_1_TB, "sandrahawkins","12345678");
		System.out.println(acount3);
		
		MailAccounts acount4 = new MailAccounts(MailAccounts.STORAGE_1_TB, "asenevtimov@mail.bg","1234567");
		System.out.println(acount4);
		
		/*String mail = JOptionPane.showInputDialog("Enter Email");
		String password = JOptionPane.showInputDialog("Enter Password");
		MailAccounts acount4 = new MailAccounts(mail, password);
		JOptionPane.showMessageDialog(null, acount4);*/
	}	
}

