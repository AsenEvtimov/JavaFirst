package sheet9Inheritance;

public class Furniture {

	private String color;
	private String materialType;
	
	Furniture () {
		
	}
	
	Furniture (String color, String materialType) {
		this();
		setColor(color);
		setMaterialType(materialType);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	@Override
	public String toString() {
		return "\nFurniture color " + color + 
				"\nmaterialType " + materialType;
	}
	
	
}
