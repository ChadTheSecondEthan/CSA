package Module14;

/*
 * Author: Ethan Fisher
 * Date: 3/31/2021
 * School: Franklin Academy HS
 * Rabbit Tester Program
 * 
 * Description: Prints the amount of rabbits after n days
 * Difficulties: making sure to keep months above 0 in the for loop
 * Learned: The rabbits population basically follows the fibonacci sequence
 */

public class RabbitTesterEBF {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 12; i++)
			System.out.println("At the end of month " + (i + 1) + ": " + numRabbits(i + 1));
	}
	
	private static int numRabbits(int months) {
		if (months == 1 || months == 2) return 1;
		return numRabbits(months - 1) + numRabbits(months - 2);
	}

}

/**
 * Sample Output:

At the end of month 1: 1
At the end of month 2: 1
At the end of month 3: 2
At the end of month 4: 3
At the end of month 5: 5
At the end of month 6: 8
At the end of month 7: 13
At the end of month 8: 21
At the end of month 9: 34
At the end of month 10: 55
At the end of month 11: 89
At the end of month 12: 144

*/
