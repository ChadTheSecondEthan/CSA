package Module5;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/*
 * Author: Ethan Fisher
 * Date: 9/1/2020
 * School: Franklin Academy HS
 * File Input Practice Program
 * 
 * Description: Printing the sum of numbers in a file
 * Difficulties: Converting the string from the file into an int
 * Learned: Scanners can be used to read from files
 */

public class EBFFileInputPractice {

	public static void main(String[] args) throws IOException {
		
		// initialize Scanner
		Scanner input = new Scanner(new File("testfile.in"));
		
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
		
		// variables to hold the number information
		String answer = "";
		int sum = 0;
		
		// loop through each of the text strings
		for (int j = 0; j <= maxIndex; j++) {
			
			// create a scanner and initialize the variables
			Scanner sc = new Scanner(text[j]);
			sum = 0;
			answer = "";
			
			// loop through the scanner's file
			while(sc.hasNext()) {
				
				// get the current integer
				int i = sc.nextInt();
				
				// only add the plus sign if there has already been a number added
				if (sum != 0)
					answer += "+" + i;
				else
					answer += i;
				
				// add to the sum
				sum += i;
			}
			
			// append the sum to the answer and print it
			answer += "=" + sum;
			System.out.println(answer);
		}
		
	}
	
}

/*
 * Sample Output: (For my file)
 * 
 * 1+234+54+5+2+9+32+2345=2682
 * 23+423+545+654+23+86=1754
 * 
 */
