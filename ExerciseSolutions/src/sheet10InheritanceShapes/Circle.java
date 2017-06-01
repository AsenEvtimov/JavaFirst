package sheet10InheritanceShapes;

public class Circle extends Shape {

	private int radius;
	
	public Circle () {
		
	}
	public Circle (Color color, int radius) {
		super(color);
		setRadius(radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw () {
		System.out.println("\nDrawing a Circle");
	}
	

	@Override
	public String toString() {
		return super.toString() +
				"\nCircle radius = " + radius;
	}
}
