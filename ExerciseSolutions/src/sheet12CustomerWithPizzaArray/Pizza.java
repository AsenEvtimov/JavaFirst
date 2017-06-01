package sheet12CustomerWithPizzaArray;

//import java.util.Arrays;

public class Pizza {

	private String [] topings;	
	private PizzaSize picaSize;

	public Pizza (String [] topings, PizzaSize picaSize) {
		setTopings(topings);
		setPicaSize(picaSize);
	}

	public String[] getTopings() {
		return topings;
	}

	public void setTopings(String[] topings) {
		this.topings = topings;
	}

	public PizzaSize getPicaSize() {
		return picaSize;
	}

	public void setPicaSize(PizzaSize picaSize) {
		this.picaSize = picaSize;
	}

	public double calculatePrice (){
		return  picaSize.getBasePrice() + picaSize.getPricePerTopping()*topings.length;
	}

	@Override
	public String toString() {
		String text = "\nPizza Size: " + picaSize +
					"\nPizza topings: "; 

					for (int i = 0; i < topings.length; i++)//for ( String one : topings)
						if (i != topings.length - 1) {
							text += topings[i] + ", " ;
						}
						else text += topings[i];
					text += "\nCost: " + calculatePrice();	
								
				return text;
	}	
}
