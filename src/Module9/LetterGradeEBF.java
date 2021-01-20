package Module9;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * Author: Ethan Fisher
 * Date: 10/11/2020
 * School: Franklin Academy HS
 * Letter Grade Program
 * 
 * Description: Calculate grade from a file
 * Difficulties: Calculating 5 different averages from scores
 * Learned: Counting by increments can allow you to 
 * 		find averages for parts of the data
 */

public class LetterGradeEBF {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// initialize scanner and file
		File file = new File("M9L1A2StudentDataRecords.txt");
		Scanner input = new Scanner(file);
		
		// print the header to the table
		System.out.println("Student | Assignments |  Quiz  |  Test  | Final Exam | Average");
		
		// loop input
		int curStudent = 1;
		while(input.hasNextInt()) {
			
			// create a student record
			StudentRecord record = new StudentRecord();
			
			// add 27 scores and make sure the scanner has another int
			ArrayList<Integer> scores = new ArrayList<>();
			for (int i = 0; i < StudentRecord.NUM_SCORES; i++)
				try {
					scores.add(input.nextInt());
				} catch(Exception e) {
					break;
				}
			
			// if there aren't 27 scores, the file ended
			if (scores.size() != 27)
				break;
			
			// otherwise, set the student's scores to these scores
			record.setScores(scores);
			
			// get the averages and print them
			double[] averages = record.getAverages();
			System.out.printf("   %s   |    %2.2f    | %2.2f  | %2.2f  |     %d     |  %2.2f(%c)\n", 
					curStudent + (curStudent < 10 ? " " : ""), 
					averages[0], averages[1], averages[2], 
					(int) averages[3], averages[4], record.getGradeLetter());
			
			// increment curStudent
			curStudent++;
			
		}
		
		// close scanner
		input.close();
		
	}
	
}

/*
 * Sample Output:

Student | Assignments |  Quiz  |  Test  | Final Exam | Average
   1    |    92.67    | 79.29  | 89.50  |     85     |  87.82
   2    |    90.00    | 80.00  | 84.50  |     74     |  83.70
   3    |    85.33    | 89.29  | 82.50  |     88     |  86.09
   4    |    90.67    | 94.29  | 89.25  |     90     |  90.97
   5    |    94.67    | 81.43  | 79.00  |     88     |  87.55
   6    |    86.67    | 92.14  | 84.00  |     92     |  88.30
   7    |    90.67    | 83.57  | 80.75  |     75     |  84.13
   8    |    93.33    | 83.57  | 79.25  |     85     |  86.90
   9    |    93.33    | 80.71  | 86.00  |     74     |  85.48
   10   |    84.67    | 78.00  | 77.25  |     80     |  80.92


 */
