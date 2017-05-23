package sheet7Employee;

public class MainForClock {

	public static void main(String[] args) {
		
		Clock c1 = new Clock(11, 30, 0);
		c1.resetClock();
		System.out.println(c1);
		
		Clock c2 = new Clock();
		c2.incrementHour(3);
		System.out.println(c2);
	}

}
