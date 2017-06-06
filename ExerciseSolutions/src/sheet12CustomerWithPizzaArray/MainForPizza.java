package sheet12CustomerWithPizzaArray;

public class MainForPizza {

	public static void main(String[] args) {

		Pizza p1 = new Pizza (new String [] {"Tomato", "Cheese", "Ham", "Mushrooms"},
							PizzaSize.SMALL);
		System.out.println(p1);
		
		Pizza p2 = new Pizza (new String [] {"Tomato", "Cheese", "Olives", "Corn", "Ppepers"},
							PizzaSize.MEDIUM);
		System.out.println(p2);
		
		Pizza p3 = new Pizza (new String [] {"Tomato", "Pepers", "Chedar", "Mozzarela", "Blue Cheese"},
							PizzaSize.LARGE);
		System.out.println(p3);
		
		Pizza p4 = new Pizza (new String [] {"Tomato", "Parma Ham", "Chiken", "Cheese", "Olives"},
							PizzaSize.EXTRA_LARGE);
		System.out.println(p4);
		
		Customer c1 = new Customer ("Ewelina", "Lixip", "+6841+64", 
									new Pizza [] {p1,p2,p3,p4});
		System.out.println(c1);
	}
	
}
