/*
 * Author: Ethan Fisher
 * Date: 8/17/2020
 * School: Franklin Academy HS
 * String Program
 * 
 * Description: Prints strings
 * Difficulties: I inputted wrong number to the substring method
 * Learned: Strings have functions that let you access parts of them
 */

public class EthanFisherMod2StringProgram {

	public static void main(String[] args) {
		
		// strings to print
		String mm = "Hello";
		String nx = "good buddy";
		String c = mm + " " + nx;
		
		// print the length
		System.out.println(c.length());
		
		// my dog's name
		String myPet = "Sparky the dog";
		
		// take a substring and print that
		String smallPart = myPet.substring(4, 12);
		System.out.println(smallPart);
	}

}

/*
 * Sample Output:
 * 
 * 16
 * ky the d
 */