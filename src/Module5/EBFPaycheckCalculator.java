package Module5;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 8/31/2020
 * School: Franklin Academy HS
 * Paycheck Calculator Program
 * 
 * Description: Calculate $$$
 * Difficulties: overtime hours would be negative sometimes because
 * I accidentally put hours < 40
 * Learned: You need to check if regularHours is more than 40
 * to have overtimeHours be greater than 0
 */



public class EBFPaycheckCalculator {

	public static void main(String[] args) {
		
		// declare some variables
		int hours, regularHours, overtimeHours;
		double regularWage, overtimeWage;
		double regularPay, overtimePay, grossPay;
		
		// initialize Scanner
		Scanner input = new Scanner(System.in);
		
		// get input
		System.out.print("Input hours worked this week: ");
		hours = input.nextInt();
		System.out.print("Input standard hourly rate of pay: ");
		regularWage = input.nextDouble();
		overtimeWage = regularWage * 1.5;
		
		// calculate hours
		if (hours > 40) {
			regularHours = 40;
			overtimeHours = hours - 40;
		} else {
			regularHours = hours;
			overtimeHours = 0;
		}
		
		// calculate pay
		regularPay = regularHours * regularWage;
		overtimePay = overtimeHours * overtimeWage;
		grossPay = regularPay + overtimePay;
		
		// print everything out
		System.out.printf("\n"
				+ "Regular hours = %d \n"
				+ "Overtime hours = %d \n"
				+ "Total hours = %d \n\n"
				+ "Regular Pay = %.2f \n"
				+ "Overtime Pay = %.2f \n"
				+ "Gross Pay = %.2f \n",
				regularHours, overtimeHours, hours, 
				regularPay, overtimePay, grossPay);
		
		// close Scanner
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * Input hours worked this week: 32
 * Input standard hourly rate of pay: 10
 * 
 * Regular hours = 32 
 * Overtime hours = 0 
 * Total hours = 32 
 * 
 * Regular Pay = 320.00 
 * Overtime Pay = 0.00 
 * Gross Pay = 320.00 
 * 
 * --------------------------------------
 * 
 * Input hours worked this week: 50
 * Input standard hourly rate of pay: 26.01
 * 
 * Regular hours = 40 
 * Overtime hours = 10 
 * Total hours = 50 
 * 
 * Regular Pay = 1040.40 
 * Overtime Pay = 390.15 
 * Gross Pay = 1430.55 
 * 
 */
