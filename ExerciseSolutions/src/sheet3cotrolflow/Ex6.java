
package sheet3cotrolflow;

import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
		int total = 0;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter an integer: ");
	int a = input.nextInt();
	total = total + a;
	System.out.println("Number 1 is: " + a + " and total is " + total);
	
	System.out.print("Please enter an integer: ");	
	int b = input.nextInt();
	total = total + b;
	System.out.println("Number 2 is " + b + " and total is " + total);
	
	System.out.print("Please enter an integer: ");
	int c = input.nextInt();
	total = total + c;
	System.out.println("Number 3 is " + c + " and total is " + total);
	
	input.close();
	}
		
}	