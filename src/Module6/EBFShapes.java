package Module6;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 9/15/2020
 * School: Franklin Academy HS
 * Shapes Program
 * 
 * Description: makes shapes off of a character and number
 * Difficulties: had trouble printing the correct number of rows
 * Learned: Use <= when you want the number to stop after looping at the number
 */

public class EBFShapes {

	public static void main(String[] args) {
		
		// some arbitrary number for the number of times the program will loop
		final int NUM_LOOPS = 5;
		
		// initialize Scanner
		Scanner input = new Scanner(System.in);
		
		// loop
		for (int i = 0; i < NUM_LOOPS; i++) {
			
			// get num rows and a character from user
			int rows;
			char character;
			
			System.out.print("How many rows: ");
			rows = input.nextInt();
			
			System.out.print("What character: ");
			character = input.next().charAt(0);
			
			// print rows
			for (int j = 0; j <= rows; j++) {
				
				// print the number of characters equal to the current row (or j)
				for (int k = 0; k < j; k++) {
					System.out.print(character);
				}
				
				// new line
				System.out.println();
			}
			
			// new line
			System.out.println();
		}
		
		// close Scanner
		input.close();
			
	}
}

/*
 * Sample Output:
 * 
 * ...
 * 
 * How many rows: 4
 * What character: I
 * 
 * I
 * II
 * III
 * IIII
 * 
 * How many rows: 6
 * What character: O
 * 
 * O
 * OO
 * OOO
 * OOOO
 * OOOOO
 * OOOOOO
 * 
 * ...
 * 
 */
