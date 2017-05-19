package sheet3cotrolflow;

import java.util.Scanner;

public class Ex8RandomNumberOfInputs {

	public static void main(String[] args) {

		Scanner  scanner = new Scanner(System.in);
		
		int num = 0;
		int total = 0;
		int counter = 0;
		do {
			System.out.println("Enter integer: ");
						
			num = scanner.nextInt();
			if (num != -1) {
				total = total + num;
				counter++;
			}
			
			
		} while (num !=-1);
		
		System.out.println("the total is " + total);
		System.out.println("the average is " + (double)total/counter);
		
		scanner.close();
	}


}
