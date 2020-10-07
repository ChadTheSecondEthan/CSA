/*
 * Author: Ethan Fisher
 * Date: 8/24/2020
 * School: Franklin Academy HS
 * Resistance Pool Program
 * 
 * Description: Calculate the area of a pool with an island inside it
 * Difficulties: I couldn't format a double to 2 decimal spots
 * Learned: Doubles can go to a lot more decimal spots than floats
 */



public class EBFResistancePool {

	public static void main(String[] args) {
		
		// constant variable pi
		final double PI = 3.1415;
		
		// declare and assign variables
		double diameterPool = 8.32;
		double radiiPool = diameterPool / 2;
		double areaPool;
		
		double diameterIsland = 1.91;
		double radiiIsland = diameterIsland / 2;
		double areaIsland;
		
		double tileArea;
		
		// calculate areas of pool and island
		areaPool = radiiPool * radiiPool * PI;
		areaIsland = radiiIsland * radiiIsland * PI;
		
		tileArea = areaPool - areaIsland;
		
		// print output, formatting double to 2 decimal spots
		System.out.printf("A resistance pool with a diameter of \n"
				+ "8.32 meters that contains a circular island of \n"
				+ "1.91 meters has %.2f square meters \n"
				+ "that needs tile. ", tileArea);
		
	}

}

/*
 * Sample Output:
 * A resistance pool with a diameter of 
 * 8.32 meters that contains a circular island of 
 * 1.91 meters has 51.50 square meters 
 * that needs tile.
 */
