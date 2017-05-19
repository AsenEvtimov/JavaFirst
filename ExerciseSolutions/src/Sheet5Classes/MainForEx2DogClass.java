package Sheet5Classes;

public class MainForEx2DogClass {

	public static void main(String[] args) {

		
		Dog d1 = new Dog ("Siberian Huski", "Grey", "Johm Wilson");
		System.out.println("Dog: " + Dog.dogCounter + d1);
		System.out.println();
		

		Dog d2 = new Dog ("German Sheperd","Black and Brown","Marry Jane");
		System.out.println("Dog: "+ Dog.dogCounter + d2);
		System.out.println();
		

		Dog d3 = new Dog ("Labrador", "Yellow","Tom Jones");
		System.out.println("Dog: " + Dog.dogCounter + d3);
		System.out.println();
			
	}
}

