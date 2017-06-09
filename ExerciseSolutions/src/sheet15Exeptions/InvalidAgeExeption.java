package sheet15Exeptions;

import javax.swing.JOptionPane;

public class InvalidAgeExeption extends Exception {

	public InvalidAgeExeption () {
		
	}
	public InvalidAgeExeption (String message) {
		super(message);
	}
}
