package Module8;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 10/5/2020
 * School: Franklin Academy HS
 * Banking Program
 * 
 * Description: Create a banking program
 * Difficulties: Choosing return types for the methods
 * Learned: Using 2 scanners allows you to get number input and string input
 * 	and using booleans for the methods allows the program to know if the 
 *  transaction was successful or not
 */

public class BankingEBF {
	
	// give savings and checkings their starting amounts
	public static double savings = 3000;
	public static double checking = 650;

	public static void main(String[] args) {
		
		// initialize scanners
		Scanner stringInput = new Scanner(System.in);
		Scanner numberInput = new Scanner(System.in);
		
		// loop program
		while (true) {
		
			// ask user what they want to do
			System.out.println("What do you wish to do today?\n" + 
					"1 for deposit to savings\n" + 
					"2 for deposit to checking\n" + 
					"3 for withdraw from savings\n" + 
					"4 for withdraw from checking\n" + 
					"5 for transfer funds from savings to checking\n");
			String answer = stringInput.nextLine();
		
			// evaluate answer and tell user their money
			switch(answer) {
			
			case "1":
				
				// deposit savings
				System.out.print("You chose to deposit to Savings. How much would you like to deposit? $");
				depositSavings(numberInput.nextDouble());
				System.out.printf("Your total is Savings is $%.2f\n", savings);
				break;
				
			case "2":
				
				// deposit checking
				System.out.print("You chose to deposit to Checking. How much would you like to deposit? $");
				depositChecking(numberInput.nextDouble());
				System.out.printf("Your total is Checking is $%.2f\n", checking);
				break;
				
			case "3":
				
				// withdraw savings
				System.out.print("You chose to withdraw from Savings. How much would you like to deposit? $");
				if (withdrawalSavings(numberInput.nextDouble()))
					System.out.printf("Your total is Savings is $%.2f\n", savings);
				else
					System.out.println("Unable to transfer funds. Not enough in Savings.");
				break;
				
			case "4":
				
				// withdraw checking
				System.out.print("You chose to withdraw from Checking. How much would you like to deposit? $");
				if (withdrawalChecking(numberInput.nextDouble()))
					System.out.printf("Your total is Checking is $%.2f\n", checking);
				else
					System.out.println("Unable to transfer funds. Not enough in Checking.");
				break;
				
			case "5":
				
				// transfer from savings to checking
				System.out.print("You chose to transfer from Savings to Checking. How much would you like to transfer? $");
				if (transferSavingsToChecking(numberInput.nextDouble()))
					System.out.printf("Your total in Savings is $%.2f, and Checking is $%.2f\n", savings, checking);
				else 
					System.out.println("Unable to transfer funds. Not enough in Savings.");
				break;
				
			default:
				System.out.println("Invalid input. Try again");
				continue;
			}
			
			// ask for another input
			System.out.print("Would you like another transaction? ");
			answer = stringInput.nextLine().toLowerCase();
			
			// if no, break from the loop
			if (answer.equals("n") || answer.equals("no"))
				break;
		
		}
		
		// close scanners
		stringInput.close();
		numberInput.close();
			
	}
	
	// functions for depositing or withdrawing a given
	// amount from checkings or savings
	public static void depositSavings(double amount) {
		savings += amount;
	}
	
	public static void depositChecking(double amount) {
		checking += amount;
	}
	
	// these 3 are booleans to make sure they are allowed
	public static boolean withdrawalSavings(double amount) {
		if (amount > savings)
			return false;
		
		savings -= amount;
		return true;
	}
	
	public static boolean withdrawalChecking(double amount) {
		if (amount > checking)
			return false;
		
		checking -= amount;
		return true;
	}
	
	public static boolean transferSavingsToChecking(double amount) {
		if (withdrawalSavings(amount)) {
			depositChecking(amount);
			return true;
		}
		return false;
	}	
}

/*
 * Sample Output:
 * 
 * What do you wish to do today?
 * 1 for deposit to savings
 * 2 for deposit to checking
 * 3 for withdraw from savings
 * 4 for withdraw from checking
 * 5 for transfer funds from savings to checking
 * 
 * 1
 * You chose to deposit to Savings. How much would you like to deposit? $100
 * Your total is Savings is $3100.00
 * Would you like another transaction? y
 * What do you wish to do today?
 * 1 for deposit to savings
 * 2 for deposit to checking
 * 3 for withdraw from savings
 * 4 for withdraw from checking
 * 5 for transfer funds from savings to checking
 * 
 * 5
 * You chose to transfer from Savings to Checking. How much would you like to transfer? $5000
 * Unable to transfer funds. Not enough in Savings.
 * Would you like another transaction? n
 * 
 */
