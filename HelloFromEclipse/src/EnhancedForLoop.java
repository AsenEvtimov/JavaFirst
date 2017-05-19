
public class EnhancedForLoop {

	public static void main(String[] args) {
		 
		int array [] = {2,3,4,1};
		int sum=0;
		 
		System.out.print("Array elements: ");
		//for (int i =0; i<array.length; i++){//regular loop to print and sum the elements of the array
		for(int a : array){//Enhanced for loop to print the elements and the sum of the array
			sum += a;
			System.out.print(" "+ a);
		}
		System.out.println("\nSum of the Array is: " + sum);
	}
	
}
