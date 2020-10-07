package Module5;

/*
 * Author: Ethan Fisher
 * Date: 8/31/2020
 * School: Franklin Academy HS
 * Boolean Operators Program
 * 
 * Description: Prints boolean values
 * Difficulties: Forgetting to put parenthesis around some expressions
 * Learned: booleans only hold 1 of 2 values
 */



public class EBFOperators {

	public static void main(String[] args) {
		
		int x = 37;
		int y = 49;
		int z = 37;
		boolean b = x != y;
		System.out.println(b);

		b = x < y;
		System.out.println(b);

		b = x > y;
		System.out.println(b);

		b = x == y;
		System.out.println(b);
		
		b = (x == y || z == y) && x == z;
		System.out.println(b);
		
	}
	
}

/*
 * Sample Output:
 * true
 * true
 * false
 * false
 * false

 */
