package sheet4A2dArrays;

import java.util.Scanner;

public class Ex2NamesAndAddresses {

	public static void main (String [] args) {

		String [] [] addresses = {
				{"Joe Murphy", "12 Main Street", "Finglas", "Dublin 11"},
				{"Mary Jones", "36 Amiens Street", "Dublin 1"},
				{"Pat O'Connor", "26 South Main Street", "Wexford", "Co. Wexford"}

		};

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a name to print its address: ");
		String name = scanner.nextLine();
		scanner.close();

		boolean isFound = false;

		for (int i = 0; i < addresses.length; i++) {
			if (addresses[i][0].equalsIgnoreCase(name)) {
				isFound = true;
				System.out.println("Address for : " + addresses[i][0]);
				for (int j = 1; j <addresses[i].length; j++){
					System.out.println(addresses[i][j]);
					
				}
				break;
			}
		}
		if (!isFound) {
			System.out.println(name + " not found");
		}

	}	
}