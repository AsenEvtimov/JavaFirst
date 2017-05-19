
package sheet3cotrolflow;

public class Ex5 {
	public static void main(String [] args) {
	
	double height = 5;
	double breadth = 5;
	Ex5 a = new Ex5();
	a.getArea(height,breadth);
	}
		public void getArea (double height, double breadth) {
		double result = height*breadth;
			if (height == breadth) {
			System.out.println("\nThe object is square and the area is " + result);
			}
			else {
			System.out.println("The object is rectangle and the area is " + result);
			}
		
		}
}