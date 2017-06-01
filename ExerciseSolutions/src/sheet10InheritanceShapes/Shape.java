package sheet10InheritanceShapes;

abstract class Shape {

	public Color color;
	
	public Shape () {
		
	}
	public Shape (Color color){
		setColor(color);
	}
		
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void draw ();/*{
		System.out.println("Drawing a Shape");
	}*/
	@Override
	public String toString() {
		return "Color: " + color.toString().toLowerCase();
	}
	
	
}
