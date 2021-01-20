package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/10/2020
 * 
 * Implements a Rectangle class
 */

public class Rectangle {
	
	// instance variables
	private double length;
	private double width;
	
	/**
	 * Normal Constructor for the Rectangle object
	 */
	public Rectangle(double length, double width) {
		// initialize instance variables
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Area and perimeter functions
	 */
	public double getArea() { return width * length; }
	public double getPerimeter() { return 2 * (length + width); }
	
	/**
	 * Returns the specs of the rectangle
	 */
	public String toString() {
		return String.format("The area of the rectangle is %.2f inches. "
				+ "The perimeter is %.2f inches.", getArea(), getPerimeter());
	}
	
}
