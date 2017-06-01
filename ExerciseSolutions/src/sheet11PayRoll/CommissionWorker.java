package sheet11PayRoll;

import java.time.LocalDate;

public class CommissionWorker extends Employee{

	private double salary;
	private double commission;
	private int quantity;

	public CommissionWorker (){

	}
	public CommissionWorker (String firstName, String lastName, LocalDate dateOfbirth, 
							double salary, double commission, int quantity) {
		super(firstName, lastName, dateOfbirth);
		setSalary(salary);
		setCommission(commission);
		setQuantity(quantity);		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission ;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double earnings (){
		return salary + (commission*quantity);
	}
	@Override
	public String toString() {
		return "\nEmployeeID: " + employeeID +
				"\nPosition: Commision Worker"+
				super.toString() +
				"\nWeekly Salary: " + salary + " €" +	
				"\nItems sold: " + quantity +
				"\nCommission per Item: " + commission + " €" +
				"\nWeekly Commission: " + (commission*quantity) + " €" +
				"\nTotal Weekly Salary: "+ earnings() +" €";				
	}		
}
