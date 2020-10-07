package Module4;

import java.util.Scanner;
import java.time.LocalDate;
/*
 * Author: Ethan Fisher
 * Date: 8/31/2020
 * School: Franklin Academy HS
 * Turn on the Lights Program
 * 
 * Description: Calculate electric bill, rounded to 2 decimal spaces
 * Difficulties: Adding to a date along with formatting it
 * Learned: Some classes already have code made for you,
 * so you don't have to do all of it
 */



public class EBFTurnOnLights {

	public static void main(String[] args) {
		
		// some variables for the electric cost
		final double COST = 0.0425; // in cents
		final double SURCHARGE = 0.1; // percent
		final double UTILITY_TAX = 0.03; // percent
		final double LATE_PAYMENT = 0.04; // percent
		
		// late date snippet from https://beginnersbook.com/2017/10/java-add-days-to-date/
		final LocalDate lateDate = LocalDate.now().plusDays(30);
		
		// initialize a scanner
		Scanner input = new Scanner(System.in);
		
		// ask for KWH used
		System.out.print("Enter KWH used: ");
		int answer = input.nextInt();
		
		// variables for the cost
		double baseCharge = answer * COST;
		double surcharge = baseCharge * SURCHARGE;
		double tax = baseCharge * UTILITY_TAX;
		double total = baseCharge + surcharge + tax;
		double lateTotal = total * (1 + LATE_PAYMENT);
		
		/*
		 * I think the math on the Google Doc is wrong. When
		 * I input 997 KWH, I get a different answer that
		 * checks out when I use a calculator
		 */
		
		// begin printing
		System.out.printf(
				"\t\tAPCS Electric\n"
				+ "-------------------------------------------------------\n"
				+ "Kilowatts Used \t %d @ $ %.2f \n"
				+ "-------------------------------------------------------\n"
				+ "Base Charge    \t\t\t $ %.2f \n"
				+ "Surcharge      \t\t\t $ %.2f \n"
				+ "Citytax        \t\t\t $ %.2f \n"
				+ "               \t\t\t   -----\n"
				+ "Pay this amount\t\t\t $ %.2f \n"
				+ "After %s Pay \t\t $ %.2f \n",
				answer, COST, baseCharge, surcharge, tax, total, lateDate, lateTotal);
		
		// close scanner so no memory leaks
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * Enter KWH used: 837
 * 					APCS Electric
 * -------------------------------------------------------
 * Kilowatts Used 	 837 @ $ 0.04 
 * -------------------------------------------------------
 * Base Charge    			 $ 35.57 
 * Surcharge      			 $ 3.56 
 * Citytax        			 $ 1.07 
 *                			   -----
 * Pay this amount			 $ 40.20 
 * After 2020-09-30 Pay 		 $ 41.80 
 */
