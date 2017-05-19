
package sheet3cotrolflow;

import java.util.Scanner;
public class Ex5InputFromConsole {
	public static void main(String[] args) {
	int height = 0;
	int breadth = 0;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter height: ");
	 height = input.nextInt();	
		
	System.out.print("Please enter breadth: ");
	 breadth = input.nextInt();
	
	Ex5 a = new Ex5();
	a.getArea(height,breadth);
	
	input.close();
	}
	
	
}	