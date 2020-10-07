package Module5;

import java.util.Scanner;
/*
 * Author: Ethan Fisher
 * Date: 9/3/2020
 * School: Franklin Academy HS
 * Quantity Ordering Program
 * 
 * Description: Buying songs
 * Difficulties: Checking price based on quantity
 * Learned: How to discount songs based on quantity
 */



public class EBFQuantityOrdering {

	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// variables for quantity and price
		int quantity;
		double price;
		
		// get quantity from user
		System.out.print("Enter quantity: ");
		quantity = input.nextInt();
		
		// calculate price
		if (quantity <= 0) {
			System.out.println("Very funny. Please enter a positive integer");
			price = 0;
		} else if (quantity <= 19) {
			price = 1.29;
		} else if (quantity <= 39) {
			price = 1.19;
		} else if (quantity <= 59) {
			price = 1.09;
		} else {
			price = 0.99;
		}
		
		// print price and total cost
		System.out.printf("Price = $%.2f\nAmount due = $%.2f\n", price, price * quantity);
		
		// close scanner so no memory leaks
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * Enter quantity: 15
 * Price = $1.29
 * Amount due = $19.35
 * 
 * Enter quantity: 55
 * Price = $1.09
 * Amount due = $59.95

 * 
 */
