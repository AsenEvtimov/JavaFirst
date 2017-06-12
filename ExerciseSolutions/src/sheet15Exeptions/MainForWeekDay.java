package sheet15Exeptions;

public class MainForWeekDay {

	public static void main(String[] args) {
		
		WeekDay f = new WeekDay();
		try {
			f.setWeekDay("f");
		} catch (InvalidWeekdayException e) {
			System.out.println(e.getMessage());
			System.out.println(f);
			//e.printStackTrace();			
		}
		finally {
			System.out.println("End of the week ;P");
		}
	}
}
