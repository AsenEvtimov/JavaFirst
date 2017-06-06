package sheet13OwnerAndPets;

public abstract class Pet {

	private String name;
	private String breed;
	private int age;
	private String color;
	private boolean isFemale;
	
	public static final boolean FEMALE = true;
	public static final boolean MALE = false;
	
	public static int PetID = 5000;
	
	public Pet () {
		PetID++;
	}
	
	public Pet (String name, String breed, int age,
			String color, boolean isFemale) {
		this();
		setName(name);
		setBreed(breed);
		setAge(age);
		setColor(color);
		setFemale(isFemale);
	}

	public String getName () {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFemale() {
		return isFemale;
	}

	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	
	public abstract String getTypeOfAnimal();

	@Override
	public String toString() {
		return "\nAnimal: " + getTypeOfAnimal() +
				"\nPet name: " + name + 
				"\nBreed: " + breed + 
				"\nAge: " + age + 
				"\nColor: " + color + 
				"\nGender: " + (isFemale ? "Female" : "Male");				
	}
	
}
