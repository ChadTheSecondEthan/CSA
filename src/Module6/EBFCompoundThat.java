package Module6;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 9/14/2020
 * School: Franklin Academy HS
 * Compound That Program
 * 
 * Description: Calculate time for money to double with given interest rate
 * Difficulties: Calculating with a decimal divided by 100 was too small,
 * 		so I used a BigDouble for those calculations
 * Learned: for loops can have multiple variables in initialization
 */

public class EBFCompoundThat {

	public static void main(String[] args) {
		
		// initialize variables for start balance, interest, period of time
		double startingBalance, curBalance;
		double interest, tempInterest;
		int time = 0;
		
		// big decimal used when interest is incredibly small
		BigDecimal bg;
		
		// initialize scanner
		Scanner input = new Scanner(System.in);
		
		// get input from user
		System.out.print("Enter account balance: $");
		startingBalance = input.nextDouble();
		curBalance = startingBalance;
		System.out.print("Enter interest rate (as a decimal): ");
		interest = input.nextDouble();
		
		// print "years  to double" and "ending balance"
		System.out.println("\n\t\t\tYears to Double  Ending Balanace");
		
		// calculate yearly
		for (time = 0, curBalance = startingBalance; curBalance / 2 < startingBalance; time++)
			curBalance += interest * curBalance;
		
		// print results
		System.out.printf("Enter Period: 1  \t      %d \t     $%.2f\n", time, curBalance);
		
		// calculate montly
		tempInterest = interest / 12;
		for (time = 0, curBalance = startingBalance; curBalance / 2 < startingBalance; time++)
			curBalance += tempInterest * curBalance;
		
		// print results
		System.out.printf("Enter Period: 12 \t      %d \t     $%.2f\n", time / 12, curBalance);
		
		// calculate daily
		bg = BigDecimal.valueOf(interest / 365);
		for (time = 0, curBalance = startingBalance; curBalance / 2 < startingBalance; time++)
			curBalance += bg.doubleValue() * curBalance;
		
		// print results
		System.out.printf("Enter Period: 365\t      %d \t     $%.2f\n", time / 365, curBalance);
		
		// close scanner so no memory leaks
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * Enter account balance: $1575
 * Enter interest rate (as a decimal): 0.035
 * 
 * 					Years to Double  Ending Balanace
 * Enter Period: 1  	      21 	     $3243.60
 * Enter Period: 12 	      19 	     $3150.03
 * Enter Period: 365	      19 	     $3150.04
 * 
 */
