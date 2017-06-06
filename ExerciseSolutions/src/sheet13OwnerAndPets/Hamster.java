package sheet13OwnerAndPets;

public class Hamster extends Pet implements Mammal {

	public Hamster () {
		
	}
	public Hamster (String name, String breed, int age,
			String color, boolean isFemale) {
		super (name, breed, age, color, isFemale);
	}
	
	public String getTypeOfAnimal () {
		return "Hamster";
	}
	public void walk () {
		System.out.println("Put hamster in the runnig circle");
	}
	public void sleep ()  {
		System.out.println("Hammster is sleeping");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
