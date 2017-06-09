package sheet14Trainees;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Trainee {

	private String name;
	private LocalDate dateOfBirth;
	private int ppsNumber;
	
	public Trainee() {
		
	}
	
	public Trainee (String name, LocalDate dateOfBirth, int ppsNumber) {
		
		setName(name);
		setDateOfBirth(dateOfBirth);
		setPpsNumber(ppsNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getPpsNumber() {
		return ppsNumber;
	}

	public void setPpsNumber(int ppsNumber) {
		this.ppsNumber = ppsNumber;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return "\nTrainee name: " + name + 
				"\nApprentice: " + this.getClass().getSimpleName() +
				"\nppsNumber: " + ppsNumber+ 
				"\nDate Of Birth: " + dateOfBirth.format(formatter) ;				 
	}	
}
