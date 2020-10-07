package Module7;

/*
 * Author: Ethan Fisher
 * Date: 9/18/2020
 * School: Franklin Academy HS
 * String Examples Program
 * 
 * Description: Examples of uses of Strings in java
 * Difficulties: Forgot parenthesis on length()
 * Learned: substring and length access the string of which the function references
 */

public class EBFStringExamples {

	public static void main(String[] args) {
		
		// string concatenation example
		String one = "Hello";
		String two = "good buddy";
		String three = one + " " + two;
		System.out.println(three + "\nLength: " + three.length());
		
		// substring example
		String myPet = "Sparky the dog";
		String smallPart = myPet.substring(4, 12);
		System.out.println(smallPart);
			
	}
}

/*
 * Sample Output:
 * 
 * Hello good buddy
 * Length: 16
 * ky the d
 * 
 */
