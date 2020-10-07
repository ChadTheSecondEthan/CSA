package Module5;

import java.util.Random;
import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 9/1/2020
 * School: Franklin Academy HS
 * Guessing Game Program
 * 
 * Description: User has to guess the computer's number
 * Difficulties: Finding how to leave the loop once the user has won
 * Learned: Using for loops can add or subtract a number
 */

public class EBFGuessingGame {

	public static void main(String[] args) {
		
		// initialize Scanner
		Scanner input = new Scanner(System.in);
		
		// generate random number from one to ten
		Random random = new Random();
		int number = 1 + random.nextInt(10);
		
		// loop while the user has chances
		for (int chances = 3; chances > 0; chances--) {
			
			// ask for input
			System.out.print("Enter guess: ");
			int guess = input.nextInt();
			
			// check if the guess is higher, lower, or correct
			if (guess > number) {
				System.out.println("Your guess is too high.");
			} else if (guess < number) {
				System.out.println("Your guess is too low.");
			} else {
				System.out.println("You won!");
				break;
			}
			
			// if they lose, tell them the answer
			if (chances == 1) {
				System.out.println("You lost. The number was " + number);
			}
		}
		
		// close Scanner
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * Enter guess: 5
 * Your guess is too high.
 * Enter guess: 3
 * Your guess is too high.
 * Enter guess: 2
 * You won!
 * 
 * 
 * 
 * Enter guess: 1
 * Your guess is too low.
 * Enter guess: 2
 * Your guess is too low.
 * Enter guess: 3
 * Your guess is too low.
 * You lost. The number was 10
 * 
 */
