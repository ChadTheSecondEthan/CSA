package Module11;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 2/16/2021
 * School: Franklin Academy HS
 * Selection Sort Program
 * 
 * Description: Sorts an array using selection sort
 * Difficulties: Finding duplicates would always returning too many because it counted numbers multiple times
 * Learned: It takes a long time to sort arrays as the size get bigger
 */

public class SelectionSortEBF {

	// Sort the Array

	public static void selectionSort(int[] array) {
		
		// Find the integer that should go in each cell of
		// the array, from cell 0 to the end
		for (int j = 0; j < array.length - 1; j++) {
			// Find min: the index of the integer that should go into cell j.
			// Look through the unsorted integers (those at j or higher)
			int min = j;
			for (int k = j + 1; k < array.length; k++) {
				if (array[k] < array[min]) {
					min = k;
				}
			}
			// Swap the int at j with the int at min
			int temp = array[min];
			array[min] = array[j];
			array[j] = temp;
		}
	}
	
	public static int numDuplicates(int[] array) {
		
		// variable for number of duplicates
		int duplicates = 0;
		
		// the array will be sorted, so all duplicates are
		// directly next to each other
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] == array[j]) {
					duplicates++;
					
					// skip over the other duplicates of the same number
					while(j < array.length && array[i] == array[j]) {
						i++;
						j++;
					}
				}
		}
		
		return duplicates;
		
	}

	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Size of array: ");
		
		// create array
		int[] values = new int[input.nextInt()];
		
		// close scanner
		input.close();
		
		// randomize array values from 0 to 5
		for (int i = 0; i < values.length; i++) 
			values[i] = (int) (Math.random() * 5);

		// print out the array if size is below 11
		if (values.length <= 10) {
			System.out.println("Before: ");
			for (int val : values) {
				System.out.print(val + ", ");
			}
		}
		else System.out.println("Before: Not sorted");
		
		// get time to sort
		long startTime = System.nanoTime();
		
		// sort the array
		selectionSort(values);
		double timeDiff = (System.nanoTime() - startTime) / 1000000000.;
		System.out.printf("\n\nTime to sort unsorted array: %.5f\n", timeDiff);

		// get time to sort
		startTime = System.nanoTime();
		
		// sort the sorted array (it takes less time because it never needs to swap any values)
		selectionSort(values);
		timeDiff = (System.nanoTime() - startTime) / 1000000000.;
		System.out.printf("Time to sort sorted array: %.5f\n", timeDiff);
		
		// print the number of duplicates
		System.out.println("Number of duplicates: " + numDuplicates(values));

		// print out the array
		if (values.length <= 10) {
			System.out.println("\n\nsorted values: ");
			for (int val : values) {
				System.out.print(val + ", ");
			}
		}
		else
			System.out.print("\n\nAfter: Sorted");

	}

}

/*
 * Sample Output:

Size of array: 10
Before: 
1, 1, 1, 4, 1, 2, 0, 1, 0, 2, 

Time to sort unsorted array: 0.00003
Time to sort sorted array: 0.00001
Number of duplicates: 3


sorted values: 
0, 0, 1, 1, 1, 1, 1, 2, 2, 4, 

 */
