package sheet3cotrolflow;

import java.util.Scanner;

public class Ex10Floats {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers do you want in the array? ");
		int size = scanner.nextInt();
		System.out.println("The size of the array will be " + size);

		int array [] = new int [size];
		int i = 0;
		for (	; i < array.length; i++) {
			System.out.print("Please enter number: ");
			array[i] = scanner.nextInt();
		}
		scanner.close();
		Ex10Floats ex10 = new Ex10Floats();
		ex10.largestAndSmallest(i, array);
	}
	public void largestAndSmallest(int i, int array[] ) {
		int largest = i;


		//for loop its need
		for(i = 0; i<array.length; i++)
			if (array[i] > largest) {
				largest = array[i];
				System.out.println(largest +"is the largest");
			}
	}
}