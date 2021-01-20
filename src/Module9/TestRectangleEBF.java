package Module9;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 10/10/2020
 * School: Franklin Academy HS
 * Rectangle Tester Program
 * 
 * Description: Create rectangles
 * Difficulties: Adding input.nextLine() so input.nextDouble() would function
 * Learned: Printing an object is the same as printing its toString method
 */

public class TestRectangleEBF {
	
	public static void main(String[] args) {
		
		// initialize Scanner
		Scanner input = new Scanner(System.in);
		
		// loop program while the user says so
		String answer;
		do {
			
			// get length and width from user
			System.out.print("Please enter the length of the rectangle (in inches): ");
			double length = input.nextDouble();

			System.out.print("Please enter the width of the rectangle (in inches): ");
			double width = input.nextDouble();
			
			// go to the next line so the Scanner won't malfunction
			input.nextLine();
			
			// create rectangle object and print attributes
			Rectangle rectangle = new Rectangle(length, width);
			System.out.println(rectangle);
			
			// ask if user wants to input another
			System.out.print("Would you like to run another (y/n)? ");
			answer = input.nextLine();
			
		} while(!answer.equals("n"));
		
		// close Scanner
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * Please enter the length of the rectangle (in inches): 6
 * Please enter the width of the rectangle (in inches): 10
 * The area of the rectangle is 60.00 inches. The perimeter is 32.00 inches.
 * Would you like to run another (y/n)? y
 * Please enter the length of the rectangle (in inches): 10
 * Please enter the width of the rectangle (in inches): 20
 * The area of the rectangle is 200.00 inches. The perimeter is 60.00 inches.
 * Would you like to run another (y/n)? n
 * 
 */
