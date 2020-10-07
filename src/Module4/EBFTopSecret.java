package Module4;

import java.util.Scanner;
/*
 * Author: Ethan Fisher
 * Date: 8/31/2020
 * School: Franklin Academy HS
 * Top Secret Program
 * 
 * Description: Converting initials to ASCII
 * Difficulties: Finding how to convert strings to chars to ints
 * Learned: chars are really just ints
 */



public class EBFTopSecret {

	public static void main(String[] args) {
		
		// initialize a scanner
		Scanner input = new Scanner(System.in);
		
		// variables for initials
		String firstInitial, lastInitial;
		
		// ask for initials, storing answer as a string
		System.out.print("Enter the first initial of your first name: ");
		firstInitial = input.next();
		
		System.out.print("Enter the first initial of your last name: ");
		lastInitial = input.next();
		
		// extract initials, if invalid make the strings say "Invalid Input"
		if (firstInitial.length() > 1 || !Character.isAlphabetic(firstInitial.charAt(0)))
			firstInitial = "Invalid Input";
		else firstInitial = Character.toUpperCase(firstInitial.charAt(0)) + "";
		
		if (lastInitial.length() > 1 || !Character.isAlphabetic(lastInitial.charAt(0)))
			lastInitial = "Invalid Input";
		else lastInitial = Character.toUpperCase(lastInitial.charAt(0)) + "";
		
		// print them out to the user
		System.out.printf("Initials: %s %s\n", firstInitial,
				lastInitial);
		
		// print again, but as ascii, only if both inputs were valid
		if (!(firstInitial.equals("Invalid Input") || lastInitial.equals("Invalid Input")))
			System.out.printf("Encrypted Name: %s %s", (int) firstInitial.charAt(0),
					(int) lastInitial.charAt(0));
		
		// close scanner so no memory leaks
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * Enter the first initial of your first name: q
 * Enter the first initial of your last name: z
 * Initials: Q Z
 * Encrypted Name: 81 90
 * 
 * 
 * Enter the first initial of your first name: J
 * Enter the first initial of your last name: 9
 * Initials: J Invalid Input
 */
