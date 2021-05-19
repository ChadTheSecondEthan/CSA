package Module15;

/*
 * Author: Ethan Fisher
 * Date: 4/15/2021
 * School: Franklin Academy HS
 * Cereal Tester Program
 * 
 * Description: Create cereal objects
 */

public class CerealTesterEBF {
	
	public static void main(String[] args) {
		
		// create some cereal objects
		Cereal bran100 = new Cereal("100% Bran", 6, 10f);
		Cereal appleJacks = new Cereal("Apple Jacks", 14, 1f);
		Cereal capNCrunch = new Cereal("Cap'n'Crunch", 12, 0f);
		
		// print them out
		System.out.println(bran100);
		System.out.println(appleJacks);
		System.out.println(capNCrunch);
		
	}
	
}

/*
 * Sample Output:
 * 
Name: 100% Bran, Sugar: 6 grams, Fiber: 10.0 grams
Name: Apple Jacks, Sugar: 14 grams, Fiber: 1.0 grams
Name: Cap'n'Crunch, Sugar: 12 grams, Fiber: 0.0 grams
 * 
 */