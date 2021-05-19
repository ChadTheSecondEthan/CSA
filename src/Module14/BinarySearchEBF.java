package Module14;

import java.util.*;
import java.io.*;

/*
 * Author: Ethan Fisher
 * Date: 4/3/2021
 * School: Franklin Academy HS
 * Binary Search Program
 * 
 * Description: Find numbers in a file using binary search
 * Difficulties: I would get StackOverflowError's when I didn't add a base case
 * Learned: Recursive algorithms can be fast but can be dangerous
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
			int index = searchArray(nums, 0, nums.length, number);
			
			// print the results, adding 1 to index to make the first index 1 instead of 0
			if (index == -1)
				System.out.println("Your number does not occur in this list");
			else
				System.out.println("Your number occurs at position " + (index + 1));
		}
		
		// close the scanner
		input.close();
	}
	
	static int[] readArray() throws FileNotFoundException {
		
		// open the file in a file reader
		File file = new File("ModuleFourteenLessonSixSort.dat");
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
	
	static int searchArray(int[] array, int lb, int ub, int toSearch) {
		
		// if the lower bound and upper bounds are equal, no values are found
		if (lb >= ub)
			return -1;
		
		// find the midpoint between the bounds
		int mid = (lb + ub) / 2;
		
		// if the value is correct, return it
		if (array[mid] == toSearch)
			return mid;
		
		// if the value is less than the search value, test again with a higher lower bound
		if (toSearch > array[mid])
			return searchArray(array, lb + 1, ub, toSearch);
		
		// otherwise test with a lower upper bound
		return searchArray(array, lb, ub - 1, toSearch);
	}
	
}

/*
 * Sample Output:
 * 

Tests from the assignment:

Enter a number to search for: 110
Your number does not occur in this list
Enter a number to search for: 60
Your number occurs at position 41
Enter a number to search for: 1
Your number occurs at position 2   <-- This is a two since the program searches from the middle and finds the first 1 from the right, not the left
Enter a number to search for: 92
Your number occurs at position 53
Enter a number to search for: 17
Your number does not occur in this list

Extra Tests:

Enter a number to search for: 15
Your number occurs at position 12
Enter a number to search for: 24
Your number does not occur in this list

 */