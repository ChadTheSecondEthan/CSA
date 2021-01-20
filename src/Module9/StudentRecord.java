package Module9;

import java.util.ArrayList;

/*
 * Author: Ethan Fisher
 * Date: 10/11/2020
 * 
 * Implements a Student Record class
 */

public class StudentRecord {
	
	// some variables for a student's scores
	public static final int NUM_ASSIGNMENTS = 15;
	public static final int NUM_QUIZZES = 7;
	public static final int NUM_TESTS = 4;
	public static final int NUM_SCORES = 27;
	
	// indexes in the averages array
	public static final int ASSIGNMENTS = 0;
	public static final int QUIZZES = 1;
	public static final int TESTS = 2;
	public static final int FINAL = 3;
	public static final int OVERALL = 4;

	// percents for the grade
	public static final double PERCENT_ASSIGNMENTS = 0.4;
	public static final double PERCENT_QUIZ_AND_TESTS = 0.4;
	public static final double PERCENT_FINAL = 0.2;
	
	// variables for scores, and averages for quizzes, tests, etc.
	private ArrayList<Integer> scores;
	private double[] averages;
	
	/**
	 * Normal Constructor for the StudentRecord
	 */
	public StudentRecord() {
		scores = new ArrayList<>();
		averages = new double[5];
	}
	
	/**
	 * Calculates the grade letter with the scores
	 */
	public char getGradeLetter() {
		
		// get the current overall grade
		double overallAverage = averages[OVERALL];
		
		// check its value and return the correct letter
		if (overallAverage < 60) 
			return 'F';
		else if (overallAverage < 70) 
			return 'D';
		else if (overallAverage < 80) 
			return 'C';
		else if (overallAverage < 90) 
			return 'B';
		else
			return 'A';
	}
	
	/**
	 * Calculates all of the averages based off of the scores
	 */
	public double[] getAverages() {
		
		// initialize array
		averages = new double[5];
		
		// used with calcAverage for the startIndex
		int curIndex = 0;
		averages[ASSIGNMENTS] = calcAverage(curIndex, curIndex += NUM_ASSIGNMENTS);
		averages[QUIZZES] = calcAverage(curIndex, curIndex += NUM_QUIZZES);
		averages[TESTS] = calcAverage(curIndex, curIndex += NUM_TESTS);
		averages[FINAL] = calcAverage(curIndex, curIndex + 1);
		
		// get the overall average
		double quizTestAverage = (averages[QUIZZES] + averages[TESTS]) * PERCENT_QUIZ_AND_TESTS / 2;
		double assignmentAverage = averages[ASSIGNMENTS] * PERCENT_ASSIGNMENTS;
		double finalAverage = averages[FINAL] * PERCENT_FINAL;
		averages[OVERALL] = quizTestAverage + assignmentAverage + finalAverage;
		
		// return the array
		return averages;
	}
	
	/**
	 * Calculate one average with a given start and end index
	 */
	private double calcAverage(int startIndex, int endIndex) {
		
		// total for the scores
		double total = 0;
		
		// loop between indexes and add the scores
		for (int i = startIndex; i < endIndex; i++) 
			total += scores.get(i);
		
		// return the average
		return total / (endIndex - startIndex);
	}
	
	/**
	 * Adds a score to the scores
	 */
	public void setScores(ArrayList<Integer> scores) { this.scores = scores; }
	
}
