package sheet14Trainees;

import java.time.LocalDate;

public class Carpenter extends Trainee implements Apprentice{

	private String employersName;
	private int phase;

	public Carpenter (String name, LocalDate dateOfBirth, int ppsNumber,
			String employersName, int phase) {
		super(name, dateOfBirth, ppsNumber);
		setEmployersName(employersName);
		setPhase(phase);
	}

	public String getEmployersName() {
		return employersName;
	}

	public void setEmployersName(String employersName) {
		this.employersName = employersName;
	}

	public int getPhase() {
		return phase;
	}
	
	@Override
	public void setPhase(int phase) {
		if (phase == PHASE_ONE ||
			phase == PHASE_TWO ||
			phase == PHASE_THREE ||
			phase == PHASE_FOUR ||
			phase == PHASE_FIVE ||
			phase == PHASE_SIX)
		this.phase = phase;
		else {
			System.out.println("Invalid Phase, setting to defaout Phase one...");
			this.phase = PHASE_ONE;
		}
	}
	@Override
	public String toString() {
		return super.toString() + 
				"\nEmployer's Name: " + employersName +
				"\nPhase: " + phase;
	}
}
