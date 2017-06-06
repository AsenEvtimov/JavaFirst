package sheet13OwnerAndPets;

public class Cat extends Pet implements Mammal {
	
	private static int numOfLives = 1;
	
	public Cat () {
		
	}

	public Cat (String name, String breed, int age,
			String color, boolean isFemale) {
		super (name, breed, age, color, isFemale);
		
	}
	
	public int getNumOfLives() {
		return numOfLives;
	}
	
	public void justLostALife (){
		--numOfLives;
		System.out.println( getName() + " Just lost a life :(, Lifes left: " + getNumOfLives() );
	if (numOfLives == 0) 
			System.out.println(this.getName() + " is gone forever :(");	

		
	}

	public String getTypeOfAnimal () {
		return "Cat";	
	}
	
	public void walk () {
		System.out.println("Wlak the cat");
	}
	public void sleep ()  {
		System.out.println("Cat is sleeping");
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nNumber of Life: " + getNumOfLives();
	}
}
