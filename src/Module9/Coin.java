package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/11/2020
 * 
 * Implements a Coin class
 */

public class Coin {
	
	// instance variables
	private boolean heads;
	
	/**
	 * Normal Constructor for the Coin object. Simply flips the coin
	 */
	public Coin() { flip(); }
	
	/**
	 * Randomizes side
	 */
	public void flip() {
		// randomize the coin's side
		heads = Math.round(Math.random()) == 0;
	}
	
	/*********************** Accessors (getters) *********************/
	
	public boolean getHeads() { return heads; }
	public String getHeadsString() { return heads ? "Heads" : "Tails"; }
	
	/*********************** Mutators (setters) **********************/
	
	public void setHeads(boolean heads) { this.heads = heads; }
	
}
