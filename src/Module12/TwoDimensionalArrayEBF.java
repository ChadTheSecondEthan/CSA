package Module12;

import java.util.Arrays;

/*
 * Author: Ethan Fisher
 * Date: 3/8/2021
 * School: Franklin Academy HS
 * 2 Dimension Array Example Program
 * 
 * Description: Make two dimensional arrays
 */

public class TwoDimensionalArrayEBF {
	
	public static void main(String[] args) {
		
		// initialize the array by element
		int[][] array = new int[3][2];
		array[0][0] = 22;
		array[0][1] = 23;
		array[1][0] = 24;
		array[1][1] = 25;
		array[2][0] = 26;
		array[2][1] = 27;
	    
	    // sort the first array
	    Arrays.sort(array[0]);
		
	    // fill the array with a value
	    Arrays.fill(array[1], 8);
	    
		// initialize the array all at once
		int[][] array2 = {
				{ 22, 23 },
				{ 24, 25 },
				{ 26, 27 }
		};
		
		// arrays with arrays in them of different length
		int[][] array3 = new int[3][];
	    array3[0] = new int[3];
	    array3[1] = new int[2];
	    array3[2] = new int[4];
		
		// print the length of the array and the length of the first element in the array
		System.out.println(array.length);
		System.out.println(array[0].length);
	}
	
}

/*
 * Sample Output:
 * 
 * 3
 * 2
 */