package Module6;

/*
 * Author: Ethan Fisher
 * Date: 9/14/2020
 * School: Franklin Academy HS
 * While Loop Example Program
 * 
 * Description: Example of a while loop in java
 * Difficulties: Accidentally put a semicolon before he said not to
 * Learned: while loops can be used the same as for loops,
 * where they run until a condition is no longer met
 */



public class EBFWhileLoop {

	public static void main(String[] args) {
		
		int sum = 0;
		int j = 3;
		while(j <= 79) {
			sum += j;
			j++;
		}
		System.out.println(sum);
		
	}
	
}

/*
 * Sample Output:
 * 
 * 3157
 * 
 */
