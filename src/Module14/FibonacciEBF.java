package Module14;

/*
 * Author: Ethan Fisher
 * Date: 3/31/2021
 * School: Franklin Academy HS
 * Fibonacci Program
 * 
 * Description: Prints the amount fibonacci numbers
 * Difficulties: Stopping stack overflow errors by adding a base case
 * Learned: Recursive programs require a base case to prevent a stack overflow
 */

public class FibonacciEBF {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 12; i++)
			System.out.println("Fibonacci #" + (i + 1) + ": " + fib(i + 1));
	}
	
	private static int fib(int n) {
		if (n == 1 || n == 2) 
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

}

/**
 * Sample Output:
 * 
Fibonacci #1: 1
Fibonacci #2: 1
Fibonacci #3: 2
Fibonacci #4: 3
Fibonacci #5: 5
Fibonacci #6: 8
Fibonacci #7: 13
Fibonacci #8: 21
Fibonacci #9: 34
Fibonacci #10: 55
Fibonacci #11: 89
Fibonacci #12: 144

*/
