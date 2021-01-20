package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/10/2020
 * School: Franklin Academy HS
 * Anonymous Objects Program
 * 
 * Description: Create book objects and compare them
 */

public class AnonymousObjectsEBF {
	
	public static void main(String[] args) {
		
		Book bookOne = new Book("Book One", "Author One");
		Book bookTwo;
		bookTwo = bookOne;
		System.out.println(bookTwo == bookOne);
		
		bookTwo = new Book("Book One", "Author One");
		System.out.println(bookTwo == bookOne);
		System.out.println(bookTwo.equals(bookOne));
		
	}
	
}

/*
 * Sample Output:
 * 
 * true
 * false
 * false
 * 
 */
