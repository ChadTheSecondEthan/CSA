package Module8;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 10/8/2020
 * School: Franklin Academy HS
 * Triangles Program
 * 
 * Description: Determine the type of triangle through an input
 * Difficulties: Finding the area of a not right triangle
 * Learned: Arrays has a static function that sorts an array for you
 */

public class TrianglesEBF {

	public static void main(String[] args) {
		
		// initialize Scanner
		Scanner input = new Scanner(System.in);
		
		// loop until the user wants to stop
		String answer;
		do {
			
			System.out.print("What are the sides of your triangle?\n"
					+ "Please place a space between each number: ");
			
			// get input
			answer = input.nextLine().trim();
			
			// split into three strings, and convert them to integers
			String[] sidesStrings = answer.split(" ");
			int[] sides = new int[sidesStrings.length];
			
			// try to convert each into a string, and throw exception if it fails
			for (int i = 0; i < sidesStrings.length; i++) {
				try {
					sides[i] = Integer.parseInt(sidesStrings[i]);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			printTriangleProperties(sides);
			
			// ask if they want to enter another
			System.out.print("Would you like to enter another? ");
			answer = input.nextLine().trim();
			
		} while(!answer.equals("n") && !answer.equals("no"));
		
		// close Scanner
		input.close();
		
	}
	
	/**
	 * @param sides of the triangle
	 * Prints the type of triangle, and the area
	 */
	public static void printTriangleProperties(int[] sides) {
		
		// first, order the sides from least to greatest
		Arrays.parallelSort(sides);
		
		// assign them to a, b, and c
		int a = sides[0];
		int b = sides[1];
		int c = sides[2];
		
		// make sure triangle is valid
		if (!triangleIsValid(sides)) {
			System.out.println("Invalid triangle.");
			return;
		}
		
		// check if it's a right trangle
		int squaredSides = (int) (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2));
		
		// holds the type of triangle and its area
		String triangleType;
		double area = calcArea(sides);
		
		// right triangle
		if (squaredSides == 0) 
			triangleType = "a right triangle";
		
		// obtuse triangle
		else if (squaredSides < 0) 
			triangleType = "an obtuse triangle";
		
		// acute triangle
		else 
			triangleType = "an acute triangle";
		
		System.out.printf("This is %s with area of %.2f.\n", triangleType, area);
		
	}
	
	/**
	 * @param sides of a triangle, sorted
	 * @return true if they can make a triangle, false otherwise
	 */
	public static boolean triangleIsValid(int[] sides) {
		// a triangle is valid if the sum of the smaller sides is greater than the largest side
		return sides[0] + sides[1] > sides[2];
	}
	
	/**
	 * @param sides of a triangle, sorted
	 * @return the area, using a formula I googled
	 */
	public static double calcArea(int[] sides) {
		
		// the formula for area is ab*sin(C) / 2
		int a = sides[0];
		int b = sides[1];
		int c = sides[2];
		
		// find C (the angle)
		double C = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
		
		// return the area based on the above formula
		return a * b * Math.sin(C) / 2;
	}
	
}

/*
 * Sample Output:
 * 
 * What are the sides of your triangle?
 * Please place a space between each number: 3 4 5
 * This is a right triangle with area of 6.00.
 * Would you like to enter another? y
 * What are the sides of your triangle?
 * Please place a space between each number: 10 20 29
 * This is an obtuse triangle with area of 52.27.
 * Would you like to enter another? y
 * What are the sides of your triangle?
 * Please place a space between each number: 12 12 12
 * This is an acute triangle with area of 62.35.
 * Would you like to enter another? 
 * 
 */
