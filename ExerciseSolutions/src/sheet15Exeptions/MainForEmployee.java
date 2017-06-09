package sheet15Exeptions;

import javax.swing.JOptionPane;

public class MainForEmployee {

	public static void main(String[] args) {

	Employee emp1 = new Employee("Ewelina");
		
		try {
			emp1.setAge(21);
		} catch (InvalidAgeExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp1.setSalary(4550);
		emp1.setNoOfSickday(15);
		
	Employee emp2 = new Employee ("Asen");
		
		try {
			emp2.setAge(15);
		} catch (InvalidAgeExeption e) {
			JOptionPane.showMessageDialog(null, "Invalid age for " + emp2.getName());
			e.printStackTrace();
		}
		emp2.setSalary(4999);
		emp2.setNoOfSickday(3);
		
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
