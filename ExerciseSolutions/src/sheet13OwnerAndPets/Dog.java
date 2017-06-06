package sheet13OwnerAndPets;

public class Dog extends Pet implements Mammal {
	
	private String microChipNumber;
	private boolean isMicroChipped;
	
	public static final boolean IS_MICROCHIPPED = true;
	public static final boolean IS_NOT_MICROCHIPPED = false;
	
	public Dog () {
		
	}
	
	public Dog (String name, String breed, int age,
			String color, boolean isFemale, boolean isMicroChiped) {
		super (name, breed, age, color, isFemale);
		setMicroChipped(isMicroChipped);
	}
	
	public Dog (String name, String breed, int age,
			String color, boolean isFemale, boolean isMicroChiped, String microChipNumber) {
		super (name, breed, age, color, isFemale);
		setMicroChipped(isMicroChipped);
		setMicroChipNumber(microChipNumber);
	}
	
	public String getMicroChipNumber() {
		return microChipNumber;
	}

	public void setMicroChipNumber(String microChipNumber) {
		this.microChipNumber = microChipNumber;
	}

	public boolean isMicroChipped() {
		return isMicroChipped;
	}

	public void setMicroChipped(boolean isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}

	public String getTypeOfAnimal () {
		return "Dog";	
	}
	
	public void walk () {
		System.out.println("Wlak the dog");
	}
	public void sleep ()  {
		System.out.println("Dog is sleeping");
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nMicrochiped: " + (isMicroChipped ? "Microchiped" : "Not microchiped");	
	}
}
