package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/10/2020
 * 
 * Implements a Clock class
 */

public class Clock {
	
	// instance variables
	private int hours;
	private int minutes;
	private int seconds;
	
	/**
	 * Default Constructor for objects of class Clock
	 */
	public Clock() {
		// initialize instance variables
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	
	/**
	 * Print the specs of the Clock object.
	 */
	@Override
	public String toString() {
		return String.format("The time is %02d:%02d:%02d \nThe total number of seconds is: %d",
				hours, minutes, seconds, totalSeconds());
	}
	
	/**
	 * Adds or subtracts 1 from the hours
	 */
	public void convertDaylightSaving(int num) { hours += num; }
	
	/**
	 * Returns total number of seconds
	 */
	public int totalSeconds() {
		return (hours * 3600) + (minutes * 60) + seconds;
	}
	
	/**
	 * Set the new time for the clock
	 */
	public void setTime(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	
}
