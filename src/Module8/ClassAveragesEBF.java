package Module8;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * Author: Ethan Fisher
 * Date: 10/7/2020
 * School: Franklin Academy HS
 * Class Averages Program
 * 
 * Description: Read input from a file to get student's averages
 * Difficulties: Figuring out how to parse each different piece of data,
 * 		like the course from the student and their average
 * Learned: the split function in String allows you to separate lines by any
 * 		given string, like a space
 */

public class ClassAveragesEBF {
	
	// variables for classes
	public static final int CIS_110 = 0;
	public static final int ENG_111 = 1;
	public static final int MTH_141 = 2;
	public static final int CHM_121 = 3;

	public static void main(String[] args) throws FileNotFoundException {
		
		// create file for student courses and averages, and scanner to read from file
		File file = new File("src\\Module8\\M8L2A2file.txt");
		Scanner input = new Scanner(file);
		
		// get student averages, and print them
		double[][] allAverages = getStudentAverages(input);
		printStudentAverages(allAverages);
		
		// close scanner so no memory leaks
		input.close();
	}
	
	/**
	 * @param Scanner with the file in it to read
	 * @return a two-dimensional array, with the first
	 * element as the first student's averages, and the second
	 * element as the second student's averages
	 */
	public static double[][] getStudentAverages(Scanner input) {
		
		// initialize an array for the two students
		double[][] averages = new double[2][4];
		
		// for detecting the current student throughout the file
		int curStudent = 0;
		
		while(input.hasNext()) {
			
			// get next line from input
			String line = input.nextLine().trim();
			
			// make sure the line isn't empty
			if (line.equals("")) continue;
			
			// if the scanner has found "student" whatever number is after the # is the current student
			if (line.contains("Student #")) {
				
				// find the number after the # and subtract 1
				String studentString = line.substring(9);
				curStudent = Integer.parseInt(studentString) - 1;
				
				// move the the next line
				line = input.nextLine().trim();
			}
			
			// the current class is the first part of the line
			String curClass = line.substring(0, 7);
			
			// remove -999 and other whitespace, and get the class scores
			String[] classScores = line.substring(8).replace("-999", "").trim().split(" ");
			
			// find the current class
			switch(curClass) {
			
			// once the class is found, use classScores to find the averages
			
			case "CIS 110":
				averages[curStudent][CIS_110] = findAverageScore(classScores);
				break;
			case "ENG 111":
				averages[curStudent][ENG_111] = findAverageScore(classScores);
				break;
			case "MTH 141":
				averages[curStudent][MTH_141] = findAverageScore(classScores);
				break;
			case "CHM 121":
				averages[curStudent][CHM_121] = findAverageScore(classScores);
				break;
				
			}
		}
		
		// return the averages
		return averages;
		
	}
	
	/**
	 * @param a String[] of scores, each containing an integer
	 * @return the average of the scores
	 */
	public static double findAverageScore(String[] scores) {
		
		// the current total for the scores
		int total = 0;
		
		for (int i = 0; i < scores.length; i++) {
			
			// try to convert each string to an int and add it to the total
			try {
				total += Integer.parseInt(scores[i]);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		// return total / length of scores (keeping in mind not to use integer division)
		return (double) total / scores.length;
	}
	
	/**
	 * @param averages for both students for each of their classes
	 */
	public static void printStudentAverages(double[][] averages) {
		
		// for finding each student's overall averages
		double overallStudentOne = 0, overallStudentTwo = 0;
		
		// print header first
		System.out.println("Course ID\tStudent #\tCourse Average");
		
		// loop through each of the 4 class
		for (int i = 0; i < 4; i++) {
			
			// holds the current class @ i
			String currentClass;
			switch(i) {
				case CIS_110:
					currentClass = "CIS 110";
					break;
				case ENG_111:
					currentClass = "ENG 111";
					break;
				case MTH_141:
					currentClass = "MTH 141";
					break;
				default:
					currentClass = "CHM 121";
			}
			
			// add to the students' overall averages
			overallStudentOne += averages[0][i];
			overallStudentTwo += averages[1][i];
			
			// print each students' averages for the currentClass
			System.out.printf("%s \t 1 \t\t %.2f\n  \t\t 2 \t\t %.2f\n",
					currentClass, averages[0][i], averages[1][i]);
		}
		
		// Finally, print each students' overall averages
		System.out.printf("\nAverage for student 1: %.3f\n"
				+ "Average for student 2: %.3f\n", 
				overallStudentOne / 4, overallStudentTwo / 4);
		
	}
}

/*
 * Sample Output:
 * 
 */
