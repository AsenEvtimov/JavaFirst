package sheet15Exeptions;

public class InvalidWeekdayException extends Exception {

	public InvalidWeekdayException () {
		
	}
	public InvalidWeekdayException (String message) {
		super(message);
	}
}
