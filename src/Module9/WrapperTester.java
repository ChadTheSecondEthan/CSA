package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/11/2020
 * School: Franklin Academy HS
 * Wrapper Class Tester Program
 * 
 * Description: Make a tester for wrapper classes
 */

public class WrapperTester {
	
	public static void main(String[] args) {
		
		// integer wrappers
		Integer x = 3;
		Integer y = 4;
		System.out.println(x * y);
		
		// converting strings to ints and doubles
		String s = "139";
		int i = Integer.parseInt(s);
		System.out.println(i);

		String s2 = "210.0034";
		double d = Double.parseDouble(s2);
		System.out.println(d);
		
		// printing hex strings
		System.out.println(Integer.toHexString(i));
	}
	
}

/*
 * Sample Output:
 * 
 * 12
 * 139
 * 210.0034
 * 8b
 * 
 */
