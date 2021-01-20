package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/9/2020
 * 
 * Implements a Book class
 */

public class Book {
	
	// instance variables
	private String title;
	private String author;
	
	/**
	 * Default Constructor for objects of class Book
	 */
	public Book() {
		// initialize instance variables
		title = null;
		author = null;
	}
	
	/**
	 * Normal Constructor for the Book object.
	 */
	public Book(String title, String author) {
		// initialize instance variables
		this.title = title;
		this.author = author;
	}
	
	/**
	 * Copies the book
	 */
	public Book(Book book) {
		title = book.getTitle();
		author = book.getAuthor();
	}
	
	/**
	 * Print the specs of the Book object.
	 */
	@Override
	public String toString() {
		return String.format("The specs of this Book are: \n\t Title: %s\n\t Author: %s", title, author);
	}
	
	/*********************** Accessors (getters) *********************/
	
	public String getTitle() { return title; }
	public String getAuthor() { return author; }
	
	/*********************** Mutators (setters) **********************/
	
	public void setTitle(String title) { this.title = title; }
	public void setAuthor(String author) { this.author = author; }
	
}
