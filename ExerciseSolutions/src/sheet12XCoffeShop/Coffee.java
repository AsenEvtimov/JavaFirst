package sheet12XCoffeShop;

public enum Coffee {

	AMERICANO(2.50),
	FALT_WHITE(2.75),
	LATTE(2.75),
	SKINNY_LATTE(2.75),
	MICHA(2.90),
	CAPPUCCINO(2.90),
	ESPERSSO(2.00), 
	BROWNIE(2.50);
	
	private double price;

	private Coffee (double price) {
		setPrice(price);
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
