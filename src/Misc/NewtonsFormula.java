package Misc;

public class NewtonsFormula {

	public static void main(String[] args) {
		
		double x = 1.5;
		
		for (int i = 1; i <= 10; i++) {
			x -= f(x) / fPrime(x);
			System.out.println("X sub " + i + ": " + x);
		}

	}
	
	static double f(double x) { return (x * x * x) - (4 * x) + 2; }
	
	static double fPrime(double x) { return (3 * x * x) - 4; }

}
