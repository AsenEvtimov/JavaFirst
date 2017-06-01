package sheet11PayRoll;

import java.time.LocalDate;

public class PiceWorker extends Employee {

	private double wagePerPice;
	private int quantity;
	
	public PiceWorker () {
		
	}
	public PiceWorker (String firstName, String lastName, LocalDate dateOfbirth,
					 double wagePerPice, int quantity) {
		super(firstName, lastName, dateOfbirth);
		setWagePerPice(wagePerPice);
		setQuantity(quantity);
	}

	public double getWagePerPice() {
		return wagePerPice;
	}

	public void setWagePerPice(double wagePerPice) {
		this.wagePerPice = wagePerPice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double earnings (){
		
		return quantity*wagePerPice;
	}
	@Override
	public String toString() {
		return "\nEmployeeID: " + employeeID +
				"\nPosition: Piece Worker"+
				super.toString() +
				"\nPice Worked: " + quantity +
				"\nPrice per Piece: " + wagePerPice +
				"\nWeekly Salary: " + earnings();				
	}		
}
