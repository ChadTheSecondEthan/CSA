package Module9;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 10/11/2020
 * School: Franklin Academy HS
 * Dice Roller Program
 * 
 * Description: Create dice, and roll them while the user wants them to be rolled
 * Difficulties: Getting a number between 1 - 6, not 0 - 5
 * Learned: Snake eyes occur about 1 / 6 of the throws of two dice
 */

public class DiceTester {
	
	public static void main(String[] args) {
		
		// initialize scanner
		Scanner input = new Scanner(System.in);
		
		// get number of rolls
		System.out.print("Input number of dice tosses: ");
		int tosses = input.nextInt();
		
		// create Dice
		Dice one = new Dice();
		Dice two = new Dice();
		
		// number of snake eyes
		int snakeEyes = 0;
		
		// loop program until coins are on the same side
		for (int i = 0; i < tosses; i++) {
			
			// increment snake eyes if snake eyes where rolled
			if (snakeEyesRolled(one, two))
				snakeEyes++;
			
			// roll the dice again
			one.roll();
			two.roll();
			
		}
		
		// print number of snake eyes and ratio
		System.out.printf("Number of times the dice landed on snake eyes: "
				+ "%d \nRatio: %.4f", snakeEyes, (double) snakeEyes / tosses);
		
		// close scanner
		input.close();
		
	}
	
	/**
	 * Checks if snake eyes are rolled
	 */
	public static boolean snakeEyesRolled(Dice one, Dice two) {
		return one.getDots() == two.getDots();
	}
	
}

/*
 * Sample Output:
 * 
 * Input number of dice tosses: 5000
 * Number of times the dice landed on snake eyes: 855 
 * Ratio: 0.1710
 * 
 */
