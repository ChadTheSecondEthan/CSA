package Module6;

/*
 * Author: Ethan Fisher
 * Date: 9/15/2020
 * School: Franklin Academy HS
 * Do While Loop Example Program
 * 
 * Description: Example of a do while loop in java
 * Difficulties: forgot semicolon after while
 * Learned: do whiles are the same as whiles, 
 * but the condition is checked after the program is run
 */



public class EBFDoWhileLoop {

	public static void main(String[] args) {
		
		// example of a do while loop
		int j = 3;
		do {
			System.out.println(j);
			j++;
		} while (j < 12);
		
	}
	
}

/*
 * Sample Output:
 * 
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 
 */
