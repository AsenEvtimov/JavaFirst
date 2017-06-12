package sheet16Strings;

public class Ex1equlasAnd {

	public static void main(String[] args) {
		
		String strA = new String ("Monday");
		String strB = new String ("Monday");
		String strC = "Tuesday";
		String strD = "Tuesday";
		String strE = new String ("Tuesday");
		
		System.out.println("strA == strB: " + (strA==strB)); //false - Do not refer to the same object.
		System.out.println("strC == strD: " + (strC==strD)); // true
		System.out.println("strA.equals(strB): " + strA.equals(strB)); //true
		System.out.println("strC.equals(strD): " + strC.equals(strD)); //true
		System.out.println("strD == strE: " + (strD==strE)); // false
		
		String result = strC.toUpperCase();
		System.out.println("strC.toUpperCase(): " + result);//TUESDAY
		System.out.println("strC == strD: " + (strC==strD)); // true
		System.out.println("strC.equals(strD): " + strC.equals(strD)); //true
		
	}
}
