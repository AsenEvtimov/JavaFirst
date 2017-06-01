package sheet11PayRoll;

import java.time.LocalDate;

public class HourlyWorker extends Employee {

	private double wage;
	private double hoursWorked;
	
	public HourlyWorker () {
		
	}
	
public HourlyWorker (String firstName, String lastName, LocalDate dateOfbirth,
					double wage, double hoursWorked ) {
		super(firstName, lastName, dateOfbirth);
		setHoursWorked(hoursWorked);
		setWage(wage);
	}
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double earnings () {
		 if (hoursWorked > 40) {
			return (40*wage) + (hoursWorked - 40)*wage*1.5;
		} else {
			return hoursWorked*wage;
		}
	}
	
	@Override
	public String toString() {
		return "\nEmployeeID: " + employeeID +
				"\nPosition: Hourly Worker"+
				super.toString() +
				"\nHours Worked: " + hoursWorked +
				"\nWage per hour: " + wage + " €"+
				(hoursWorked > 40 ? "\nOvertime: " + (hoursWorked - 40) + " h":"\nOvertime 0" ) +
				"\nOvetime p/h: " + wage*1.5 + " €" +
				(hoursWorked > 40 ? "\nOvertime Paid: " + (hoursWorked - 40)*wage*1.5 +" €" :"\nOvertime Paid 0 €" ) +
				"\nWeekly Salary: " + earnings() + " €";
	}		
}
