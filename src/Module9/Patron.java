package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/9/2020
 * 
 * Implements a Patron class
 */

public class Patron {
	
	// instance variables
	private String firstName;
	private String lastName;
	private String libNumber;
	private Book book;
	
	/**
	 * Default Constructor for objects of class Patron
	 */
	public Patron() {
		// initialize instance variables
		firstName = null;
		lastName = null;
		libNumber = null;
		book = null;
	}
	
	/**
	 * Normal Constructor for the Patron object
	 */
	public Patron(String firstName, String lastName, String libNumber, Book book) {
		// initialize instance variables
		this.firstName = firstName;
		this.lastName = lastName;
		this.libNumber = libNumber;
		this.book = book;
	}
	
	/*********************** Accessors (getters) *********************/
	
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getLibraryNumber() { return libNumber; }
	public Book getBook() { return book; }
	
	/*********************** Mutators (setters) **********************/
	
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setLibraryNumber(String libNumber) { this.libNumber = libNumber; }
	public void setBook(Book book) { this.book = book; }
	
	/**
	 * Print the specs of the Book object.
	 */
	@Override
	public String toString() {
		return String.format("The specs of this Patron are: "
				+ "\n\t First Name: %s\n\t "
				+ "Last Name: %s \n\t "
				+ "Library Number: %s \n\t"
				+ "Book: %s \n\t", 
				firstName, lastName, libNumber, book);
	}
	
}
