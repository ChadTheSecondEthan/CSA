package Module11;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 2/16/2021
 * School: Franklin Academy HS
 * Insertion Sort Program
 * 
 * Description: Sorts an array using insertion sort
 * Difficulties:
 * Learned: 
 */

public class InsertionSortEBF {
	// Sort the list
	//
	
	public static void insertionSort(int[] list) {
		// For each unsorted integer
		for (int j = 1; j < list.length; j++) {

			// Keep swapping with its left neighbor
			// until it is larger or equal to left neighbor
			int k = j;
			while (k > 0 && list[k - 1] > list[k]) {
				int temp = list[k - 1];
				list[k - 1] = list[k];
				list[k] = temp;
				k--;
			}
		}
	}
	
	public static double median(int[] sortedList) {
		
		// find the middle of the array
		// if the size is even, it's the average of the two middles
		
		if (sortedList.length % 2 == 0) {
			int a = sortedList[sortedList.length / 2];
			int b = sortedList[sortedList.length / 2 - 1];
			return (a + b) / 2.0;
		} 
		
		return sortedList[sortedList.length / 2];
	}
	
	public static double average(int[] list) {
		
		// add up each value and divide by the length
		double total = 0;
		for (int i : list)
			total += i;
		
		return total / list.length;
	}

	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Size of array: ");
		
		// create array
		int[] values = new int[input.nextInt()];
		
		// close scanner
		input.close();
		
		// randomize array values from 0 to 999
		// every 10th element will be from 1000 - 9999,
		// which won't effect the median but will raise the average
		for (int i = 0; i < values.length; i++) {
			
			if (i % 10 == 0) 
				values[i] = (int) (Math.random() * 9000) + 1000;
			else
				values[i] = (int) (Math.random() * 1000);
		}

		// print out the array if size is below 11
		if (values.length <= 10) {
			System.out.println("Before: ");
			for (int val : values) {
				System.out.print(val + ", ");
			}
		}
		else 
			System.out.println("Before: Not sorted");
		
		// get time to sort
		long startTime = System.nanoTime();
		
		// sort the array
		insertionSort(values);
		double timeDiff = (System.nanoTime() - startTime) / 1000000000.;
		System.out.printf("\n\nTime to sort unsorted array: %.5f\n", timeDiff);
		
		// find the average and the median
		System.out.println("Average: " + average(values));
		System.out.println("Median: " + median(values));

		// print out the array
		if (values.length <= 10) {
			System.out.println("\nsorted values: ");
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
1325, 196, 283, 635, 858, 204, 88, 131, 945, 912, 

Time to sort unsorted array: 0.00011
Average: 557.7
Median: 459.0

sorted values: 
88, 131, 196, 204, 283, 635, 858, 912, 945, 1325, 

 */