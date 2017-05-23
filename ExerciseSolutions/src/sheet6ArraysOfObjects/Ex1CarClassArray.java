package sheet6ArraysOfObjects;

import Sheet5Classes.Ex1CarClass;

public class Ex1CarClassArray {
	
	public static void main(String[] args) {
		
		Ex1CarClass car1 = new Ex1CarClass("BMW", "M5", 5500);
		Ex1CarClass car2 = new Ex1CarClass("Ford", "Fiesta", 1.2);
		Ex1CarClass car3 = new Ex1CarClass("Ferrary", "f40", 5.5);
		Ex1CarClass car4 = new Ex1CarClass("Bugatti", "Veyron", 6.5);
		Ex1CarClass car5 = new Ex1CarClass("Lamborghini", "Diablo", 7.0);
		Ex1CarClass car6 = new Ex1CarClass("Audi", "S8", 4.5);
		
		Ex1CarClass [] allCarrs = {car1, car2, car3, car4, car5, car6};
		
		printCar(allCarrs);
		
		System.out.printf("%13s%16s\n", "Make", "Model");
		
		for (int i = 0; i<allCarrs.length; i++) {
			System.out.printf("Car No %d %-15s%-15s\n",(i+1),allCarrs[i].getMake(), allCarrs[i].getModel());
		}
		
	}
	
	public static void printCar (Ex1CarClass[] arrayOfobjects) {
		
		for (int i = 0; i <arrayOfobjects.length; i++)
			System.out.println(arrayOfobjects[i]);
	}

}
