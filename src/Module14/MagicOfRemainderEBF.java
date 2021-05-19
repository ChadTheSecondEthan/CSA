package Module14;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 3/30/2021
 * School: Franklin Academy HS
 * Magic Of Remainder Program
 * 
 * Description: Changes the base of a number
 * Difficulties: converting numbers 10 - 16 to characters
 * Learned: Converting ints to chars can be done by just adding or subtracting
 * 		letters
 */

public class MagicOfRemainderEBF {
	
	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// get the original number
		System.out.print("Enter the base 10 number: ");
		int number = input.nextInt();
		
		// get the new base
		System.out.print("Enter new base: ");
		int base = input.nextInt();
		
		// convert to new base
		String newNumber = changeBase(number, base);
		
		// print results
		System.out.printf("The number %d [base 10] = %s [base %d]", number, newNumber, base);
		
		// close scanner
		input.close();
		
	}
	
	// converts a base 10 number from base 10 to base base
	// returns a string since hex characters may be used
	private static String changeBase(int number, int base) {
		if (number == 0) 
			return "";
		return changeBase(number / base, base) + toHex(number % base);
	}
	
	// converts a number 0 - 16 to 0 - 9 and A - F
	private static char toHex(int number) {
		if (number > 9)
			return (char) ('A' + number - 10);
		return (char) (number + '0');
	}

}

/**
 * Sample Output:

Enter the base 10 number: 100
Enter new base: 16
The number 100 [base 10] = 64 [base 16]

Enter the base 10 number: 55
Enter new base: 12
The number 55 [base 10] = 47 [base 12]

Enter the base 10 number: 243
Enter new base: 16
The number 243 [base 10] = F3 [base 16]

 */
