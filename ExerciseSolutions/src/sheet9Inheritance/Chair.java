package sheet9Inheritance;

public class Chair extends Furniture{

	private boolean hasGasLift;
	private String type;
	
	public static final boolean HAS_GASLIFT = true;
	public static final boolean NO_GASLIFT = false;
	
	Chair () {};
	
	Chair (String color, String materialType, String type, boolean hasGasLift) {
		super(color, materialType);
		setType(type);
		setHasGasLift(hasGasLift);
	}
	
	public void setHasGasLift(boolean hasGasLift) {
		this.hasGasLift = hasGasLift;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "\nChair" + super.toString() +
				"\nType: " + type +
				"\n" +(hasGasLift ? "Chair with a gas lift" : "Chair with no gas lift"); 
	}
	
	
}
