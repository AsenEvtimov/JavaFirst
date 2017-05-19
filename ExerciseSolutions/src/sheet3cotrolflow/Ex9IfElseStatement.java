package sheet3cotrolflow;

import java.util.Scanner;

public class Ex9IfElseStatement {

	public static void main (String [] args){

		//while (true) { /*we can use infinite loop just for testing purpose to keep program running*/

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter an int: ");
			int num = scanner.nextInt();

			if (num >= 1 && num <= 10)
				System.out.println("num is in the range 1 to 10");

			else if (num >= 11 && num <= 20)
				System.out.println("num is in the range 11 to 20");

			else if (num >= 21 && num <= 30)
				System.out.println("num is in the range 21 to 30");

			else if (num >= 31 && num <= 40)
				System.out.println("num is in the range 31 to 40");

			else if (num >= 41 && num <= 50)
				System.out.println("num is in the range 41 to 50");

			else
				System.out.println("num is over 50 or some other number under 0");
		//}/*End of infinite loop used for testing purposes*/
		scanner.close();

	}
}
