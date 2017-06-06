package sheet13OwnerAndPets;

public class MainForPets {

	public static void main(String[] args) {

		Snake s = new Snake("Zorro", "Cobra", 7, "Yellow", Snake.MALE);
		//System.out.println(s);

		Cat c = new Cat ("Tom","Cartoon Network",6,"Blue", Cat.MALE);
		//System.out.println(c);

		Dog d = new Dog ("Spike", "Bulldog", 8, "Grey", Dog.MALE, Dog.IS_NOT_MICROCHIPPED);
		//System.out.println(d);

		Hamster h = new Hamster ("Jerry", "Cartoon Mouse",2,"Brown", Hamster.MALE);
		//System.out.println(h);

		Owner o = new Owner ("Dublin Zoo", "Phoenix Park", "+3531 442 442", new Pet [] {s,c,d,h});
		Pet []  allPets = o.getPet();

		System.out.println(o);
		
		for (int i = 0 ; i < allPets.length; i++ ){
			System.out.println((i+1) + ": " + allPets[i]);
			
			if (allPets[i] instanceof Dog) {
				System.out.println("MicroChip Number: " + ((Dog) allPets[i]).getMicroChipNumber());
			}
			if (allPets[i] instanceof Mammal) {
				((Mammal) allPets[i]).sleep();
			}
			if (allPets[i] instanceof Cat) {
				((Cat) allPets[i]).justLostALife();								
			}
		}
	}
}