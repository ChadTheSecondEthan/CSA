package Module9;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 10/12/2020
 * School: Franklin Academy HS
 * Basketball Game Program
 * 
 * Description: Play a basketball game, given user input
 * Difficulties: Getting all of the starting values 
 * 		from the user for each basketball team
 * Learned: Passing scanners as a parameter for the basketball 
 * 		team lets you get input inside the basketball team object
 */

public class BasketballGameEBF {
	
	public static void main(String[] args) {
		
		// variable for if the game is finished or not
		boolean gameFinished = false;
		
		// initialize scanner and file
		Scanner input = new Scanner(System.in);
		
		// create basketball team object, setting their default values
		BasketballTeam teamOne = new BasketballTeam("One");
		BasketballTeam teamTwo = new BasketballTeam("Two");
		
		// get the default values from the teams
		teamOne.getNameAndScoreFromUser(input);
		teamTwo.getNameAndScoreFromUser(input);
		
		// get the max score from the user
		System.out.print("Enter max score: ");
		int maxScore = input.nextInt();
		
		// go to the next line
		input.nextLine();
		
		// loop the program while the game is in progress
		while(!gameFinished) {
			
			// check who scored
			System.out.print("Which team scored? ");
			String answer = input.nextLine();
			
			// check which team scored
			if (answer.equals("1") || answer.equals(teamOne.getName())) 
				teamOne.score();

			else if (answer.equals("2") || answer.equals(teamTwo.getName())) 
				teamTwo.score();
			
			// otherwise tell the user to try again.
			else {
				System.out.println("Invalid input. Try again.");
				continue;
			}
			
			// check if a team has won
			if (teamOne.getScore() > maxScore) {
				System.out.println(teamOne.getName() + " has won.");
				gameFinished = true;
			}
			
			else if (teamTwo.getScore() > maxScore) {
				System.out.println(teamTwo.getName() + " has won.");
				gameFinished = true;
			}
			
			// print their scores
			printScores(teamOne, teamTwo);
			
		}
		
		// close scanner
		input.close();
		
	}
	
	/**
	 * Prints the scores of the teams
	 */
	public static void printScores(BasketballTeam teamOne, BasketballTeam teamTwo) {
		
		// print the current scores
		if (teamOne.getScore() == teamTwo.getScore())
			System.out.printf("The teams are tied at a score of %d\n", teamOne.getScore());
		
		else {
			
			// get the winning team name
			String winningTeam = teamOne.getScore() > teamTwo.getScore() ? 
					teamOne.getName() : teamTwo.getName();
					
			// print their scores
			System.out.printf("%s's score: %d \n%s's score: %d \n"
					+ "Current winner: %s.\n", teamOne.getName(), 
					teamOne.getScore(), teamTwo.getName(), 
					teamTwo.getScore(), winningTeam);
			
		}
	}
	
}

/*
 * Sample Output:

Enter name for team One: Lakers
Enter starting score: 7
Enter name for team Two: Celtics
Enter starting score: 5
Enter max score: 10
Which team scored? Celtics
The teams are tied at a score of 7
Which team scored? Lakers
Lakers's score: 9 
Celtics's score: 7 
Current winner: Lakers.
Which team scored? Lakers
Lakers has won.

 */
