package Module5;

import java.util.Scanner;
/*
 * Author: Ethan Fisher
 * Date: 9/3/2020
 * School: Franklin Academy HS
 * Switch Statement Program
 * 
 * Description: Switch statements for users
 * Difficulties: forgot to use breaks, so it printed all of the statements
 * Learned: Switches are better than multiple ifs
 */



public class EBFSwitchExample {

	public static void main(String[] args) {
		
		// print user's choices
		System.out.println("Make your arithmetic selection from the choices below:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division\n");
		System.out.print("   Your choice? ");
		
		// create scanner and get user choice
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		// get operands from user
		System.out.print("\nEnter first operand ");
		double operand = input.nextDouble();
		
		System.out.print("\nEnter second operand ");
		double operand2 = input.nextDouble();
		
		switch(choice) {
			case 1: // addition
				System.out.print(operand + " plus " + operand2 + " = " + (operand + operand2));
				break;
			case 2: // subtraction
				System.out.print(operand + " minus " + operand2 + " = " + (operand - operand2));
				break;
			case 3: // multiplication
				System.out.print(operand + " times " + operand2 + " = " + (operand * operand2));
				break;
			case 4: // division
				System.out.print(operand + " divided by " + operand2 + " = " + (operand / operand2));
				break;
			default:
				System.out.println("Please enter 1, 2, 3, or 4");
		}
		
	}
	
}

/*
 * Sample Output:
 * 
 * Make your arithmetic selection from the choices below:
 * 1. Addition
 * 2. Subtraction
 * 3. Multiplication
 * 4. Division
 * 
 * 	  Your choice? 3
 * 
 * Enter first operand 12
 * 
 * Enter second operand 4
 * 12.0 times 4.0 = 48.0
 * 
 */
