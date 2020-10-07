package Module5;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 8/31/2020
 * School: Franklin Academy HS
 * Linear Equations Program
 * 
 * Description: Calculate linear equations
 * Difficulties: I forgot to give my strings default values, so they would throw errors
 * Learned: I needed to use if statements to make sure there was a + or - before and and b
 */



public class EBFLinearEquations {

	public static void main(String[] args) {
		
		// declare a and b
		double a, b, x;
		
		// initialize Scanner
		Scanner input = new Scanner(System.in);
		
		// get user input
		System.out.print("Enter A: ");
		a = input.nextDouble();
		System.out.print("Enter B: ");
		b = input.nextDouble();
		
		x = -b / a;
		
		// declare strings for a and b
		String aString, bString, xString;
		
		// always show x, even if it's 0x
		aString = a + "x";
		
		if (b > 0) {
			bString = " + " + b;
		} else if (b < 0) {
			bString = " - " + Math.abs(b);
		} else {
			bString = "";
		}
		
		// make sure x is a number and not infinite, otherwise make it "infinite solutions"
		if (Double.isNaN(x)) {
			xString = "Infinite Solutions";
		} else if (Double.isInfinite(x)) {
			xString = "No Solution";
		} else {
			xString = "" + x;
		}
		
		System.out.printf("%s%s = 0 --> x = %s", aString, bString, xString);
		
		// close Scanner
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * Enter A: -20
 * Enter B: 1
 * -20.0x + 1.0 = 0 --> x = 0.050
 * 
 * Enter A: 0
 * Enter B: 1234
 * 0.0x + 1234.0 = 0 --> x = No Solution
 * 
 * Enter A: 0
 * Enter B: 0
 * 0.0x = 0 --> x = Infinite Solutions
 * 
 */
