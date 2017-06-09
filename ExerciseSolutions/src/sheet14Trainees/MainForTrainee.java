package sheet14Trainees;

import java.time.LocalDate;

public class MainForTrainee {

	public static void main(String[] args) {

		Electrician rumen = new Electrician("Rumen",LocalDate.of(1984, 01, 01),2616487,
				"General Electric",Electrician.PHASE_TWO);
		System.out.println(rumen);
		
		Carpenter geppetto = new Carpenter ("Geppeto", LocalDate.of(1958, 06, 04), 564687,
					"Wood Works", Carpenter.PHASE_TWO);
		System.out.println(geppetto);
		
		ComputerAidedDesign ew = new ComputerAidedDesign("Ewelina", LocalDate.of(1989, 03, 21),654687);
		System.out.println(ew);
		
		SoftwareDeveloper asen = new SoftwareDeveloper("Asen", LocalDate.of(1982, 11, 05), 783255);
		System.out.println(asen);
		
		Trainee []  allApprentices = {rumen, geppetto, ew, asen,
				new Electrician("John", LocalDate.of(1985, 12, 12),654898, "Shneider", Electrician.PHASE_FOUR),
				new Carpenter ("Will", LocalDate.of(1988, 8, 01),65468, "Wood Works", Carpenter.PHASE_TWO)};
		
		System.out.println("\n------Phase 2 Apprentices------\n");
		
		for (Trainee one : allApprentices) {
			if (one instanceof Apprentice && ((Apprentice) one).getPhase() == 2)
				System.out.println("Name: " + one.getName() + 
						"\nEmployer: " + ((Apprentice)one).getEmployersName());
		}
	}
}
