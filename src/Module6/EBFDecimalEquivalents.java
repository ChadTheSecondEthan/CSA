package Module6;

/*
 * Author: Ethan Fisher
 * Date: 9/16/2020
 * School: Franklin Academy HS
 * Decimal Equivalents Program
 * 
 * Description: prints decimals and their equivalents
 * Difficulties: looped the numerator first instead of the denominator
 * Learned: Use <= when you want to include going over that number
 * in a loop (denom <= 14 stops after it goes through denom = 14)
 */

public class EBFDecimalEquivalents {

	public static void main(String[] args) {
		
		// loop through denominators 2 - 14
		for (int denom = 2; denom <= 14; denom++) {
			
			int numerator = 1;
			
			// loop through all numerators less than denom
			// using a do while since it said so
			do {
				
				// print numerator over denominator
				System.out.print(numerator + " / " + denom + "\t");
				
				// add the decimal equivalent after
				System.out.printf("%.5f\n", (double) numerator / denom);
				
				// increment numerator
				numerator++;
				
			} while(numerator < denom);
		}
			
	}
}

/*
 * Sample Output:
 * 
 * ...
 * 
 * 5 / 10	0.50000
 * 6 / 10	0.60000
 * 7 / 10	0.70000
 * 8 / 10	0.80000
 * 9 / 10	0.90000
 * 1 / 11	0.09091
 * 2 / 11	0.18182
 * 3 / 11	0.27273
 * 4 / 11	0.36364
 * 5 / 11	0.45455
 * 6 / 11	0.54545
 * 7 / 11	0.63636
 * 8 / 11	0.72727
 * 9 / 11	0.81818
 * 10 / 11	0.90909
 * 1 / 12	0.08333
 * 2 / 12	0.16667
 * 3 / 12	0.25000
 * 4 / 12	0.33333
 * 5 / 12	0.41667
 * 6 / 12	0.50000
 * 7 / 12	0.58333
 * 
 * ...
 * 
 */
