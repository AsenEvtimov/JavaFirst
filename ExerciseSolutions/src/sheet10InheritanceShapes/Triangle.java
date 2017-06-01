package sheet10InheritanceShapes;

public class Triangle extends Shape{

	public Triangle () {
		
	}
	
	public Triangle (Color color) {
		super(color);
	}
	
	public void draw () {
		System.out.printf("\nDrawing a %s Triangle\n", getColor());
	}

	/*@Override
	public String toString() {
		return super.toString();
	}*/
		
}
