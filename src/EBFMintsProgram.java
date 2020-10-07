/*
 * Author: Ethan Fisher
 * Date: 8/24/2020
 * School: Franklin Academy HS
 * Mints Program
 * 
 * Description: Calculating leftover mints
 * Difficulties: I divided by an integer when I should have used modulus
 * Learned: How to calculate numbers with division and modulus
 */



public class EBFMintsProgram {

	public static void main(String[] args) {
		
		// declare and assign variables
		int totalMints;
		int numberOfBags;
		int mintsLeftOver;
		
		totalMints = 500;
		
		// calculate servings and mints left over
		numberOfBags = totalMints / 3;
		mintsLeftOver = totalMints % 3;
		
		System.out.println("Total Mints = " + totalMints + "\n" +
				"Number of Bags = " + numberOfBags + "\n" +
				"Mints Leftover = " + mintsLeftOver);
		
	}

}

/*
 * Sample Output:
 * 
 * Total Mints = 500
 * Number of Bags = 166
 * Mints Leftover = 2
 */
