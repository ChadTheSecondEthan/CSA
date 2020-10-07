package Module6;

/*
 * Author: Ethan Fisher
 * Date: 9/14/2020
 * School: Franklin Academy HS
 * For Loop Example Program
 * 
 * Description: For loop examples
 * Difficulties: put > instead of <, and the loop ran indefinitely
 * Learned: nested for loops run
 * 	(number of times outside loop runs) * (number inside loop runs) many times
 */



public class EBFForLoop {

	public static void main(String[] args) {
		
		// adding up sum
		int sum = 0;
		for (int j = 3; j <= 7; j++) {
			sum += j;
			System.out.println(sum);
		}
		
		// new line
		System.out.println();
		
		// printing number outside of the loop, no braces loop
		int count = 0;
		for (int j = 0; j <= 20; j++) 
			for (int k = 0; k < 5; k++) 
				count++;
		
		System.out.println(count);
		
		// Scope, break video loop
		sum = 0;
		int j = 0;
		for (j = 3; j <= 10; j++) {
			double d = 37.93;
			sum += j;
			System.out.println(sum);
		}
		System.out.println(j);
		
		// new line
		System.out.println();
		
		// going down loop 
		for (j = 5; j >= 0; j--) {
			System.out.println(j);
		}
		
	}
	
}

/*
 * Sample Output:
 * 
 * 3
 * 7
 * 12
 * 18
 * 25
 * 
 * 105
 * 3
 * 7
 * 12
 * 18
 * 25
 * 33
 * 42
 * 52
 * 11
 * 
 * 5
 * 4
 * 3
 * 2
 * 1
 * 0
 * 
 */
