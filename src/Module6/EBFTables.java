package Module6;

/*
 * Author: Ethan Fisher
 * Date: 9/15/2020
 * School: Franklin Academy HS
 * Tables Program
 * 
 * Description: makes multiplication tables
 * Difficulties: forgot to use a different variable for the inner loop
 * Learned: the inner loop will loop faster than the outer loop
 */

public class EBFTables {

	public static void main(String[] args) {
		
		// print 12 tables, starting at one and ending 
		// at 13 so i dont have to add to i when multiplying
		for (int i = 1; i < 13; i++) {
			
			// each table prints 12 columns
			for (int j = 1; j < 13; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			
			// new line after the tables
			System.out.println();
			
		}
	}
}

/*
 * Sample Output:
 * 
 * ...
 * 
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9
 * 3 * 4 = 12
 * 3 * 5 = 15
 * 3 * 6 = 18
 * 3 * 7 = 21
 * 3 * 8 = 24
 * 3 * 9 = 27
 * 3 * 10 = 30
 * 3 * 11 = 33
 * 3 * 12 = 36
 * 
 * 4 * 1 = 4
 * 4 * 2 = 8
 * 4 * 3 = 12
 * 4 * 4 = 16
 * 4 * 5 = 20
 * 4 * 6 = 24
 * 4 * 7 = 28
 * 4 * 8 = 32
 * 4 * 9 = 36
 * 4 * 10 = 40
 * 4 * 11 = 44
 * 4 * 12 = 48
 * 
 * ...
 * 
 */
