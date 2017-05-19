package Sheet5Classes;

class CarClass {

	private String make;
	private String model;
	private double engine;
	
	public CarClass () {}
	
	public CarClass (String make, String model, double engine) {
		
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
		
	}
	
	String getMake(){
		return make;
	}
	
	String getModel () {
		return model;		
	}
	
	double getEngine () {
		return engine;
	}
	
	public String toString () {
		return "\nCar is: " + make +
				"\nModel is: " + model +
				"\nEngine Capacity is: " + engine + " cc";
		
	}
	
}
