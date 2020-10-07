/*
 * Author: Ethan Fisher
 * Date: 8/24/2020
 * School: Franklin Academy HS
 * Name That Celebrity
 * 
 * Description: Print celebrities' names
 * Difficulties: Getting the numbers correct for the substring() method
 * Learned: Spaces count as characters in strings
 */



public class EBFNameThatCelebrity {

	public static void main(String[] args) {
		
		// initialize strings
		String s1 = "Jim Carrey";
		String s2 = "Kevin James";
		String s3 = "John Cena";
		
		// print out the strings
		System.out.println(
				s1 + ">>>" + s1.substring(1, 7) + "\n" +
				s2 + ">>>" + s2.substring(2, 9) + "\n" +
				s3 + ">>>" + s3.substring(1, 7));
	}

}

/*
 * Sample Output:
 * Jim Carrey>>>im Car
 * Kevin James>>>vin Jam
 * John Cena>>>ohn Ce
 */
