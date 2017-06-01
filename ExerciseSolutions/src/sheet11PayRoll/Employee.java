package sheet11PayRoll;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

abstract class Employee {

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public static int employeeID= 500010;
	
	public Employee (){
		employeeID++;
	}
	
	public Employee (String firstName, String lastName) {
		this();
		setFirstName(firstName);
		setLastName(lastName);
	}
	public Employee (String firstName, String lastName, LocalDate dateOfbirth) {
		this();
		setFirstName(firstName);
		setLastName(lastName);
		setDateOfBirth(dateOfbirth);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public abstract double earnings ();
	
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(
				FormatStyle.MEDIUM);
		return "\nEmployeeID: " + employeeID +
				"\nName: " + firstName + " "+ lastName +
				"\nDate Of Birth: " + dateOfBirth.format(formatter);
	}		
}
