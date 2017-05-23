package sheet7Employee;

public class Clock {

	private int hour;
	private int second;
	private int minute;
	
	public Clock () {
		hour = 0;
		minute = 0;
		second = 0;
		
	}
	
	public Clock (int hour, int minute, int second) {
		
		setHour(hour);
		setMinute(minute);
		setSecond(second);
		resetClock();
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
	
	public void incrementHour(int addhour){
		this.hour = addhour;
	}

	@Override
	public String toString() {
		return   //hour + 
				//":" + minute + 
				//":" + second;
				String.format("%02d:%02d:%02d\n", getHour(),getMinute(),getSecond());
	}
	
		
}
