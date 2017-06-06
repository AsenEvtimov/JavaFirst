package sheet13OwnerAndPets;

public class Snake extends Pet  {

	public Snake (String name, String breed, int age,
			String color, boolean isFemale) {
		super (name, breed, age, color, isFemale);
	}
	
	public String getTypeOfAnimal () {
		return "Snake";
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
