package Sheet5Classes;

class Dog {

	private String breed;
	private String color;
	private String owner;
	int dogNum;
	public static int dogCounter;

	public Dog () {
		//dogNum = dogCounter;
		dogCounter++;
	}

	public Dog (String breed, String color, String owner) {
		
		this();
		setBreed(breed);
		setColour(color);
		setOwner(owner);
	}

	public void setBreed (String breed){
		this.breed = breed;
	}

	public void setColour (String color) {
		this.color = color;
	}

	public void setOwner (String owner) {
		this.owner = owner;
	}

	String getBreed() {
		return breed;
	}

	String getColor() {
		return color;		
	}

	String getOwner () {
		return owner;
	}

	public String toString () {
		return "\nBreed is: " + breed +
				"\nColor is: " + color +
				"\nOwner's name: " + owner;
	}
}
