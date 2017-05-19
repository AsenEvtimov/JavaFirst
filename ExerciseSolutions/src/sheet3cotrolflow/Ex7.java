
package sheet3cotrolflow;

import java.util.Scanner;
public class Ex7 {
	public static void main(String[] args) {
		int total = 0;
		double avg = 0;
	Scanner input = new Scanner(System.in);
	int i = 0;
	for (   ; i < 5; i++) {
		System.out.print("Enter number: ");
		int a = input.nextInt();
		total = total + a;
		
		System.out.println("Number " + i + " is: " + a + " and total is " + total);
		
	}
	avg = (double)total/i;
	System.out.println("Total of all 5 numbers is " + total + " and average is " + avg);
	
	input.close();
	}
}