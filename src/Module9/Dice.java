package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/11/2020
 * 
 * Implements a Dice class
 */

public class Dice {
	
	// instance variables
	private int dots;
	
	/**
	 * Normal Constructor for the dice object. Simply roll the dice
	 */
	public Dice() { roll(); }
	
	/**
	 * Randomizes side
	 */
	public void roll() {
		// randomize the dice's number of dots
		dots = (int) Math.round(Math.random() * 5) + 1;
	}
	
	/*********************** Accessors (getters) *********************/
	
	public int getDots() { return dots; }
	
}
