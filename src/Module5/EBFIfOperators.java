package Module5;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 8/31/2020
 * School: Franklin Academy HS
 * If Statements Program
 * 
 * Description: Print if someone has passed or failed
 * Difficulties: I put "=>" instead of ">="
 * Learned: You can use booleans inside of "if" statements
 */



public class EBFIfOperators {

	public static void main(String[] args) {
		
		// initialize Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your grade? ");
		int grade = input.nextInt();
		
		if (grade >= 70) {
			System.out.println("Congratulations, you passed");
		} else {
			System.out.println("Better luck next time");
		}
		
		// close Scanner
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * What is your grade? 90
 * Congratulations, you passed
 * 
 * What is your grade? 50
 * Better luck next time
 */
