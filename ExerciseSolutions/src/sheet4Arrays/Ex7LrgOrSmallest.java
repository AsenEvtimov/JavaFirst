package sheet4Arrays;

import java.util.Scanner;


public class Ex7LrgOrSmallest {
	public static void main(String[] args) {


		int array [] = createIntArray();

		Ex7LrgOrSmallest  Ex7 = new Ex7LrgOrSmallest();
		Ex7.largestAndSmallest(array);

	}
	
	public static int[] createIntArray(){
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
		return array;
	}

	public void largestAndSmallest(int array[] ) {
		int largest = array[0];
		int position = 0;
		for(int i = 0; i<array.length; i++)
			if (array[i] > largest) {
				largest = array[i];
				position = i;
			}
		System.out.println(largest +" is the largest on position " + (position+1));
	}
	
}
