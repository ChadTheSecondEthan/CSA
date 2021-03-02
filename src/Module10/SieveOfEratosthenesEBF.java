package Module10;

/*
 * Author: Ethan Fisher
 * Date: 1/29/2021
 * School: Franklin Academy HS
 * Sieve of Eratosthenes Program
 * 
 * Description: Prints all prime numbers up to 1000
 * Difficulties: I kept missing all the primes up to ~40 
 * 		until I realized that i needed to use i*i before checking multiples
 * Learned: To check if a number is prime, you can just check if it is a multiple of the numbers below
 */

public class SieveOfEratosthenesEBF {
	
	public static void main(String[] args) {
		
		int numberToCheck = 1000;
		
		// represent each prime as a true or false
		boolean[] isPrime = new boolean[numberToCheck];
		
		// set each above 1 to true to begin
		for (int i = 2; i < numberToCheck; i++)
			isPrime[i] = true;
		
		// loop through each number's square
		for (int i = 2; i * i < numberToCheck; i++) {
			
			// make sure the number is currently set as prime
			if (!isPrime[i]) continue;
			
			// remove all multiples of that number
			for (int j = i * i; j < numberToCheck; j += i) 
				isPrime[j] = false;
			
		}
		
		// print out only the primes
		for (int i = 0; i < numberToCheck; i++)
			if (isPrime[i])
				System.out.println(i);
		
	}
	
}

/*
 * Sample Output:
 
2
3
5
7
11
13
17
19
23
29
31
37
41

...

 */
