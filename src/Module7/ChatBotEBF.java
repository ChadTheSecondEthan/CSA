package Module7;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 10/4/2020
 * School: Franklin Academy HS
 * Chat Bot Program
 * 
 * Description: Make a chat bot that will answer a few questions
 * Difficulties:
 * Learned: 
 */

public class ChatBotEBF {

	public static void main(String[] args) {
		
		// variables for number of wins
		int computerWins = 0;
		int playerWins = 0;
		
		// initialize scanner
		Scanner input = new Scanner(System.in);
		
		// loop program 5 times, or until user ends it themselves
		for (int i = 0; i < 5; i++) {
			
			// get input from the user as a lowercase string
			System.out.print("Which object do you want to be: Rock, Paper, or Scissors? ");
			String playerChoice = input.nextLine().toLowerCase();
			
			// generate random choice from computer
			String computerChoice;
			int randInt = (int) (Math.random() * 3);
			
			// turn random in into a string
			if (randInt == 0) 
				computerChoice = "rock";
			else if (randInt == 1) 
				computerChoice = "paper";
			else 
				computerChoice = "scissors";
			
			// print computer choice
			System.out.printf("Computer chooses %s\n", computerChoice);
			
			// compare answers (player only has to input first 2 letters for answer to be recognized)
			if (playerChoice.startsWith(computerChoice.substring(0, 1))) {
				System.out.println("Tie: nobody wins");
			} else {
				if ((computerChoice.equals("rock") && playerChoice.startsWith("pa")) || 
						(computerChoice.equals("paper") && playerChoice.startsWith("sc")) ||
						(computerChoice.equals("scissors") && playerChoice.startsWith("ro"))) {
					System.out.println("You win!");
					playerWins++;
				} else {
					System.out.println("Computer wins!");
					computerWins++;
				}
			}
			
			// print results
			System.out.printf("Computer: %d, You: %d\n\n", computerWins, playerWins);
			
			// ask if user wants to play again if less than five games played
			if (i != 4) {
				System.out.print("Do you want to play again? ");
				String answer = input.nextLine().toLowerCase();
			
				// if answer is n or no, leave the loop
				if (answer.equals("n") || answer.equals("no")) break;
			}
		}
		
		// close scanner
		input.close();
			
	}
}

/*
 * Sample Output:
 * 
 * Which object do you want to be: Rock, Paper, or Scissors? papa
 * Computer chooses paper
 * Tie: nobody wins
 * Computer: 0, You: 0
 * 
 * Do you want to play again? No
 * 
 * 
 * Which object do you want to be: Rock, Paper, or Scissors? scissors
 * Computer chooses paper
 * You win!
 * Computer: 0, You: 1
 * 
 * Do you want to play again? Yes
 * Which object do you want to be: Rock, Paper, or Scissors?
 * ...
 * 
 */
