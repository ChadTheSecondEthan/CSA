package Module10;

/*
 * Author: Ethan Fisher
 * Date: 2/8/2021
 * School: Franklin Academy HS
 * Fly Tester Program
 * 
 * Description: Creates flies and simulate them dying when they are too close to another fly
 * Difficulties: The program would run infinitely because the flies would spread far apart, so
 * 		I limited their movement to -20 to 20
 * Learned: Simulating an environment takes lots of iterations
 */

public class FlyTesterEBF {
	
	public static void main(String[] args) {
		
		// create an array of flies
		Fly[] flies = new Fly[10];
		for (int i = 0; i < flies.length; i++)
			flies[i] = new Fly();
		
		// get the start time and create a variable for iterations
		long startTime = System.nanoTime();
		int iterations = 0;
		
		while(true) {
			
			// break if only one fly is left
			int fliesAlive = 0;
			for (Fly fly : flies)
				if (fly.isAlive()) 
					fliesAlive++;
				
			if (fliesAlive == 1)
				break;
			
			// move each fly
			for (int i = 0; i < flies.length; i++) {
				if (flies[i].isAlive()) {
					flies[i].move();
					flies[i].checkDistance(flies);
				}
			}
			
			// increase the number of iterations
			iterations++;
		}
		
		// find the last fly
		Fly livingFly = null;
		for (Fly fly : flies) {
			if (fly.isAlive()) {
				livingFly = fly;
				break;
			}
		}
		
		// print the final results
		System.out.println("The last fly is located at " + livingFly.getLocationAsString());
		System.out.println("Iterations: " + iterations);
		
		double dt = (System.nanoTime() - startTime) / 1000000000.0;
		System.out.println("Time to simulate: " + dt + " seconds");
		
	}
	
}

/*
 * Sample Output:

(I didn't print anything each iteration because it was contistently around 50000 iterations)
 
A fly has died
A fly has died
A fly has died
A fly has died
A fly has died
A fly has died
A fly has died
A fly has died
A fly has died
The last fly is located at X: -2.85, Y: 4.07, Z: 12.16
Iterations: 14751
Time to simulate: 0.173974799 seconds

 */