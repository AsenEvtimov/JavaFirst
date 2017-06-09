package sheet14Trainees;

interface Apprentice {

	int PHASE_ONE = 1;
	int PHASE_TWO = 2;
	int PHASE_THREE = 3;
	int PHASE_FOUR = 4;
	int PHASE_FIVE = 5;
	int PHASE_SIX = 6;
	
	void setPhase (int phase);
	int getPhase ();
	
	void setEmployersName (String employersName);
	String getEmployersName ();
}
