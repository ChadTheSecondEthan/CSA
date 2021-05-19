package Module14;

import java.util.Calendar;

public class Book extends Media {
	
	// instance variables
	private String author;
	
	/**
	 * Default constructor
	 */
	public Book() {
		super();
		author = null;
	}

	/**
	 * Normal constructor
	 */
	public Book(String author, String title, Calendar today) {
		super(title, today);
		this.author = author;
	}
	
	/**
	 * Copies the book
	 */
	public Book(Book b) {
		super(b.title, b.today);
		author = b.author;
	}
	
	/******************************* Getters ***************************/
	
	public String getAuthor() { return author; }
	
	/******************************* Setters ***************************/
	
	public void setAuthor(String author) { this.author = author; }
	
	/**
	 * Print the book
	 */
	@Override
	public String toString() {
		String str = "\nThe specs of this book are: ";
		str += "\n\t Title: " + title;
		str += "\n\t Author: " + author;
		str += "\n\t Checkout Date: " + today;
		return str;
	}
	
	@Override
	public Calendar getReturnDate() {
		Calendar dueDate = Calendar.getInstance();
		dueDate.set(Calendar.MONTH, today.get(Calendar.MONTH));
		dueDate.set(Calendar.YEAR, today.get(Calendar.YEAR));
		dueDate.set(Calendar.DATE, 21);
		return dueDate;
	}

}
