package sheet16Strings;

import java.util.Scanner;

public class Ex5SearchAletterWithArray {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		for (int i = 0 ; i < 3; i++) {
			System.out.println("Enter a word");
			String text = input.next();
			System.out.println("Word " + (i+1) + " is: " + text);
			
			System.out.println("Enter a letter to search");
			String letter = input.next();
			
			char [] lettersArray =  text.toCharArray();
			
			boolean isFound = false;
			for (int  j =0; j < lettersArray.length; j ++){
				if (lettersArray[j] == letter.charAt(0)){
				System.out.println(letter + " is found on position: " + (j+1));
				isFound = true;
				}	
			}
			if (!isFound)
				System.out.println(letter + " is not found");
		}
		input.close();
	}

}
