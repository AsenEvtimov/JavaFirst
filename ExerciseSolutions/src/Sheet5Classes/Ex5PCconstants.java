package Sheet5Classes;

class PersonalComputer {

	private int RAM;
	private int hardDrive;
	private String OS;
	private int monitorSize;
	private double cost;
	
	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB = 16;
	
	
	public static final int HD_250_GB = 250;
	public static final int HD_500_GB = 500;
	public static final int HD_1_TB = 1000;
	
	public static final int SCREEN_INCH_15 = 15;
	public static final int SCREEN_INCH_17 = 17;
	public static final int SCREEN_INCH_22 = 22;
	
	
	//Constructors
	public PersonalComputer () {
		//defaults
		RAM = 4;
		hardDrive = 250;
		monitorSize = 15;
		cost = 200;
	}
	
	public PersonalComputer (int RAM, int hardDrive, String OS, int monitorSize) {
		
		this();
		setRAM(RAM);
		setHardDrive(hardDrive);
		setOS(OS);
		setMonitor(monitorSize);
		setPrice();
				
	}
	
	//setters
	public void setRAM (int RAM) { //Set RAM method
		
		if (RAM >=4 && RAM	<= 16) {
			this.RAM = RAM;
		} else {
			System.out.println("RAM not available");
		}
	}
	
	public void setHardDrive (int hardDrive) { //Set Hard Drive method
		
		if (hardDrive >= 250 && hardDrive <= 1000) {
			this.hardDrive = hardDrive;
		} else {
			System.out.println("Hard Drive not available");
		}
	}
	
	public void setOS(String OS) { //Set Operating System method
		this.OS = OS;
	}
	
	public void setMonitor (int monitorSize) { // Set Monitor method
		
		if (monitorSize >=15 && monitorSize <= 22) {
			this.monitorSize = monitorSize;
		} else {
			System.out.println("Monitor not available");
		}
	}
	
	public void setPrice () {
		
		if (RAM == 8) 
			 this.cost = cost + 30;
		else if (RAM == 16)
			 this.cost = cost + 60;
		if (hardDrive == 500)
			this.cost = cost + 70;
		else if (hardDrive == 1000)
			this.cost = cost + 150;
		if (monitorSize == 17)
			this.cost = cost + 50;
		else if (monitorSize == 22)
			this.cost = cost + 80;
					
	}
	
	//getters
	
	public int getRAM () {
		return RAM;
	}
	
	public int getHardDrive () {
		return hardDrive;
	}
	
	public String getOS () {
		return OS;
	}
	
	public int getMonitor () {
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
		return "PC Configuration: " +
				"\nRAM: " +  RAM + " GB"+
				"\nHD: " + hardDrive + " GB"+
				"\nOperating System: " + OS +
				"\nMonitor Size: " + monitorSize + " inch"+
				"\nPrice: " + cost;
	}
		
}
