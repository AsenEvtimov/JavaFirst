package sheet16Strings;

public class Ex2Menu {

	public static void main(String[] args) {

		String menu = "Wednesday's Menu: Roast turkey with homemade turkey gravy, "
				+ "potatoes and veg of the day.";
		System.out.println(menu);
		
		menu = menu.replace("Wednesday", "Thursday");
		System.out.println(menu);
		
		menu = menu.replace("turkey", "beef");
		System.out.println(menu);
	                    //0123456789012345678901234567890 	
		String newText = "Jelly and ice cream for desert.";
		menu = menu.concat("\n" + newText);
		System.out.println(menu);
		
		System.out.println("menu length: " + menu.length());
		System.out.println("newText length: " + newText.length());
		
		newText = newText.substring(0,5) + newText.substring(19);
		menu = menu.substring(0,83);
		System.out.println(menu + newText);
	}

}
