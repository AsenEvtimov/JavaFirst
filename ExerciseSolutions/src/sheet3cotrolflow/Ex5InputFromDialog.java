
package sheet3cotrolflow;

import javax.swing.JOptionPane;
public class Ex5InputFromDialog {
	public static void main(String[] args) {
	
	String input = JOptionPane.showInputDialog("Enter Height: ");
	double height = Double.parseDouble(input);
	
	input = JOptionPane.showInputDialog("Enter Breadth: ");
	double breadth = Double.parseDouble(input);
	
	Ex5InputFromDialog a = new Ex5InputFromDialog();
	a.getArea(height,breadth);
	
	
	}
	public void getArea (double height, double breadth) {
		double result = height*breadth;
			if (height == breadth) {
			
			JOptionPane.showMessageDialog (null, String.format("The object is square and the area is %.2f",result));
			}
			else {
			JOptionPane.showMessageDialog (null, String.format("The object is rectangle and the area is %.2f",result));
			}
		
		}
}