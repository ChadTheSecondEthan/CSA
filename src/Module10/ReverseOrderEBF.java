package Module10;

/*
 * Author: Ethan Fisher
 * Date: 10/12/2020
 * School: Franklin Academy HS
 * Reverse Order Program
 * 
 * Description: Reverse the order of an array
 * Difficulties: I forgot to use the temp, so the array elements weren't replaced
 * Learned: It is required to use a temp variable when swapping values so one isn't lost
 */

public class ReverseOrderEBF {
	
	public static void main(String[] args) {
		
		int[] val = { 0, 1, 2, 3, 4, 5, 6 };
		int temp;
		
		// print the array
		printArray(val);
		
		// reverse the order of the array
		for (int i = 0; i < val.length / 2; i++) {
			temp = val[val.length - 1 - i];
			val[val.length - 1 - i] = val[i];
			val[i] = temp;
		}
		
		// print the reversed array
		printArray(val);
		
	}
	
	// prints an integer array
	static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();
	}
	
}

/*
 * Sample Output:

0 1 2 3 4 5 6 
6 5 4 3 2 1 0 

 */
