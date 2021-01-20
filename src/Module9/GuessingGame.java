package Module9;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 10/12/2020
 * 
 * Implements a guessing game
 */

public class GuessingGame {
	
	// number of players
	public static final int NUM_PLAYERS = 3;
	private int[] numPlayerTries;
	
	// scanner for getting input
	private Scanner input;
	
	// upper and lower bounds for random number
	private int upper;
	private int lower;
	
	/**
	 * Constructor for making a guessing game
	 */
	public GuessingGame() {
		input = new Scanner(System.in);
		numPlayerTries = new int[NUM_PLAYERS];
	}
	
	/**
	 * Runs the entire guessing game
	 */
	public void startGame() {
		
		// get the upper and lower bounds for rand
		getUpperAndLowerBound();
		
		// loop for number of players
		for (int i = 1; i <= NUM_PLAYERS; i++) {
			
			// get guesses from the current player
			playWithPlayer(i);
			
			// ask the next player to play
			System.out.printf("Player %d, would you like to play (y/n): ", i + 1);
			String answer = input.nextLine();
			
			// if not, end the game
			if (answer.toLowerCase().equals("n"))
				return;
		}
	}
	
	/**
	 * Gets the upper and lower bound from the user
	 */
	public void getUpperAndLowerBound() {
		
		// upper bound
		System.out.print("Enter lower bound: ");
		upper = input.nextInt();
		
		// loop getting the high bound while it is 
		// less than or equal to the higher bound
		do {
			System.out.print("Enter upper bound: ");
			lower = input.nextInt();
		} while(lower <= upper);
		
	}
	
	/**
	 * Allows a specific player to guess
	 */
	public void playWithPlayer(int number) {
		
		// calculate random number
		int difference = upper - lower;
		int rand = (int) (Math.random() * difference) + lower;
		System.out.println("Computer has generated a number for Player " + number + ". (The computer generated " + rand + ")");
		
		// ask the user to guess
		System.out.printf("Player %d, guess: ", number);
		
		// loop getting guesses from the user
		int guess = input.nextInt();
		
		// count number of tries
		int numTries = 1;
		while(guess != rand) {
			
			// check if the guess is higher or lower
			String highOrLow;
			if (guess < rand)
				highOrLow = "Too low";
			else
				highOrLow = "Too high";
			
			// get user input
			System.out.printf("%s, guess again: ", highOrLow);
			guess = input.nextInt();
			
			numTries++;
		}
		
		// if they're here, they've gotten the answer right
		System.out.printf("Correct! Player %d took %d guesses.\n", number, numTries);
		numPlayerTries[number - 1] = numTries;
		
		// if it's not the first player, print who is in the lead
		if (number != 1) {
			
			// index for the highest nmber
			int highestIndex = 0;
			
			// check if any of the numbers are greater than the current one
			for (int i = 1; i < number; i++) {
				if (numPlayerTries[i] < numPlayerTries[highestIndex])
					highestIndex = i;
			}
			
			System.out.printf("Player %d is in the lead! ", highestIndex + 1);
		}
		
		// go to the next line in the scanner
		input.nextLine();
		
	}
	
}
