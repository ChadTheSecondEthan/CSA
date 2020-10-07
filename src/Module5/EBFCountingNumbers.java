package Module5;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/*
 * Author: Ethan Fisher
 * Date: 9/4/2020
 * School: Franklin Academy HS
 * Counting Numbers Program
 * 
 * Description: Find the number of numbers less than 500, and the number that are greater than 500
 * Difficulties: Finding the path I needed for the file
 * Learned: Looping through an entire file only takes a few lines of code
 */

public class EBFCountingNumbers {

	public static void main(String[] args) throws IOException {
		
		// create scanner
		File file = new File("src\\Module5\\m5assignment10file.txt");
		Scanner input = new Scanner(file);
		
		// variables for file
		int lessThan500 = 0;
		int moreThanOrEqual500 = 0;
		
		// loop through the numbers
		while(input.hasNextInt()) {
			
			// get number and check its value
			int number = input.nextInt();
			
			if (number < 500) {
				lessThan500++;
			} else {
				moreThanOrEqual500++;
			}
			
		}
		
		// print results
		System.out.printf("The number of numbers less than 500 is %d\n" +
				"The number of numbers greater than or equal to 500 is %d\n" +
				"The total number of numbers is %d", 
				lessThan500, moreThanOrEqual500, lessThan500 + moreThanOrEqual500);
		
		// close scanner so no memory leaks
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * The number of numbers less than 500 is 263
 * The number of numbers greater than or equal to 500 is 237
 * The total number of numbers is 500
 * 
 */
