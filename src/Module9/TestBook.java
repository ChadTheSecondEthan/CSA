package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/9/2020
 * School: Franklin Academy HS
 * Library Program
 * 
 * Description: Create book objects
 */

public class TestBook {
	
	public static void main(String[] args) {
		
		Book bookOne = new Book("Alice in Wonderland", "Lewis Carroll");
		Book bookTwo = new Book();
		Book bookThree = new Book("On the highway", "Jon Jones");
		Book bookFour = new Book(bookThree);
		
		System.out.println(bookOne);
		
		bookTwo.setTitle("Alphabet 123");
		bookTwo.setAuthor("Sam Smith");
		
		System.out.println(bookTwo);
		
		bookThree.setAuthor("Jennifer Jones");
		System.out.println(bookThree);
		
		System.out.println(bookTwo.getTitle());
		System.out.println(bookOne.getAuthor());
		
		System.out.println(bookFour);
		
	}
	
}

/*
 * Sample Output:

The specs of this Book are: 
	 Title: Alice in Wonderland
	 Author: Lewis Carroll
The specs of this Book are: 
	 Title: Alphabet 123
	 Author: Sam Smith
The specs of this Book are: 
	 Title: On the highway
	 Author: Jennifer Jones
Alphabet 123
Lewis Carroll
The specs of this Book are: 
	 Title: On the highway
	 Author: Jon Jones

 */
