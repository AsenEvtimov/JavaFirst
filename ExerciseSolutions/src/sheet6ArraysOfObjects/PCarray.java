package sheet6ArraysOfObjects;

import Sheet5Classes.PersonalComputer;
import Sheet5Classes.PersonalComputer.MonitorSize;
import Sheet5Classes.PersonalComputer.OS;



public class PCarray {

	public static void main(String[] args) {
		
		//PersonalComputer pc1 = new PersonalComputer(PersonalComputer.RAM_4_GB, PersonalComputer.HD_250_GB, PersonalComputer.OS.OS_SOLARIS, MonitorSize.MONITOR_17 );

		PersonalComputer [] allPC = {new PersonalComputer (PersonalComputer.RAM_4_GB, PersonalComputer.HD_250_GB, OS.NO_OS, MonitorSize.MONITOR_13),
				new PersonalComputer (PersonalComputer.RAM_8_GB, PersonalComputer.HD_500_GB, OS.OS_LINUX, MonitorSize.MONITOR_15),
				new PersonalComputer (PersonalComputer.RAM_16_GB, PersonalComputer.HD_1_TB, OS.OS_WIN_7, MonitorSize.MONITOR_17),
				new PersonalComputer (PersonalComputer.RAM_16_GB, PersonalComputer.HD_1_TB, OS.OS_WIN_10, MonitorSize.MONITOR_22),
				new PersonalComputer (PersonalComputer.RAM_8_GB, PersonalComputer.HD_250_GB, OS.OS_MAC_LEOPARD, MonitorSize.MONITOR_32),
				new PersonalComputer (PersonalComputer.RAM_8_GB, PersonalComputer.HD_1_TB, OS.OS_WIN_10, MonitorSize.MONITOR_36)};
		
		for (int i = 0; i < allPC.length; i++) {
			//allPC[i].setPrice();
			if (allPC[i].getPrice() > 400) {
				System.out.println(allPC[i] + "\n");
			}
		}
	}
}
