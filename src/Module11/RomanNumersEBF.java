package Module11;

import java.util.Scanner;

/*
 * Author: Ethan Fisher
 * Date: 2/22/2021
 * School: Franklin Academy HS
 * Roman Numerals Program
 * 
 * Description: Find the time from roman numerals
 * Difficulties: making sure numerals like "IV" were evaluated to 4, not 6
 * Learned: Roman numerals just need to be replaced with numbers and added to get the result
 */

public class RomanNumersEBF {
	
	// strings for roman numerals and their replacements
	static String[] numerals = { "IV", "IX", "IL", "IC", "ID", "IM", "I", "V", "X", "L", "C", "D", "M" };
	static String[] replacements = { "4", "9", "49", "99", "499", "999", "1", "5", "10", "50", "100", "500", "1000" };
	
	public static void main(String[] args) {
		
		// initialize scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Input time in roman numerals: ");
		String timeString = input.nextLine();
		
		// split into hours and minutes
		String[] sides = timeString.split(":");
		int hour = romanNumeralToNumber(sides[0]);
		int minute = romanNumeralToNumber(sides[1]);
		
		// print new time
		System.out.printf("%02d:%02d\n", hour, minute);
		
	}
	
	// returns the roman numeral string to a string of integers
	static int romanNumeralToNumber(String numeral) {
		
		// replace the numerals with the replacements
		// adding the letter "p" to represent "plus"
		for (int i = 0; i < numerals.length; i++)
			numeral = numeral.replace(numerals[i], replacements[i] + "p");
		
		// add up all the numbers with "p"
		String[] strings = numeral.split("p");
		int total = 0;
		for (String s : strings) 
			total += Integer.parseInt(s);
		
		// return that total
		return total;
	}
	
}

/*
 * Sample Output:

Input time in roman numerals: XII:XXV
12:25

Input time in roman numerals: IX:LVII
09:57

Input time in roman numerals: VII:XIV
07:14

Input time in roman numerals: II:XVII
02:17

 */