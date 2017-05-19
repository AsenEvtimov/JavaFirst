package sheet4Arrays;

public class Ex5ClassNames {

	public static void main(String[] args) {

		String [] firstName = {"Damien", "Ewelina", "Asen", "James", "Ben", "Yanush",
				"Kevin", "Shean", "Darios", "Jay", "Luka", "Vitalii", "Path", "Stephen",
				"Emanuel","Ageneska", "Gabriela"};

		String [] lastName = {"Dark","Dzedzina","Evtimov", "Smith", "Kingsley", "Alrukov",
				"Costner", "O'connor", "Marich","Johnson","Modric","Petrov", "Simpson","Howking",
				"Riva", "Radanska","Silang"};

		Ex5ClassNames ex5 = new Ex5ClassNames();
		//ex5.printMyArray(firstName);
		//ex5.printMyArray(lastName);
		ex5.sumOfTwoArrays(firstName, lastName);		
	}

	public void sumOfTwoArrays (String [] firstName, String [] lastName) {

		System.out.printf("%-20s%-20s%s\n", "First Name","Last Name", "Full Name");

		for (int i=0; i < firstName.length; i++) {
			System.out.printf("%-20s%-20s%s\n", firstName[i], lastName[i], firstName[i]+" "+lastName[i]);
		}

	}

	public void printMyArray(String [] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println(); // prints a newline after the loop
	}

}
