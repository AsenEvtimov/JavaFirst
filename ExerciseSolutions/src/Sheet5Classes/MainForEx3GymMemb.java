package Sheet5Classes;

public class MainForEx3GymMemb {

	public static void main(String[] args) {

		GymMembership m1 = new GymMembership("Asen", "Monthly");
		System.out.println(m1);

		GymMembership m2 = new GymMembership("Damien", "Per Year");
		System.out.println(m2);

		GymMembership m3 = new GymMembership("Sandra", "Yearly");
		System.out.println(m3);

	
	/*We can create an array with the objects(m1,m2,m3)
	 * and add new object using for loop to print the array
	 * */
		System.out.println("--------------------");
	GymMembership [] memberships = {m1, m2, m3, 
			new GymMembership("Donald",  "Yearly"),
			new GymMembership("James", "Per Year")};
	
	for (int i = 0; i < memberships.length; i++)
		System.out.println(memberships[i]);
	}
}
