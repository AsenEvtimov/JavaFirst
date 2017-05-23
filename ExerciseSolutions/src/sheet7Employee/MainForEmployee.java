package sheet7Employee;

public class MainForEmployee {

	public static void main(String[] args) {
		

		Employee emp1 = new Employee("Damien");
		
		emp1.setAge(38);
		emp1.setSalary(1750);
		emp1.setNoOfSickday(5);
		
		
		
		Employee emp2 = new Employee("Ewelina");
		
		emp2.setAge(21);
		emp2.setSalary(4550);
		emp2.setNoOfSickday(0);
		
		Employee emp3 = new Employee ("Asen");
		
		emp3.setAge(25);
		emp3.setSalary(4999);
		emp3.setNoOfSickday(3);
		
		emp2.encreaseSalary(1.50);
		emp3.encreaseSalary(1.15);
		
		Employee [] allEmp = {emp1, emp2, emp3};
		
		for (int i = 0; i < allEmp.length; i++){
			System.out.println(allEmp[i]);
		}
	}

}
