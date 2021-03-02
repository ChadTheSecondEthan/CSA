package Module10;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 2/2/21
 * School: Franklin Academy HS
 * Space Weight Program
 * 
 * Description: Print weight of a person on different planets
 * Difficulties: I didn't subtract 1 from the user's input, so it would output the next planet
 * Learned: Using multiple arrays for the planets and ratios allows you to access both with one index
 * 		in loops
 */

public class SpaceWeightEBF {
	
	public static void main(String[] args) {
		
		// create arrays for the planets and their gravity ratios
		String[] planets = {
				"Mercury", "Venus", "Mars", "Jupiter", 
				"Saturn", "Neptune", "Uranus", "Pluto"
		};
		double[] ratios = {
				0.38, 0.91, 0.38, 2.36, 
				0.91, 1.12, 0.89, 0.06
		};
		
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// print header
		System.out.println("Convert your weight on Earth to:");
		
		// print each of the planets
		for (int i = 0; i < planets.length; i++) 
			System.out.printf("\t%d.\t%s\n", i + 1, planets[i]);
		System.out.printf("\t%d.\tQuit\n", planets.length + 1);
		
		// get planet of choice
		System.out.printf("Select a destination by number (or %d to quit): ", planets.length + 1);
		int planetIndex = input.nextInt() - 1;
		
		if (planetIndex == planets.length) {
			input.close();
			return;
		}
		
		input.nextLine();
		
		// get weight
		System.out.print("Enter your weight: ");
		int weight = input.nextInt();

		System.out.printf("Your weight on %s would be %.1f pounds", planets[planetIndex], weight * ratios[planetIndex]);
		
		// close scanner
		input.close();
	}
	
}

/*
 * Sample Output:

Convert your weight on Earth to:
	1.	Mercury
	2.	Venus
	3.	Mars
	4.	Jupiter
	5.	Saturn
	6.	Neptune
	7.	Uranus
	8.	Pluto
	9.	Quit
Select a destination by number (or 9 to quit): 5
Enter your weight: 140
Your weight on Saturn would be 127.4 pounds

Convert your weight on Earth to:
	1.	Mercury
	2.	Venus
	3.	Mars
	4.	Jupiter
	5.	Saturn
	6.	Neptune
	7.	Uranus
	8.	Pluto
	9.	Quit
Select a destination by number (or 9 to quit): 8
Enter your weight: 160
Your weight on Pluto would be 9.6 pounds

 */
