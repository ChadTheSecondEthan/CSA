package Module5;

import java.util.Random;

/*
 * Author: Ethan Fisher
 * Date: 9/1/2020
 * School: Franklin Academy HS
 * Integer Problem Program
 * 
 * Description: Prints random ints and doubles
 * Difficulties: I forgot to add one to the parameter to generate 90-110
 * Learned: Random allows us to generate random ints and doubles
 */



public class EBFIntegerProblem {

	public static void main(String[] args) {
		
		// only using loops of five so the sample output isn't too large
		
		Random random = new Random();
		
		// generates random numbers from 0-19
		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(20));
		}
		
		System.out.println("\n\n");

		// generates random numbers from 90 - 110 inclusive
		for (int i = 0; i < 5; i++) {
			System.out.println(90 + random.nextInt(21));
		}
		
		System.out.println("\n\n");

		// generates random numbers from 34.7838 (inclusive) - 187.056 (exclusive)
		for (int i = 0; i < 5; i++) {
			System.out.println(34.7838 + (random.nextDouble() * 152.2722));
		}
		
	}
	
}

/*
 * Sample Output:
 * 
 * 16
 * 4
 * 18
 * 3
 * 6
 * 
 * 
 * 109
 * 102
 * 100
 * 90
 * 100
 * 
 * 
 * 66.61240923091609
 * 64.83992832045341
 * 37.140332649458834
 * 164.59664024280409
 * 53.671263351581935
 * 
 */
