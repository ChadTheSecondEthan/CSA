/*
 * Author: Ethan Fisher
 * Date: 8/24/2020
 * School: Franklin Academy HS
 * Rectangle Program
 * 
 * Description: Prints perimeter and area of a rectangle
 * Difficulties: Couldn't calculate length + 1 or width + 1,
 * 	   so I had to rearrange the line of code
 * Learned: You can apply math operations when assigning variables
 */

public class RectangleProgramEBF {

	public static void main(String[] args) {
		
		// declare variables
		int length, width;
		int perimeter, bigPerimeter;
		int area, bigArea;
		
		// assign length and width
		length = 5;
		width = 4;
		
		// calculate perimeters and areas
		perimeter = (length * 2) + (width * 2);
		bigPerimeter = (length + 1) * 2 + (width + 1) * 2;
		area = length * width;
		bigArea = (length + 1) * (width + 1);
		
		// print results
		System.out.println("Length = " + length + "\n" +
				"Width = " + width + "\n" +
				"Perimeter = " + perimeter + "\n" +
				"Area = " + area + "\n" +
				"BigPerimeter = " + bigPerimeter + "\n" +
				"BigArea = " + bigArea);
	}

}

/*
 * Sample Output:
 * Length = 5
 * Width = 4
 * Perimeter = 18
 * Area = 20
 * BigPerimeter = 22
 * BigArea = 30
 */
