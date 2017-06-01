package sheet11PayRoll;

import java.time.LocalDate;


public class MainForEmployee {

	public static void main(String[] args) {

		Boss a = new Boss("James", "Bond",LocalDate.of(1975, 05, 24),980);
		//System.out.println(a);

		CommissionWorker b = new CommissionWorker("Asen", "Evtimov",LocalDate.of(1986, 11, 05), 200, 40.5, 10);
		//System.out.println(b);
		
		PiceWorker p = new PiceWorker("Ewelina", "Dziedzina", LocalDate.of(1991, 03, 21),10,50);
		//System.out.println(p);
		
		HourlyWorker h = new HourlyWorker("Mary", "Jane",LocalDate.of(1980,8,20) ,10, 41);
		//System.out.println(h);
		
		System.out.println("---Payroll for all employee---");
		
		Employee [] allStaff = {a,b,p,h};
		
		for ( Employee one : allStaff) 
			System.out.println(one);
		
		System.out.println("\n---Payroll for Hourly workers---");
		
		for ( Employee one : allStaff)
			if (one instanceof HourlyWorker)
			System.out.println((HourlyWorker)one);
	}
}
