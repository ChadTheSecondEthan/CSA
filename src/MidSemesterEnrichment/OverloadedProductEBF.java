package MidSemesterEnrichment;

/*
 * Author: Ethan Fisher
 * Date: 10/8/2020
 * School: Franklin Academy HS
 * Overloaded Product Program
 * 
 * Description: Overloaded methods
 * Difficulties: Forgot to switch return types and had errors
 * Learned: You can have multiple methods of the same name,
 * 		but different parameters and return types
 */

public class OverloadedProductEBF {
	
	public static void main(String[] args) {
		System.out.println ("Call product (5): " +product (5));
		System.out.println ("Call product (5.0): " +product (5.0));
		System.out.println ("Call product (5, 6): " + product (5, 6));
	}
	
	// the overloaded methods will return different outputs based on their inputs
	public static int product(int input) { return input * 5; }
	public static double product(double input) { return input * 5; }
	public static double product(double a, double b) { return a * b; }
	
}

/*
 * Sample Output:
 * 
 * Call product (5): 25
 * Call product (5.0): 25.0
 * Call product (5, 6): 30.0
 * 
 */
