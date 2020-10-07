package EBFScannerTutorial;

import java.util.Scanner;
/*
 * Author: Ethan Fisher
 * Date: 8/24/2020
 * School: Franklin Academy HS
 * Scanner Tutorial Program
 * 
 * Description: Getting input through a scanner
 * Difficulties: Getting errors when calling nextLine()
 * Learned: Scanners allow you to receive user input
 */



public class EBFScannerTutorial {

	public static void main(String[] args) {
		
		// initialize scanner
		Scanner input = new Scanner(System.in);

		// get string from user
		System.out.print("Enter your string here. ");
		String s = input.nextLine();
		System.out.println(s + " is what you have entered");
		
		// get integer from user
		System.out.print("Enter your integer here. ");
		int i = input.nextInt();
		System.out.println(3 * i);

		// get double from user
		System.out.print("Enter your double here. ");
		double d = input.nextDouble();
		System.out.println(d);
		
		// close scanner to prevent memory leaks
		input.close();
		
	}

}

/*
 * Sample Output:
 * Enter your string here. I have made a string
 * I have made a string is what you have entered
 * Enter your integer here. 12
 * 36
 * Enter your double here. 23.4
 * 23.4
 */
