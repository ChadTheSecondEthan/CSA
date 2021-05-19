package Module14;

import java.util.Calendar;

public class AudioBook extends Media {
	
	// instance variables
	private String narr;
	private int year;

	public AudioBook() {
		super();
		narr = null;
		year = 0;
	}

	public AudioBook(String title, Calendar today, String narr, int year) {
		super(title, today);
		this.narr = narr;
		this.year = year;
	}
	
	/******************* Getters ******************/
	
	public String getNarrator() { return narr; }
	public int getYear() { return year; }
	
	/******************* Setters ******************/
	
	public void setNarrator(String narr) { this.narr = narr; }
	public void setYear(int year) { this.year = year; }
	
	/**
	 * Print the book
	 */
	@Override
	public String toString() {
		String str = "\nThe specs of this book are: ";
		str += "\n\t Title: " + title;
		str += "\n\t Narrator: " + narr;
		str += "\n\t Year: " + year;
		str += "\n\t Checkout Date: " + today;
		return str;
	}

	@Override
	public Calendar getReturnDate() {
		Calendar dueDate = Calendar.getInstance();
		dueDate.set(Calendar.MONTH, today.get(Calendar.MONTH));
		dueDate.set(Calendar.YEAR, today.get(Calendar.YEAR));
		dueDate.set(Calendar.DATE, today.get(Calendar.DATE) + 14);
		return dueDate;
	}

}
