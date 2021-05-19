package Module11;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 3/2/2021
 * School: Franklin Academy HS
 * Bank Account Tester Program
 * 
 * Description: Open bank accounts
 * Difficulties: Finding the largest bank account in the array
 * Learned: You need to remember the entire bank account when 
 * 		finding the highest, not just the max balance
 */

public class BankAccountTesterEBF {
	
	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// create an array of bank accounts
		BankAccount[] accounts = new BankAccount[] {
				new BankAccount("Jake", 100.00), new BankAccount("Mary", 1250.00),
				new BankAccount("Joseph", 500.00), new BankAccount("Madison", 250.00),
				new BankAccount("Jerry", 125.00), new BankAccount("Marianne", 320.00)
		};
		
		// hold input for the answer
		String answer = "";
		while(true) {
			
			// ask for the bank account name
			System.out.print("Please enter the name to whom the account belongs (\"Exit\" to abort): ");
			answer = input.nextLine().toLowerCase();
			
			// break if they put exit
			if (answer.equals("exit"))
				break;
			
			// find the account in the array
			BankAccount account = null;
			for (BankAccount ba : accounts)
				if (ba.getName().toLowerCase().equals(answer)) {
					account = ba;
					break;
				}
			
			// if the account isn't found, tell the user
			if (account == null) {
				System.out.println("Account not found. Try again");
				continue;
			}
			
			// ask for deposit amount
			System.out.print("Please enter the amount of the deposit: ");
			double deposit = input.nextDouble();
			input.nextLine();
			account.deposit(deposit);
		}
		
		// print the largest account
		BankAccount largestAccount = accounts[0];
		for (int i = 1; i < accounts.length; i++)
			if (accounts[i].getBalance() > largestAccount.getBalance())
				largestAccount = accounts[i];
		System.out.println("The amount with the largest balance belongs to " + largestAccount.getName());
		System.out.printf("The balance is $%.2f\n", largestAccount.getBalance());
		
		// close the scanner
		input.close();
	}
	
}

/*
 * Sample Output:

Please enter the name to whom the account belongs ("Exit" to abort): Marianne
Please enter the amount of the deposit: 999
Please enter the name to whom the account belongs ("Exit" to abort): Madison
Please enter the amount of the deposit: 100
Please enter the name to whom the account belongs ("Exit" to abort): exit
The amount with the largest balance belongs to Marianne
The balance is $1319.00

 */