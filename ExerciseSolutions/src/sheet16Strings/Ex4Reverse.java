package sheet16Strings;

import java.util.Scanner;

public class Ex4Reverse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Write a sentence");
		String text = input.nextLine();
		
		System.out.println("Sentence:\n" + text);
						
		char [] textArray = text.toCharArray();
		
		System.out.println("Sentence reversed:");
		for (int i = textArray.length-1; i >=0; i--)
		System.out.print(textArray[i]);
		
		input.close();
	}
}
