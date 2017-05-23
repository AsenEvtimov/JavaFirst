package Sheet5Classes;

public class PersonalComputer {

	private int RAM;
	private int hardDrive;
	private OS os;
	private MonitorSize monitorSize;
	private double cost;
	
	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB = 16;
	
	
	public static final int HD_250_GB = 250;
	public static final int HD_500_GB = 500;
	public static final int HD_1_TB = 1;
	
	public static final int SCREEN_INCH_15 = 15;
	public static final int SCREEN_INCH_17 = 17;
	public static final int SCREEN_INCH_22 = 22;
	
	public enum MonitorSize {MONITOR_13, MONITOR_15, MONITOR_17, MONITOR_22,
							 MONITOR_27, MONITOR_32, MONITOR_36};
							 
	public enum OS {NO_OS, OS_LINUX, OS_SOLARIS, OS_WIN_7, OS_WIN_10, OS_MAC_LEOPARD};
		
	//Constructors
	public PersonalComputer () {
		//defaults
		RAM = 4;
		hardDrive = 250;
		monitorSize = MonitorSize.MONITOR_17;
		os = OS.NO_OS;
		cost = 300;
	}
	
	public PersonalComputer (int RAM, int hardDrive, OS os, MonitorSize monitorSize) {
		
		this();
		setRAM(RAM);
		setHardDrive(hardDrive);
		setOS(os);
		setMonitor(monitorSize);
		setPrice();
				
	}
	
	//setters
	public void setRAM (int RAM) { //Set RAM method
		
		if (RAM == 4 || RAM ==8 || RAM	== 16) {
			this.RAM = RAM;
		} else {
			System.out.println("RAM not available");
		}
	}
	
	public void setHardDrive (int hardDrive) { //Set Hard Drive method
		
		if (hardDrive == 250 || hardDrive == 500 || hardDrive == 1) {
			this.hardDrive = hardDrive;
		} else {
			System.out.println("Hard Drive not available");
		}
	}
	
	public void setOS(OS os) { //Set Operating System method
		this.os = os;
	}
	
	public void setMonitor (MonitorSize monitorSize) { // Set Monitor method
		
		this.monitorSize = monitorSize; // no validation need as it is set in enum
	}
	
	public void setPrice () {
			cost = 300;
		if (RAM == 8) 
			 this.cost = cost + 30;
		else if (RAM == 16)
			 this.cost = cost + 60;
		
		if (hardDrive == 500)
			this.cost = cost + 70;
		else if (hardDrive == 1000)
			this.cost = cost + 150;
		
		if (os == OS.OS_LINUX || os == OS.OS_SOLARIS)
			this.cost = cost - 10;
		else if (os == OS.OS_WIN_7)
			this.cost = cost + 20;
		else if (os == OS.OS_WIN_10)
			this.cost = cost + 40;
		else if (os == OS.OS_MAC_LEOPARD)
			this.cost = cost + 900;
		
		
		switch (monitorSize) {
			case MONITOR_13:
				cost -= 30;		break;
			case MONITOR_15:
				cost -= 20;		break;
			case MONITOR_22:
				cost += 20;		break;
			case MONITOR_27:
				cost += 30;		break;
			case MONITOR_32:
				cost += 40; 	break;
			case MONITOR_36:
				cost += 50;		break;
				
			default:
				cost += 0;
			break;
			
		}
					
	}
	
	//getters
	
	public int getRAM () {
		return RAM;
	}
	
	public int getHardDrive () {
		return hardDrive;
	}
	
	public OS getOS () {
		return os;
	}
	
	public MonitorSize getMonitor () {
		return monitorSize;
	}
	
	public double getPrice () {
		return cost;
	}
	
	//get int to string (no need)
	
	/*public String getRAMasString () {
		
		switch (RAM) {
			case RAM_4_GB:
				return "RAM 4 GB";
			case RAM_8_GB:
				return "RAM 8 GB";
			case RAM_16_GB:
				return "RAM 16 GB";
		}
	}*/
	

	//toString
	public String toString () {
		setPrice();
		return "PC Configuration: " +
				"\nRAM: " +  RAM + " GB"+
				"\nHD: " + hardDrive + (hardDrive == HD_1_TB ? "TB" : "GB") +
				"\nOperating System: " + os +
				"\nMonitor Size: " + monitorSize + " inch"+
				"\nPrice: " + getPrice();
	}
		
}
