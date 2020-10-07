package Module5;

/*
 * Author: Ethan Fisher
 * Date: 8/31/2020
 * School: Franklin Academy HS
 * DeMorgans Law Program
 * 
 * Description: Practicing DeMorgan's theorem
 * Difficulties: Putting and's and or's in the wrong order
 * Learned: and's and or's are like multiplying and adding in algebra
 */



public class EBFDeMorgansLaw {

	public static void main(String[] args) {
		
		boolean a = true, b = false, c = true;
		
		// DeMorgan's Theorem
		boolean theorem = (a && (b || c)) == (a && b || a && c);
		System.out.println(theorem);
		
		// Law of Absoprtion
		boolean absorbed = a == (a && (a || b));
		System.out.println(absorbed);
		
	}
	
}

/*
 * Sample Output:
 * 
 * true
 * true
 * 
 */
