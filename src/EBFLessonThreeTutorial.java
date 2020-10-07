/*
 * Author: Ethan Fisher
 * Date: 8/24/2020
 * School: Franklin Academy HS
 * Lesson Three Tutorial
 * 
 * Description: Examples of math in Java
 * Difficulties: Figuring out how to check if a number is even or odd
 * Learned: Integer division and modulus
 */



public class EBFLessonThreeTutorial {

	public static void main(String[] args) {
		
		// assign some variables for quotient and remainder
		int quotient, remainder;
		quotient = 19 / 3;
		remainder = 19 % 3;
		
		// Print out the variables
		System.out.println("The quotient : " + quotient );
		System.out.println("The remainder: " + remainder );
		System.out.println("The original : " + (quotient*3 + remainder));
		
		int x = 327 ;//pick a number to go in here

		// check if the number is even or odd
		if (x % 2 == 0)
			System.out.println(x + " Is even ");
		else
			System.out.println(x + " Is odd ");
	}

}

/*
 * Sample Output:
 * The quotient : 6
 * The remainder: 1
 * The original : 19
 * 327 Is odd 
 */
