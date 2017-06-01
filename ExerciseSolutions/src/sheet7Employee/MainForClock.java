package sheet7Employee;

public class MainForClock {

	public static void main(String[] args) {

		Clock c1 = new Clock(0, 0, 0);
		//c1.resetClock();
		System.out.println(c1);
		
		/*c1.resetClock();
		System.out.println(c1);*/

		
		c1.incrementTime(0,0,86400);
		System.out.println(c1);


	}
}
