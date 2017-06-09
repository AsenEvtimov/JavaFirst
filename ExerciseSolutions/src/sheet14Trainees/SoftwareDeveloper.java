package sheet14Trainees;

import java.time.LocalDate;

public class SoftwareDeveloper extends Trainee {
	
	public SoftwareDeveloper () {
		
	}
	public SoftwareDeveloper(String name, LocalDate dateOfBirth, int ppsNumber) {
		super(name, dateOfBirth, ppsNumber);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
