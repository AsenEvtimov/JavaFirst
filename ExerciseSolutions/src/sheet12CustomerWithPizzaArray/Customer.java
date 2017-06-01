package sheet12CustomerWithPizzaArray;

//import java.util.Arrays;

public class Customer {

	private String name;
	private String address;
	private String phone;
	
	private Pizza [] pizzas;
		
	public Customer () {
		
	}
	
	public Customer (String name, String address, String phobne, Pizza [] pizzas) {
		setName(name);
		setAddress(address);
		setPhone(phobne);
		setPizzas(pizzas);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Pizza [] getPizzas() {
		return pizzas;
	}

	public void setPizzas(Pizza [] pizzas) {
		this.pizzas = pizzas;
	}

	public double getTotoalCost() {
		double totoalCost = 0;
		for (int i = 0; i < pizzas.length; i++)
			totoalCost = totoalCost + pizzas[i].calculatePrice();
		return totoalCost;
	}

	@Override
	public String toString() {
		
		String text = "\nCustomer name: " + name + 
				"\nAddress: " + address + 
				"\nPhone: " + phone+ 
				"\n\nPizzas: ";	
				for ( Pizza one : pizzas)					
					text += "\n" + one;
				text += "\n\nTotal Cost: " + getTotoalCost();
				return text;				
	}	
}
