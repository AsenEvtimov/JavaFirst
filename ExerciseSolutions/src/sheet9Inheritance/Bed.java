package sheet9Inheritance;

public class Bed extends Furniture {
	
	public static final boolean HAS_HEADBOARD = true;
	public static final boolean NO_HEADBOARD = false;
	
	private boolean hasHeadboard;
	
	private String size;
	
	Bed () {
		
	}
	
	Bed (String color, String materialType, String size, boolean hasHeadboard) {
		
		super(color, materialType);
		setSize(size);
		setHeadboard(hasHeadboard);
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public void setHeadboard (boolean hasHeadboard) {
		this.hasHeadboard = hasHeadboard;
	}	

	@Override
	public String toString() {
		return "\nBed" + super.toString() +
				"\nBed size: " + size + 
				"\n" + (hasHeadboard ? "Has a Headboard " : "No Headboard ") ;
	}
	
	
}
