package Module6;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 9/17/2020
 * School: Franklin Academy HS
 * Rock Paper Scissors Program
 * 
 * Description: Play rock paper scissors with a player
 * Difficulties: checking for who won based off of two integers
 * Learned: final variables are good when checking for constant values
 */

public class EBFRockPaperScissors {

	public static void main(String[] args) {
		
		// variables for game choices and computer's choice
		final int ROCK = 1;
		final int SCISSORS = 2;
		final int PAPER = 3;
		int random = (int) (Math.random() * 3) + 1;
		
		// initialize scanner
		Scanner input = new Scanner(System.in);
		
		// get year from the user
		System.out.print("Game choices are 1 for rock, 2 for scissors, or 3 for paper\n"
				+ "Enter your game choice (1, 2, or 3): ");
		int choice = input.nextInt();
		
		// get player's choice as a string
		String playerChoice, computerChoice;
		switch(choice) {
			case ROCK:
				playerChoice = "rock";
				break;
			case SCISSORS:
				playerChoice = "scissors";
				break;
			case PAPER:
				playerChoice = "paper";
				break;
			default:
				
				// if their answer isn't valid, stop the program
				System.out.println("Input not allowed.");
				input.close();
				return;
		}

		// get computer's choice as string
		switch(random) {
			case ROCK:
				computerChoice = "rock";
				break;
			case SCISSORS:
				computerChoice = "scissors";
				break;
			default:
				// which is paper
				computerChoice = "paper";
		}
		
		// print choices to user
		System.out.printf("You entered %s.\nComputer chose %s.\n", playerChoice, computerChoice);
		
		// calculate who won
		
		// variables for winning, losing or tying
		final int WIN = 1, LOSE = 2, TIE = 3;
		int result;
		
		if (choice == ROCK) {
			if (random == ROCK) {
				result = TIE;
			} else if (random == SCISSORS) {
				result = WIN;
			} else {
				result = LOSE;
			}
		} else if (choice == SCISSORS) {
			if (random == ROCK) {
				result = LOSE;
			} else if (random == SCISSORS) {
				result = TIE;
			} else {
				result = WIN;
			}
		} else {
			if (random == ROCK) {
				result = WIN;
			} else if (random == SCISSORS) {
				result = LOSE;
			} else {
				result = TIE;
			}
		}
		
		// tell the user who won
		String resultString;
		if (result == WIN) {
			resultString = "You win! " + playerChoice + " beats " + computerChoice;
		} else if (result == LOSE) {
			resultString = "Computer wins! " + computerChoice + " beats " + playerChoice;
		} else {
			resultString = "Tie! " + playerChoice + " ties to " + computerChoice;
		}
		
		System.out.println(resultString);
		
		// close scanner
		input.close();
			
	}
}

/*
 * Sample Output:
 * 
 * Game choices are 1 for rock, 2 for scissors, or 3 for paper
 * Enter your game choice (1, 2, or 3): 2
 * You entered scissors.
 * Computer chose paper.
 * You win! scissors beats paper
 * 
 * Game choices are 1 for rock, 2 for scissors, or 3 for paper
 * Enter your game choice (1, 2, or 3): 3
 * You entered paper.
 * Computer chose paper.
 * Tie! paper ties to paper
 * 
 */
