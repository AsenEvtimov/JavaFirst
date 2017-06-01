package sheet9Inheritance;

public class Table extends Furniture {

	private Expandable expandable;
	private String shape;
	
	/*private static final boolean EXPANDABLE = true;
	private static final boolean NOT_EXPANDABLE = false;*/
	
	enum Expandable {EXPANDABLE, NOT_EXPANDABLE};
	
	Table () {
		
	}
	
	Table (String color, String materialType, String shape, Expandable expandable) {
	
		super(color, materialType);
		setShape(shape);
		setExpandable(expandable);
	}

	/*public boolean isExpandable() {
		return isExpandable;
	}

	public void setExpandable(boolean isExpandable) {
		this.isExpandable = isExpandable;
	}*/
	
	

	public String getShape() {
		return shape;
	}

	public void setExpandable(Expandable expandable) {
		this.expandable = expandable;
	}

	public Expandable getExpandable() {
		return expandable;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "\nTable" + super.toString()+
				"\nShape: " + shape +
				"\n" + expandable;
	}
	
}
