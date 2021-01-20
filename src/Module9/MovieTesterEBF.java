package Module9;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * Author: Ethan Fisher
 * Date: 10/11/2020
 * School: Franklin Academy HS
 * Movie Tester Program
 * 
 * Description: Make movies and print their attributes
 * Difficulties: Getting strings from the file as one word or multiple
 * Learned: Headers in files show how to receive input from it
 */

public class MovieTesterEBF {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// initialize scanner and file
		File file = new File("Movies.txt");
		Scanner input = new Scanner(file);
		
		// the first three lines are the header
		for (int i = 0; i < 3; i++)
			input.nextLine();
		
		// loop while there are movies in the file
		while(input.hasNext()) {
			
//			// read the information from the file
			String title = input.nextLine();
			String genre = input.nextLine();
			double rating = input.nextDouble();
			
			// go to the next line after nextDouble
			input.nextLine();
			
			// create a movie object
			Movie movie = new Movie(title, genre, rating);
			
			// print the specs
			System.out.println(movie.toString() + "\n");
			
		}
		
		// close scanner
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
 * 
 * 
 */
