package MidSemesterEnrichment;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * Author: Ethan Fisher
 * Date: 10/8/2020
 * School: Franklin Academy HS
 * The Winner Program
 * 
 * Description: File the winner from a file full of scores
 * Difficulties: calculating the average and removing 
 * 		the greatest and smallest of the scores
 * Learned: ArrayLists allow the addition or removing of elements
 */

public class WinnerEBF {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// initialize scanner & file
		File file = new File("theWinner.dat");
		Scanner input = new Scanner(file);
		
		// holds all of the averages
		ArrayList<Double> averages = new ArrayList<>();
		
		// loop while the file has information
		int curContestant = 1;
		while (input.hasNext()) {
			
			// get current line
			String line = input.nextLine().trim();
		
			// convert line into double[]
			double average = getAverage(line);
			averages.add(average);
			
			// print contestants' scores and the average
			System.out.printf("Contestant %d \n%s = %.3f\n\n", 
					curContestant, line, average);
			
			curContestant++;
		}
		
		// find the largest average
		int largestIndex = 0;
		for (int i = 0; i < averages.size(); i++) {
			
			// check if the current average is creater than the largest average
			if (averages.get(i) > averages.get(largestIndex))
				largestIndex = i;
		}
		
		// tell the user who won
		System.out.printf("Contestant %d wins!", largestIndex + 1);
		
	}
	
	/**
	 * @param line from the file
	 * @return the average of all the scores from that line, 
	 * excluding the biggest and smallest of the numbers in the line
	 */
	public static double getAverage(String line) {
		
		// split the line by spaces
		String[] splitLine = line.split(" ");
		
		// array list for holding the scores
		ArrayList<Double> scores = new ArrayList<>();
		
		// try to convert each string into a double
		for (int i = 0; i < splitLine.length; i++) {
			try {
				scores.add(Double.parseDouble(splitLine[i]));
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		// find the largest and smallest of the array list
		double largest = scores.get(0), smallest = scores.get(0);
		for (int i = 1; i < scores.size(); i++) {
			
			if (scores.get(i) > largest)
				largest = scores.get(i);
			else if (scores.get(i) < smallest)
				smallest = scores.get(i);
		}
		
		// remove the smallest and largest from the array
		scores.remove(largest);
		scores.remove(smallest);
		
		// find the average
		double total = 0;
		for (int i = 0; i < scores.size(); i++) 
			total += scores.get(i);
		
		// return the average
		return total / scores.size();
	}
	
}

/*
 * Sample Output:
 
Contestant 1 
8.4 9.1 8.5 8.4 9.1 8.7 8.8 9.1 = 8.767

Contestant 2 
7.0 7.0 7.0 7.0 7.0 7.0 7.0 7.0 = 7.000

Contestant 3 
8.0 7.9 8.0 8.0 8.0 8.0 8.0 8.1 = 8.000

Contestant 4 
7 9.1 8.5 8.4 7 8.7 8.8 9.1 = 8.417

Contestant 5 
7.0 7.9 7.0 7.8 7.0 5.0 7.0 7.5 = 7.217

Contestant 1 wins!


 */
