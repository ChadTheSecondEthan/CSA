package Module5;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 8/31/2020
 * School: Franklin Academy HS
 * Checking Grades Program
 * 
 * Description: Prints grades
 * Difficulties: Ordering the else if statements wrong
 * Learned: You can have as many else ifs as you want, but only one else
 */



public class EBFGradeChecker {

	public static void main(String[] args) {
		
		// initialize Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your grade? ");
		int grade = input.nextInt();
		
		if (grade >= 90) {
			System.out.println("You made an A.");
		} else if (grade >= 80) {
			System.out.println("You made a B.");
		} else if (grade >= 70) {
			System.out.println("You made a C.");
		} else {
			System.out.println("You failed.");
		}
		
		// close Scanner
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * What is your grade? 95
 * You made an A.
 * 
 * What is your grade? 85
 * You made an B.
 * 
 * What is your grade? 75
 * You made an C.
 * 
 * What is your grade? 65
 * You failed.
 */
