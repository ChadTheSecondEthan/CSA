package Module5;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 8/31/2020
 * School: Franklin Academy HS
 * Insurance Calculator Program
 * 
 * Description: Calculate how much insurance insurance costs
 * Difficulties: Putting the "if" statements in the wrong
 * order made the program not work
 * Learned: Order matters with "if" statements
 */



public class EBFInsuranceCalculator {

	public static void main(String[] args) {
		
		// initialize Scanner
		Scanner input = new Scanner(System.in);
		
		// get age from the input
		System.out.print("Driver age: ");
		int age = input.nextInt();
		
		// calculate insurance cost and print
		int cost = 0;
		
		if (age < 0) {
			System.out.println("Wow, we have a jokester. You can't have negative age.");
		} else if (age < 16) {
			System.out.println("Very funny, but you can't drive.");
		} else if (age <= 18) {
			cost = age * 88;
		} else if (age < 25) {
			cost = age * 72;
		} else {
			cost = 500;
		}
		
		System.out.println("Insurance cost = " + cost);
		
		// close Scanner
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * Driver age: 16
 * Insurance cost = 1408
 * 
 * Driver age: 20
 * Insurance cost = 1440
 * 
 * Driver age: 30
 * Insurance cost = 500
 */
