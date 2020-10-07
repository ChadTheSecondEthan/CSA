package Module7;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 10/4/2020
 * School: Franklin Academy HS
 * Magpie Program
 * 
 * Description: Make a magpie chat bot
 * Difficulties: Figuring out how to add new keywords and to return their responses
 * Learned: trim removes whitespace, indexOf gets a strings position within another string
 */

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */

public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine().toLowerCase();
		
		while (!statement.equals("bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine().toLowerCase();
		}
	}

}

/*
 * Sample Output:
 * 
 * Hello, let's talk.
 * Do you have friends?
 * Of course. You are my friend.
 * Who made you?
 * I was made by Laurie White, and updated by Ethan Fisher
 * Are you real?
 * I am only as real as you say I am.
 * 
 */
