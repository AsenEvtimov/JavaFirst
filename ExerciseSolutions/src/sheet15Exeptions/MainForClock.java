package sheet15Exeptions;

public class MainForClock {

	public static void main(String[] args) {

		Clock c1 = new Clock();
		try {
			c1.setHour(11);
			c1.setMinute(59);
			c1.setSecond(60);
		} catch (InvalidTimeExeption e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			c1.incrementTime(0,0,1);
		System.out.println(c1);
		}
		System.out.println(c1);
		
		
	}
}
