package sheet15Exeptions;

public class WeekDay {

	private String weekDay;
	
	public static final String  MONDAY = "Monday";
	public static final String  TUESDAY = "Tuesday";
	public static final String  WEDNESDAY = "Wednesday";
	public static final String  THURSDAY = "Thursday";
	public static final String  FRIDAY = "Friday";
	public static final String  SATURDAY = "Saturday";
	public static final String  SUNDAY = "Sunday";
	
	public WeekDay () {
		
	}
	
public WeekDay (String weekDay) throws InvalidWeekdayException {
		setWeekDay(weekDay);
	}

	public void setWeekDay(String weekDay) throws InvalidWeekdayException {
		switch (weekDay) {
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
			case SATURDAY:
			case SUNDAY:
		this.weekDay = weekDay;				
			break;
		default:
			throw new InvalidWeekdayException("Invalid week day must be one of the" + getWeekDay(weekDay));
		}	
	}

	public String getWeekDay(String weekDay) {
		this.weekDay = weekDay;
		return weekDay;
	}

	@Override
	public String toString() {
		return "WeekDay: " + weekDay;
	}
	
}
