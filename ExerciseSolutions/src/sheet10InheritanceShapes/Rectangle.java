package sheet10InheritanceShapes;

public class Rectangle extends Shape {

	private double height;
	private double  widith;
	private double area;
	
	Rectangle () {
		
	}
	
	Rectangle (Color color, double height, double widith) {
		//this();
		super(color);
		setHeight(height);
		setWidith(widith);
		calulateArea();
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidith() {
		return widith;
	}

	public void setWidith(double widith) {
		this.widith = widith;
	}
	
	public void draw () {
		System.out.println("\nDrawing a Rectangle");
	}

	public double getArea() {
		return area;
	}

	public void calulateArea() {
		this.area = height*widith;
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nRectangle Height = " + height + " m" +
				"\nWidith = " + widith + " m" +
				"\nArea = " + area + " sqr m";
	}
	
	
	
}
