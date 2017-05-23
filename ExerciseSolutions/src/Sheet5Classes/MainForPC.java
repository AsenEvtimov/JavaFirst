package Sheet5Classes;

public class MainForPC {

	public static void main(String[] args) {

		PersonalComputer pc1 = new PersonalComputer(PersonalComputer.RAM_16_GB, PersonalComputer.HD_1_TB, 
				PersonalComputer.OS.OS_WIN_10, PersonalComputer.MonitorSize.MONITOR_36);
		
		pc1.setOS(PersonalComputer.OS.OS_MAC_LEOPARD);
		
		System.out.println(pc1);

	}
}
