/*
 * Author: Ethan Fisher
 * Date: 8/17/2020
 * School: Franklin Academy HS
 * My Name Program
 * 
 * Description: Prints my name, its length, and a substring of it
 * Difficulties: Spacing wouldn't work sometimes
 * Learned: I can take substrings without assigning them variables
 */

public class EthanFisherMod2MyName {

	public static void main(String[] args) {
		String firstName = "Ethan";
		String lastName = "Fisher";
		
		System.out.println("My name is " + firstName + " " + lastName + "\n" +
				"My first name is " + firstName.length() + " letters long" + "\n" +
				"A substring of my first name is " + firstName.substring(1, 4));
	}

}

/*
 * Sample Output:
 * 
 * My name is Ethan Fisher
 * My first name is 5 letters long
 * A substring of my first name is tha
 */