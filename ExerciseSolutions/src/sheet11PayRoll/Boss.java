package sheet11PayRoll;

import java.time.LocalDate;

public class Boss extends Employee {

	private double weeklySalary;
	
	public Boss (){
		
	}
	public Boss (String firstName, String lastName, LocalDate dateOfbirth, double weeklySalary){
		super(firstName, lastName, dateOfbirth);
		setWeeklySalary(weeklySalary);
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public  double earnings () {
		return weeklySalary;
	}
	@Override
	public String toString() {
		return "\nEmployeeID: " + employeeID +
				"\nPosition: Boss"+
				super.toString() +							
				"\nWekkly Salary " + getWeeklySalary() + " €";
	}
		
}
