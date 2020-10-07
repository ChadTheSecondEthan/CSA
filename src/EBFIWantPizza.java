import java.util.Scanner;
/*
 * Author: Ethan Fisher
 * Date: 8/24/2020
 * School: Franklin Academy HS
 * I Want Pizza Program
 * 
 * Description: Getting a 3 topping pizza order
 * Difficulties: I used next() instead of nextLine(), so I only got one word
 * Learned: You can record user input to make a pizza!
 */



public class EBFIWantPizza {

	public static void main(String[] args) {
		
		// initialize a scanner
		Scanner input = new Scanner(System.in);
		
		// ask for type of crust
		System.out.print("Enter the type of crust (thin, stuffed, deep dish, New York Style): ");
		String crust = input.nextLine();
		
		// ask 3 times for toppings
		System.out.print("Enter topping 1: ");
		String topping1 = input.nextLine();

		System.out.print("Enter topping 2: ");
		String topping2 = input.nextLine();

		System.out.print("Enter topping 3: ");
		String topping3 = input.nextLine();
		
		// give them their pizza
		System.out.println("You have ordered a " + crust + " pizza with " + 
				topping1 + ", " + topping2 + ", and " + topping3 + ". Enjoy!");
		
		// close scanner so no memory leaks
		input.close();
		
	}

}

/*
 * Sample Output:
 * Enter the type of crust (thin, stuffed, deep dish, New York Style): Deep Dish
 * Enter topping 1: Pepperoni
 * Enter topping 2: Buffalo Sauce
 * Enter topping 3: Bacon
 * You have ordered a Deep Dish pizza with Pepperoni, Buffalo Sauce, and Bacon. Enjoy!
 */
