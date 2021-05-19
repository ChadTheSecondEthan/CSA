package Module14;

import java.util.Calendar;

public class Movie extends Media {
	
	// instance variables
	private int year;

	public Movie() {
		super();
		year = 0;
	}

	public Movie(String title, Calendar today, int year) {
		super(title, today);
		this.year = year;
	}
	
	public Movie(Movie m) {
		super(m.title, m.today);
		year = m.year;
	}
	
	/*************** Getters ************/
	
	public int getYear() { return year; }
	
	/*************** Setters ************/
	
	public void setYear(int year) { this.year = year; }
	
	/**
	 * Print the book
	 */
	@Override
	public String toString() {
		String str = "\nThe specs of this book are: ";
		str += "\n\t Title: " + title;
		str += "\n\t Year: " + year;
		str += "\n\t Checkout Date: " + (getReturnDate().get(Calendar.MONTH) + 1) + "/" + (getReturnDate().get(Calendar.DATE));
		return str;
	}
	
	@Override
	public Calendar getReturnDate() {
		Calendar dueDate = Calendar.getInstance();
		dueDate.set(Calendar.MONTH, today.get(Calendar.MONTH));
		dueDate.set(Calendar.YEAR, today.get(Calendar.YEAR));
		dueDate.set(Calendar.DATE, 7);
		return dueDate;
	}

}
