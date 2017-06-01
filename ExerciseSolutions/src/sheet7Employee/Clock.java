package sheet7Employee;

public class Clock {

	private int hour;
	private int second;
	private int minute;
	
	public Clock () {
				
	}
	
	public Clock (int hour, int minute, int second) {
		
		
		setHour(hour);
		setMinute(minute);
		setSecond(second);
		
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
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
