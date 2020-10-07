package Module7;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 9/18/2020
 * School: Franklin Academy HS
 * Reverse String Program
 * 
 * Description: Prints a string in all caps and reversed
 * Difficulties: 
 * Learned: 
 */

public class ReverseStringEBF {

	public static void main(String[] args) {
		
		// initialize Scanner
		Scanner input = new Scanner(System.in);
		
		// variable for repeating the loop
		boolean again;
		do {
		
			// get string input
			System.out.println("Enter String: ");
			String userString = input.nextLine();
			
			// reverse string
			
			// ask user if they want to input another string
			System.out.println("Would you like to enter another string? (Y / N)");
			again = input.nextBoolean();
		
		} while(!again);
			
	}
}

/*
 * Sample Output:
 * 
 */
