package Module10;

/*
 * Author: Ethan Fisher
 * Date: 10/12/2020
 * School: Franklin Academy HS
 * Arrays Example Program
 * 
 * Description: Create arrays in java
 */

public class ArraysExampleEBF {
	
	public static void main(String[] args) {
		
		// a bunch of grade variables
		int grade1 = 97;
		int grade2 = 62;
		int grade3 = 85;
		int grade4 = 26;
		
		// one array of grades
		int grade[] = { 97, 62, 85, 26 };
		
		// another way to initialize and assign values
		int grades[] = new int[100];
		grades[0] = 1;
		
		// print length
		System.out.println("Length of grades array: " + grades.length);
		
		// split function by whitespace
		String s = "Hello this is a program";
		String[] strings = s.split("\\s");
		
		// loop through strings array and print each string
		for (int i = 0; i < strings.length; i++)
			System.out.println(strings[i]);
		
	}
	
}

/*
 * Sample Output:

Length of grades array: 100

Length of grades array: 100
Hello
this
is
a
program

 */
