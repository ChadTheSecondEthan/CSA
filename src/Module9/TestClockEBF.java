package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/10/2020
 * School: Franklin Academy HS
 * Library Program
 * 
 * Description: Create Clock objects
 * Difficulties: Printing hours, minutes, and seconds with leading 0's if they're less than 10
 * Learned: Clocks can be represented in their entirety using only three numbers
 */

public class TestClockEBF {
	
	public static void main(String[] args) {
		
		// create clock
		Clock clock = new Clock();
		System.out.println(clock);
		
		// manually set its time
		clock.setTime(12, 6, 23);
		System.out.println(clock);
		
		// daylight savings
		clock.convertDaylightSaving(-1);
		System.out.println(clock);
		
	}
	
}

/*
 * Sample Output:
 * 
 * The time is 00:00:00 
 * The total number of seconds is: 0
 * The time is 12:06:23 
 * The total number of seconds is: 43583
 * The time is 11:06:23 
 * The total number of seconds is: 39983
 * 
 */
