package sheet15Exeptions;

public class Clock {

	private int hour;
	private int second;
	private int minute;
	
	public Clock () {
				
	}
	
	public Clock (int hour, int minute, int second) throws InvalidTimeExeption {
				
		setHour(hour);
		setMinute(minute);
		setSecond(second);		
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) throws InvalidTimeExeption{
		if (hour >= 0 && hour < 12)
			this.hour = hour;
		else 
			throw new InvalidTimeExeption("Invalid hour value");
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) throws InvalidTimeExeption {
		if (second >= 0 && second < 60)
			this.second = second;
		else 
			throw new InvalidTimeExeption("Invalid second value");
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) throws InvalidTimeExeption {
		if (minute >= 0 && minute < 60)
			this.minute = minute;
		else
			throw new InvalidTimeExeption("Invalid minute value");
	}
	
	public void resetClock(){
		hour = 0;
		minute = 0;
		second = 0;
	}
	
	public void incrementTime (int addHours, int addMinutes, int addSeconds){
		
		
		if ((second + addSeconds) > 59){
			minute = minute + ((second + addSeconds)/60);
			second = ((second + addSeconds) % 60);
		}else {
			second += addSeconds;
		}
		
		if ((minute + addMinutes) > 59){
			hour = hour + ((minute + addMinutes)/60);
			minute = ((minute + addMinutes) % 60);
		}else {
			minute += addMinutes;
		}
		
		if ((hour + addHours) > 23) {
			hour = ((hour + addHours) % 24);
		} else {
			hour += addHours;
		}
	}

	@Override
	public String toString() {
		return   //hour + 
				//":" + minute + 
				//":" + second;
				String.format("%02d:%02d:%02d\n", getHour(),getMinute(),getSecond());
	}
	
		
}
