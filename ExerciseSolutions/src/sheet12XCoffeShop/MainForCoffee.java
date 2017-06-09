package sheet12XCoffeShop;

public class MainForCoffee {

	public static void main(String[] args) {

		Order o = new Order(new Coffee [] {Coffee.AMERICANO, Coffee.CAPPUCCINO, Coffee.ESPERSSO});
		System.out.println(o);
		
		Order o1 = new Order(new Coffee [] {Coffee.AMERICANO, Coffee.CAPPUCCINO, Coffee.ESPERSSO});
		System.out.println(o1);
		
		Order o2 = new Order(new Coffee [] {Coffee.AMERICANO, Coffee.CAPPUCCINO, Coffee.ESPERSSO});
		System.out.println(o2);
		
		Order forEw = new Order(new Coffee [] {Coffee.LATTE, Coffee.BROWNIE} );
		forEw.discount(50);
	}
}
