package sheet4Arrays;

import javax.swing.JOptionPane;

public class Ex8ordSystem {

	public static void main(String[] args) {

		int refNums [] = {1000,1001,1002,1003,1004};

		String productNames [] = {"Keybord","Mouse","Monitor","Mouse mat","Speakers"};

		double prices [] = {49.99,15.50,124.99,3.99,23.50};


		System.out.print("Ref Number"+"\tProduct Name"+ "\tPrice");
		System.out.println("\n-----------\t"+ "------------\t"+"------");		

		for (int i= 0; i<refNums.length; i++){

			System.out.printf("%-16d%-16s�%7.2f\n", 
					refNums[i], productNames[i], prices[i]);
		}
		
		
		String strRefNumber = JOptionPane.showInputDialog("Please enter a reference number");
		int refNumber = Integer.parseInt(strRefNumber);
		
		for (int i = 0; i < refNums.length; i++){
			if (refNumber == refNums[i]) {
				System.out.println(productNames[i]);
			}
		}
		}
}


