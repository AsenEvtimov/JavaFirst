package Sheet5Classes;

public class Ex1CarClass {

	private String make;
	private String model;
	private double engine;
	
	public Ex1CarClass () {}
	
	public Ex1CarClass (String make, String model, double engine) {
		
		setMake(make);
		setModel(model);
		setEngine(engine);
	}

	public void setMake(String make){

		this.make = make;
	}

	public void setModel(String model){

		this.model = model;
	}
	
	public void setEngine(double engine) { 
		this.engine = engine;
	}
	
	public String getMake(){
		return make;
	}
	
	public String getModel () {
		return model;		
	}
	
	public double getEngine () {
		return engine;
	}
	
	public String toString () {
		return "\nCar is: " + make +
				"\nModel is: " + model +
				"\nEngine Capacity is: " + engine + " cc";
		
	}
	
}
