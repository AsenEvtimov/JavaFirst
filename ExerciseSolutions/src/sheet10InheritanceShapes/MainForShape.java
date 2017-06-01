package sheet10InheritanceShapes;

public class MainForShape {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(Color.BLACK, 2.5, 3.5);
		/*r.draw();
		System.out.println(r);*/
		
		Circle c = new Circle(Color.BLUE,7);
		/*c.draw();
		System.out.println(c);*/
		
		Triangle t = new Triangle(Color.GREEN);
		/*t.draw();
		System.out.println(t);*/
		
		Shape [] allShapes = {r,c,t, new Rectangle (Color.PINK, 2,2),
				new Circle (Color.ORANGE, 5), new Triangle (Color.YELLOW)};
		
		for (Shape one : allShapes) {
			one.draw();
			
			System.out.println(one);
		}
		
		System.out.println("\n-----Only Shape and Color-----");
		
		for (Shape one : allShapes) {
			one.draw();
			
			System.out.println(one.getColor());
		}
		
		System.out.println("\n-----Only Circles-----");
		
		for (Shape one : allShapes) {
			
			if (one instanceof Circle) {
				one.draw();
				System.out.println((Shape)one);
			}
		}
	}

}
