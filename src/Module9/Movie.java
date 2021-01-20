package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/11/2020
 * 
 * Implements a Movie class
 */

public class Movie {
	
	// instance variables
	private String title;
	private String genre;
	private double rating;
	
	// variables for the costs of different genres
	public static final double ACTION_COST = 11.99;
	public static final double ROMANCE_COST = 12.99;
	public static final double COMEDY_COST = 13.99;
	public static final double DRAMA_COST = 14.99;
	public static final double DEFAULT_COST = 15.99;
	
	/**
	 * Normal Constructor for the Movie object
	 */
	public Movie(String title, String genre, double rating) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}
	
	/**
	 * Prints the specs of the Movie object
	 */
	public String toString() {
		return String.format("Movie: %s \n"
				+ "Genre: %s \n"
				+ "Rating (out of 10): %.1f \n"
				+ "Purchase Cost: $%.2f \n"
				+ "Rental Cost: $%.2f", title,
				genre, rating, getPurchaseCost(), getRentalCost());
	}
	
	/*********************** Accessors (getters) *********************/
	
	public String getTitle() { return title; }
	public String getGenre() { return genre; }
	public double getRating() { return rating; }
	public double getPurchaseCost() {
		
		// return cost based off of what the genre has in it
		if (genre.contains("Action"))
			return ACTION_COST;
		if (genre.contains("Romance"))
			return ROMANCE_COST;
		if (genre.contains("Comedy"))
			return COMEDY_COST;
		if (genre.contains("Drama"))
			return DRAMA_COST;
		return DEFAULT_COST;
	}
	
	// the purchase cost will be $10 lower than the purchase cost
	public double getRentalCost() { return getPurchaseCost() - 10; }
	
	/*********************** Mutators (setters) **********************/
	
	public void setTitle(String title) { this.title = title; }
	public void setGenre(String genre) { this.genre = genre; }
	public void setRating(double rating) { this.rating = rating; }
	
	
}
