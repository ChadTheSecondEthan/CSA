package Module6;

import java.util.Scanner;
import java.lang.Math;

/*
 * Author: Ethan Fisher
 * Date: 9/15/2020
 * School: Franklin Academy HS
 * Guessing Game Program
 * 
 * Description: guesser gets money and chances to guess a number the computer generates
 * Difficulties: Couldn't generate a random number correctly
 * Learned: do whiles can be used when you need to initialize a variable within the scope of the loop
 */

public class EBFGuessingGame {

	public static void main(String[] args) {
		
		// variables for user money, random number, user guess, etc.
		final double COST_PER_ROUND = 0.25;
		double money = 2;
		int random = (int) (Math.random() * 99 + 1);
		int guess;
		
		// initialize scanner
		Scanner input = new Scanner(System.in);
		
		// loop while the user hasn't guessed correct
		do {
			
			// get guess
			System.out.printf("Payout is $%.2f. Enter guess: ", money);
			guess = input.nextInt();
			
			// check guess
			if (guess < random) {
				System.out.println("Your guess is too low");
			} else if (guess > random) {
				System.out.println("Your guess is too high");
			}
			
			// the user loses money every guess
			money -= COST_PER_ROUND;
			
		} while (guess != random);
		
		// print out final results
		if (money > 0) {
			// meaning they've won
			System.out.printf("Congratulations. Computer's number is %d. This guess cost you $%.2f", random, 2 - money);
		} else {
			// meaning they've lost
			System.out.printf("You lost. Computer's number is %d.", random);
		}
		
		// close input so no memory leaks
		input.close();
		
	}
}

/*
 * Sample Output:
 * 
 * Your guess is too low
 * Payout is $1.50. Enter guess: 87
 * Your guess is too low
 * Payout is $1.25. Enter guess: 94
 * Your guess is too low
 * Payout is $1.00. Enter guess: 97
 * Congratulations. Computer's number is 97. This guess cost you $1.25
 * 
 */
