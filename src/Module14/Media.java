package Module14;

import java.util.Calendar;

public abstract class Media {

	// instance variables
	public String title;
	public Calendar today;
	
	/**
	 * Default Constructor
	 */
	public Media() {
		title = null;
		today = Calendar.getInstance();
	}
	
	/**
	 * Normal Constructor
	 */
	public Media(String title, Calendar today) {
		this.title = title;
		this.today = today;
	}
	
	/******************** Getters ************************/
	
	public Calendar getToday() { return today; }
	public String getTitle() { return title; }
	
	/******************** Setters ************************/
	
	public void setTitle(String title) { this.title = title; }
	public void setToday(Calendar today) { this.today = today; }
	
	public abstract Calendar getReturnDate();

}
