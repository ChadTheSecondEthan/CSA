package Module5;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/*
 * Author: Ethan Fisher
 * Date: 9/3/2020
 * School: Franklin Academy HS
 * File Sum and Average Program
 * 
 * Description: Printing the sum and average of numbers in a file
 * Difficulties: finding the number of numbers in the file
 * Learned: Scanners allow you to find the number of items in a file
 */

public class EBFSumAndAverage {

	public static void main(String[] args) throws IOException {
		
		// initialize Scanner with text file
		File file = new File("src\\Module5\\m5assignment8file.txt");
		Scanner input = new Scanner(file);
		
		// length of the file, and array of text
		int maxIndex = -1;
		String[] text = new String[100];
		
		// read through the file and add its information to the array
		while(input.hasNext()) {
			maxIndex++;
			text[maxIndex] = input.nextLine();
		}
		// close the scanner
		input.close();
		
		// sum variable, and number of numbers variable
		int sum = 0;
		int numbers = 0;
		
		// loop through each of the text strings
		for (int j = 0; j <= maxIndex; j++) {
			
			// create a scanner and initialize the variables
			Scanner sc = new Scanner(text[j]);
			sum = 0;
			
			// loop through the scanner's file
			while(sc.hasNext()) {
				
				// get the current integer
				int i = sc.nextInt();
				
				System.out.println(i);
				
				// add to the sum and number of numbers
				sum += i;
				numbers++;
			}
			
			// close scanner so no memory leaks
			sc.close();
			
		}
		
		// calculate average and print out results
		double average = (double) sum / numbers;
		System.out.println("The sum of the numbers = " + sum + "\n" +
				"The number of scores = " + numbers + "\n" + 
				"The average of the numbers = " + average);
	
		
	}
	
}

/*
 * Sample Output: 
 * 
 * 3
 * 8
 * 1
 * 13
 * 18
 * 15
 * 7
 * 17
 * 1
 * 14
 * 0
 * 12
 * 3
 * 2
 * 5
 * 4
 * The sum of the numbers = 123
 * The number of scores = 16
 * The average of the numbers = 7.6875
 * 
 */
