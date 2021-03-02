package Misc;

public class NewtonsFormula {

	public static void main(String[] args) {
		
		double c = .5;
		
		for (int i = 1; i <= 10; i++) {
			c -= f(c) / fPrime(c);
			System.out.println("C sub " + i + ": " + c);
		}

	}
	
	static double f(double x) { return 2 * Math.cos(x) - Math.pow(Math.E, x); }
	
	static double fPrime(double x) { return -2 * Math.sin(x) - Math.pow(Math.E, x); }

}
