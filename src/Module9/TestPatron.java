package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/9/2020
 * School: Franklin Academy HS
 * Library Program
 * 
 * Description: Create patron objects
 */

public class TestPatron {
	
	public static void main(String[] args) {
		
		Book bookOne = new Book("ABC", "Lucy Wells");
		Book bookTwo = new Book("Hiking", "Go Trails");
		Patron patronOne = new Patron();
		Patron patronTwo = new Patron("Harry", "Wells", "nash8294", bookOne);
		
		System.out.println(patronTwo);
		
		patronOne.setFirstName("Mary");
		patronOne.setLastName("Suzel");
		patronOne.setLibraryNumber("nash8293");
		
		patronOne.setBook(bookOne);
		System.out.println(patronOne);
		
	}
	
}

/*
 * Sample Output:

The specs of this Patron are: 
	 First Name: Harry
	 Last Name: Wells 
	 Library Number: nash8294 
	Book: The specs of this Book are: 
	 Title: ABC
	 Author: Lucy Wells 
	
The specs of this Patron are: 
	 First Name: Mary
	 Last Name: Suzel 
	 Library Number: nash8293 
	Book: The specs of this Book are: 
	 Title: ABC
	 Author: Lucy Wells 
	
 */
