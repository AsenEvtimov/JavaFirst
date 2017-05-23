package sheet7Employee;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private int noOfSickday;
	private int empNo;

	private static int numberOfEmployees = 1;

	public Employee () {
		empNo = numberOfEmployees;
		numberOfEmployees++;
	}
	
	public Employee (String name) {
		this();
		setName(name);
	}

	public Employee ( int age, double salary, int noOfSickday){
		
		this ();
		setAge(age);
		setSalary(salary);
		setNoOfSickday(noOfSickday);
		//encreaseSalary(encrasement, newsalary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNoOfSickday() {
		return noOfSickday;
	}

	public void setNoOfSickday(int noOfSickday) {
		this.noOfSickday = noOfSickday;
	}
	
	public int getEmpNo () {
		return empNo;
	}

	public double encreaseSalary(double percentigeOfincreasment) {
		
		salary = getSalary()*percentigeOfincreasment;
		return salary;

	}

	@Override
	public String toString() {
		return   "\nEmployee ID: " + empNo +
				"\nEmployee name: " + name + 
				"\nage: " + age + 
				String.format("\nsalary %.2f", salary) + //"\nsalary: " + salary + 
				"\nSeek leave: " + noOfSickday + " days";
				
	}
	
	
}
