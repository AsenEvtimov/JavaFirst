package Sheet5Classes;

public class MainForEx1CarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*CarClass car1 = new CarClass ();
		
		car1.setMake("Ford");
		car1.setModel("Fiesta");
		car1.setEngine(1.1);
		
		System.out.println("Car 1 is " + car1.getMake());
		System.out.println("Car 1 model is " + car1.getModel());
		System.out.println("Car 1 Engige Capacity is " + car1.getEngine() + " cc");*/
		
		int carNum = 1;
		Ex1CarClass car1 = new Ex1CarClass("Audi", "S8", 4.5);
		System.out.println("Car: " + carNum + car1);
		System.out.println();
		carNum++;
				
		Ex1CarClass car2 = new Ex1CarClass("Ford", "Fiesta", 1.2);
		System.out.println("Car: " + carNum + car2);
		System.out.println();
		carNum++;
		
		Ex1CarClass car3 = new Ex1CarClass("Ferrary", "f40", 5.5);
		System.out.println("Car: " + carNum + car3);
		System.out.println();
		carNum++;
		
		Ex1CarClass car4 = new Ex1CarClass("Bugatti", "Veyron", 6.5);
		System.out.println("Car: " + carNum + car4);
		System.out.println();
		carNum++;
		
		Ex1CarClass car5 = new Ex1CarClass("Lamborghini", "Diablo", 7.0);
		System.out.println("Car: " + carNum + car5);
		System.out.println();
		carNum++;
	}

}
