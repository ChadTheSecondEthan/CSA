package Module7;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 10/4/2020
 * School: Franklin Academy HS
 * Magpie4 Program
 * 
 * Description: Make a magpie chat bot
 * Difficulties: Checking if different phrases contained multiple of the same word
 * Learned: findKeyword is good for testing multiple cases that include the same word
 * 
 * Triggers:
 * are you alive
 * friend
 * who
 * 	- are you
 * 	- made you
 * 
 * Extra verb:
 * I like
 */

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */

public class MagpieRunner4
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie4 maggie = new Magpie4();
		
		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}

/*
 * Sample Output:
 * 
 * Hello, let's talk.
 * I like programming
 * Why do you like programming?
 * Bye
 * 
 * Hello, let's talk.
 * Are you alive?
 * I am not alive. I am simply a program
 * Do you have friends
 * Well, we are friends, aren't we?
 * Who made you?
 * I was made by Laurie White, and updated by Ethan Fisher.
 *  
 */