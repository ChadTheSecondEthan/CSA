package Module6;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 9/17/2020
 * School: Franklin Academy HS
 * Leap Year Program
 * 
 * Description: Determine if a year is a leap year
 * Difficulties: Ordering the 3 parts for a year being a leap year
 * Learned: You can split conditions across multiple lines
 * by giving booleans those values, then combining the booleans
 */

public class EBFLeapYear {

	public static void main(String[] args) {
		
		// initialize scanner
		Scanner input = new Scanner(System.in);
		
		// get year from the user
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		// print out the year back
		System.out.println("The year you entered is " + year);
		
		// determine if year is a leap year
		boolean req1 = year % 4 == 0;
		boolean req2 = year % 100 != 0 || year % 400 == 0;
		
		boolean isLeapYear = req1 && req2;
		
		// print results, adding "not" if it is a leap year
		if (isLeapYear) {
			System.out.printf("The year %d is a leap year", year);
		} else {
			System.out.printf("The year %d is not a leap year", year);
		}
		
		// close scanner
		input.close();
			
	}
}

/*
 * Sample Output:
 * 
 * Enter a year: 1988
 * The year you entered is 1988
 * The year 1988 is a leap year.
 * 
 * Enter a year: 1800
 * The year you entered is 1800
 * The year 1800 is not a leap year.
 * 
 */
