package sheet4A2dArrays;

public class Ex3cClock {

	public static void main(String[] args) {
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 60; j++)
				for (int k = 0; k < 60; k++){
				System.out.printf("%02d:%02d:%02d\n", i, j, k);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
