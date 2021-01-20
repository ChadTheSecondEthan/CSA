package Module9;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 10/11/2020
 * School: Franklin Academy HS
 * Coin Tester Program
 * 
 * Description: Create coins and wait until 3 lands on the same side
 * Difficulties: Flipping only for a set number of times, 
 * 		making sure to stop if they land on the same side before the set number
 * Learned: Objects can be really simple, like just having a heads or tails
 */

public class CoinTesterEBF {
	
	public static void main(String[] args) {
		
		// initialize scanner
		Scanner input = new Scanner(System.in);
		
		// get max number of flips
		System.out.print("Input max number of coin flips: ");
		int maxFlips = input.nextInt();
		
		// create Coins
		Coin one = new Coin();
		Coin two = new Coin();
		Coin three = new Coin();
		
		// loop program until coins are on the same side
		int numTimes = 0;
		while(numTimes < maxFlips) {
			
			// print their attributes
			System.out.printf("Coin 1 is on %s, Coin 2 is on %s, Coin 3 is on %s\n", 
					one.getHeadsString(), two.getHeadsString(), three.getHeadsString());
			
			// if coins are the same, end the program and print number of tries
			if (coinsAreSame(one, two, three)) {
				System.out.println("It took " + (numTimes + 1) + " trie(s).");
				break;
			}
			
			// otherwise, randomize coins again
			one.flip();
			two.flip();
			three.flip();
			
			// increment numTimes
			numTimes++;
			
			// if the max number has been reached, the coins were never all on the same side
			if (numTimes == maxFlips)
				System.out.println("The coins did not all land on the same side after " + maxFlips + " trie(s).");
			
		}
		
		// close scanner
		input.close();
		
	}
	
	/**
	 * Checks if the coins are the same side
	 */
	public static boolean coinsAreSame(Coin one, Coin two, Coin three) {
		return one.getHeads() && two.getHeads() && three.getHeads() ||
				!one.getHeads() && !two.getHeads() && !three.getHeads();
	}
	
}

/*
 * Sample Output:
 * 
 * Input max number of coin flips: 5
 * Coin 1 is on Heads, Coin 2 is on Tails, Coin 3 is on Heads
 * Coin 1 is on Heads, Coin 2 is on Heads, Coin 3 is on Heads
 * It took 2 trie(s).
 * 
 */
