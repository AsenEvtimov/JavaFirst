package sheet16Strings;

import java.util.Scanner;

public class Ex5SearchAletter {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
				
		for (int i = 0 ; i < 3; i++) {
			System.out.println("Enter a word");
			String text = input.next();
			System.out.println("Word " + (i+1) + " is: " + text);
			
			System.out.println("Enter a letter to search");
			String letter = input.next();
			
			int position = text.indexOf(letter);			
			
			if (position == -1) {
				System.out.println(letter + " is not found");
			}else
				System.out.println(letter + " is at positoin: " + (position+1));
		}
		input.close();
	}
}
