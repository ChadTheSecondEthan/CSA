package Module11;

import java.util.*;
import java.io.*;

/*
 * Author: Ethan Fisher
 * Date: 2/23/2021
 * School: Franklin Academy HS
 * Binary Search Program
 * 
 * Description: Find numbers in an array using binary search
 * Difficulties: reading the array took two scanners instead of one
 * Learned: the binary search algorithm is very fast, even with large arrays
 */

public class BinarySearchEBF {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		int[] nums = readArray();
		
		// loop the program
		while(true) {
			
			// get a value to search for
			System.out.print("Enter a number to search for: ");
			int number;
			
			// break if the user inputs something that isn't an int
			try {
				number = input.nextInt();
			} catch (InputMismatchException e) {
				break;
			}
			
			// search for the number in the array
			int index = searchArray(nums, number);
			
			// print the results
			if (index == -1)
				System.out.println("Your number does not occur in this list");
			else
				System.out.println("Your number occurs at position " + index);
		}
		
		// close the scanner
		input.close();
	}
	
	static int[] readArray() throws FileNotFoundException {
		
		// open the file in a file reader
		File file = new File("ModuleElevenLessonFourAssignmentDataFile.dat");
		Scanner fileReader = new Scanner(new FileReader(file));
		
		// use array list to hold the data while it is read
		ArrayList<Integer> data = new ArrayList<>();
		
		// loop through the array
		while(fileReader.hasNextLine()) 
			data.add(fileReader.nextInt());
		
		// return the list as an array
		int[] dataInts = new int[data.size()];
		for (int i = 0; i < data.size(); i++)
			dataInts[i] = data.get(i);
		
		// close the filereader
		fileReader.close();
		
		// return the array
		return dataInts;
	}
	
	// returns the index of the array where toSearch is
	// from the iterative binary search video
	static int searchArray(int[] array, int toSearch) {
		
		// lower and upper bound variables
		int lowerBound = 0;
		int upperBound = array.length - 1;
		
		while (lowerBound <= upperBound) {
			
			// find the midpoint between the bounds
			int mid = (lowerBound + upperBound) / 2;
			
			// return that index if it equals the search value
			if (array[mid] == toSearch)
				return mid;
			
			// otherwise, adjust the bounds
			if (toSearch > array[mid])
				lowerBound = mid + 1;
			else
				upperBound = mid - 1;
			
		}
		
		// return -1 if no values are found
		return -1;
		
	}
	
}

/*
 * Sample Output:

Enter a number to search for: 11
Your number occurs at position 8
Enter a number to search for: 23
Your number occurs at position 14
Enter a number to search for: 15
Your number occurs at position 11
Enter a number to search for: 26
Your number does not occur in this list

 */