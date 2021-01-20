package Module9;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 10/12/2020
 * 
 * Implements a Basketball Team class
 */

public class BasketballTeam {
	
	// instance variables
	private String name;
	private int score;
	
	/**
	 * Normal Constructor for the team. Sets default values
	 */
	public BasketballTeam(String defaultName) { 
		name = defaultName;
		score = 0;
	}
	
	/**
	 * Used when the team scores
	 */
	public void score() {
		
		// randomly pick either 1, 2 or 3 points to score
		int numPoints;
		int rand = (int) (Math.random() * 3);
		
		// change the numPoints based on rand
		if (rand == 0)
			numPoints = 1;
		else if (rand == 1)
			numPoints = 2;
		else
			numPoints = 3;
		
		// adds that number to the score
		score += numPoints;
	}
	
	/**
	 * Gets the name and score from the user
	 */
	public void getNameAndScoreFromUser(Scanner input) {
		
		// ask for name
		System.out.print("Enter name for team " + name + ": ");
		name = input.nextLine();
		
		// ask for score
		System.out.print("Enter starting score: ");
		score = input.nextInt();
		
		// go to the next line
		input.nextLine();
		
	}
	
	/*********************** Accessors (getters) *********************/
	
	public int getScore() { return score; }
	public String getName() { return name; }
	
	/*********************** Mutators (setters) **********************/
	
	public void setScore(int score) { this.score = score; }
	public void setName(String name) { this.name = name; }
	
}
