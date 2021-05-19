package Module12;

/*
 * Author: Ethan Fisher
 * Date: 3/8/2021
 * School: Franklin Academy HS
 * Array Max Min Program
 * 
 * Description: find the min and max of a multi-dimensional array
 * Difficulties: using row, col instead of col, row
 * Learned: to loop through multi-dimensional arrays, you loop through the whole array,
 * 		and then loop through the length of each inner array
 */

public class ArrayMaxMinEBF {

	public static void main(String[] args) {
		int[][] data = { 
				{ 3, 2, 5 }, 
				{ 1, 4, 4, 8, 13 }, 
				{ 9, 1, 0, 2 }, 
				{ 0, 2, 6, 3, -1, -8 } 
		};

		// declare and initialize the max and the min
		int max = data[0][0];
		int min = data[0][0];

		//
		for (int row = 0; row < data.length; row++) {
			
			// max and min for this row
			int rowMax = data[row][0];
			int rowMin = data[row][0];
			
			for (int col = 0; col < data[row].length; col++) {
				
				if (data[row][col] > max)
					max = data[row][col];
				else if (data[row][col] < min)
					min = data[row][col];

				if (data[row][col] > rowMax)
					rowMax = data[row][col];
				else if (data[row][col] < rowMin)
					rowMin = data[row][col];
			}
			
			// write out row max and min
			System.out.println("Row max = " + rowMax + "; Row min = " + rowMin);
		}
		
		// write out the results
		System.out.println("\nmax = " + max + "; min = " + min);

	}
}

/*
 * Sample output:
 
Row max = 5; Row min = 2
Row max = 13; Row min = 1
Row max = 9; Row min = 0
Row max = 6; Row min = -8

max = 13; min = -8
 * 
 */