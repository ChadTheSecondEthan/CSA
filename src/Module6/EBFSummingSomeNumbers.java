package Module6;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 9/15/2020
 * School: Franklin Academy HS
 * Summing Some Numbers Program
 * 
 * Description: sums the numbers between two inputs
 * Difficulties: forgot to make sum a double before dividing it by number of numbers
 * Learned: do while loops can be used like for loops or while loops, 
 * but they always run before the condition is checked
 */



public class EBFSummingSomeNumbers {

	public static void main(String[] args) {
		
		// declare variables
		int startingNumber, endingNumber;
		int sum, numNumbers;
		
		// initialize scanner
		Scanner input = new Scanner(System.in);
		
		// ask for starting and ending number
		System.out.print("Enter starting number: ");
		startingNumber = input.nextInt();
		System.out.print("Enter ending number: ");
		endingNumber = input.nextInt();
		
		// find the sum
		sum = 0;
		numNumbers = 0;
		do {
			
			// get the current number and print
			int curNum = startingNumber + numNumbers;
			System.out.println(curNum);
			
			// add current number to sum and increase number of numbers
			sum += curNum;
			numNumbers++;
			
		} while(startingNumber + numNumbers <= endingNumber);
		
		// print sum and average
		System.out.printf("Sum of the numbers %d-%d is %d\n", 
				startingNumber, endingNumber, sum);
		System.out.printf("The average of the numbers %d-%d is %.2f", 
				startingNumber, endingNumber, (double) sum / numNumbers);
		
		// close scanner so no memory leaks
		input.close();

	}
}

/*
 * Sample Output:
 * 
 * Enter starting number: 12
 * Enter ending number: 15
 * 12
 * 13
 * 14
 * 15
 * Sum of the numbers 12-15 is 54
 * The average of the numbers 12-15 is 13.50
 * 
 */
