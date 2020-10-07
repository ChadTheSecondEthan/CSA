package Module6;

import java.io.File;
import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 9/14/2020
 * School: Franklin Academy HS
 * Cost of Items Program
 * 
 * Description: Find the total cost of items and average in the file (except last number)
 * Difficulties: Forgot to add "throws Exception" to main
 * Learned: while loops can be used to read files, just like for loops
 */

public class EBFCostOfItems {

	public static void main(String[] args) throws Exception {
		
		// initialize file and scanner
		File file = new File("src\\Module6\\M6L1.in");
		Scanner input = new Scanner(file);
		
		// sum, total number, and current number variables
		double sum = 0;
		int numNums = 0;
		double curNum = 0;
		
		// loop until the file reaches 0
		while((curNum = input.nextDouble()) != 0) {
			
			// print the current value
			System.out.printf("$%.2f\n", curNum);
			
			// add sum and number of numbers
			sum += curNum;
			numNums++;
		}
		
		// print sum, number of numbers, and average
		double average = sum / numNums;
		System.out.printf("The sum of the cost = $%.2f\n"
				+ "The number of costs = %d\n"
				+ "The average cost = $%.2f", sum, numNums, average);
		
		// close scanner so no memory leaks
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * $14.99
 * $39.99
 * $69.95
 * $74.95
 * $59.95
 * $49.95
 * $75.50
 * $14.50
 * $29.95
 * $29.95
 * The sum of the cost = $459.68
 * The number of costs = 10
 * The average cost = $45.97
 * 
 */
