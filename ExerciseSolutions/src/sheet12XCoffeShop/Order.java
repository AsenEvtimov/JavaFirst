package sheet12XCoffeShop;

import java.util.Arrays;

public class Order {

	private static int orderNumber = 0;
	Coffee [] coffees;

	public Order () {
		orderNumber++;
	}
	public Order (Coffee [] coffees) {
		this();
		setCoffees(coffees);
	}

	public Coffee[] getCoffees() {
		return coffees;
	}

	public void setCoffees(Coffee[] coffees) {
		this.coffees = coffees;
	}
	
	public double calculatePrice () {
		double total=0;
		for (Coffee one : coffees) {
			total += one.getPrice();
		}
		return total;
	}
	/*public double discount () {
		double total = 0;
		total = calculatePrice() - (calculatePrice()*0.50);
		return total;
	}*/
	
	public void discount (double discount) {
		String text = "OrderNumber: " + orderNumber + 
				"\nCoffees: " + Arrays.toString(coffees) +
				"\nTotal Price: " + calculatePrice() + "\n";
		double totalDiscount = (calculatePrice() - (calculatePrice()*(discount/100)));
		System.out.printf("%s%s%.2f",text,"After Discount: ", totalDiscount); 
	}

	@Override
	public String toString() {
		return "OrderNumber: " + orderNumber + 
				"\nCoffees: " + Arrays.toString(coffees) +
				"\nTotal Price: " + calculatePrice() + "\n";
				
	}	
}
