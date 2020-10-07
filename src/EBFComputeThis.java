/*
 * Author: Ethan Fisher
 * Date: 8/24/2020
 * School: Franklin Academy HS
 * Compute This Program
 * 
 * Description: Compute tons of stuff
 * Difficulties: Finding how to take powers and absolute values, etc.
 * Learned: the Math class can do a lot of things very easily
 */



public class EBFComputeThis {

	public static void main(String[] args) {
		
		// declare and initialize variables
		int x = 3;
		int y = -5;
		int z = 0;
		double w = 17.5;
		
		// Display initial values
		System.out.println("w = " + w +
				", x = " + x + ", y = " + y + ", z = " + z);
		
		// assign absolute value of y to z and print
		z = Math.abs(y);
		System.out.println("z is the absolute value of y and is " + z);
		
		// display the square root of w, rounding to 3 decimals so it looks better
		System.out.printf("The square root of w is %.3f\n", Math.sqrt(w));
		
		// display x ^ z
		System.out.println("x raised to the power of z is " + Math.pow(x, z));
		
		// max of x and y
		System.out.println(Math.max(x, y) + " is the max of x and y");
		
		// min of x and y
		System.out.println(Math.min(x, y) + " is the min of x and y");
		
		// round w
		System.out.println("If you round w you get " + Math.round(w));
		
		// floor value of w
		System.out.println("The floor value of w is "+ Math.floor(w));
		
		// ceiling value of w
		System.out.println("The ceiling value of w is "+ Math.ceil(w));
		
		// random number between one and ten, rounding to 3 decimals so it looks better
		System.out.printf("A random number between one and ten is %.3f\n", (Math.random() * 9) + 1);
		
	}

}

/*
 * Sample Output:w = 17.5, x = 3, y = -5, z = 0
 * z is the absolute value of y and is 5
 * The square root of w is 4.183
 * x raised to the power of z is 243.0
 * 3 is the max of x and y
 * -5 is the min of x and y
 * If you round w you get 18
 * The floor value of w is 17.0
 * The ceiling value of w is 18.0
 * A random number between one and ten is 4.177
 */
