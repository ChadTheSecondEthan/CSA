package Module10;

/*
 * Author: Ethan Fisher
 * Date: 1/28/2021
 * School: Franklin Academy HS
 * Array of Circles Example Program
 * 
 * Description: Create arrays of circles in java
 */

public class ArrayOfCirclesEBF {
	
	public static void main(String[] args) {
		
		// create array of circles
		Circle[] circles = new Circle[500];
		
		// initialize each element individually
		circles[0] = new Circle(1);
		circles[1] = new Circle(2);
		circles[2] = new Circle(1.6);
		
		// use a loop to initialize the array
		for (int i = 0; i < 500; i++) {
			circles[i] = new Circle(10);
		}
		
		/*
		 * The for loop is easier for creating an array of circles,
		 * because the first method would require 500 lines to make 
		 * the array, while the second method requires three lines
		 */
		
	}
	
}
	
// empty class that simply creates a circle with a radius
class Circle { 
	public Circle(double r) {} 
}
