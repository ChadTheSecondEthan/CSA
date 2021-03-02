package Module10;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * Author: Ethan Fisher
 * Date: 1/29/2021
 * School: Franklin Academy HS
 * Fun With Scores Program
 * 
 * Description: Finds the average after reading from a file
 * Difficulties: finding the size of the file before actually reading from it
 * Learned: Re-initializing and array resets it, but somehow using Scanner.reset doesn't
 */

public class FunWithScoresEBF {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// create the file and scanner
		File file = new File("M10L3A1.dat");
		Scanner input = new Scanner(file);
		
		// find the number of lines in the file
		int dataSize = 0;
		while(input.hasNextLine()) {
			dataSize++;
			input.nextLine();
		}
		
		// reset the scanner
		input.close();
		input = new Scanner(file);
		
		// initialize the arrays
		int[] ids = new int[dataSize];
		int[] scores = new int[dataSize];
		
		// continue while the scanner can still read
		int curIndex = 0;
		while(input.hasNextInt() && curIndex < dataSize) {
			
			// read id and score
			ids[curIndex] = input.nextInt();
			scores[curIndex] = input.nextInt();
			
			// go to the next line if there is one
			if (input.hasNextLine())
				input.nextLine();
			
			// increment index
			curIndex++;
		}
		
		// find the average
		int sum = 0;
		double average;
		
		for (int i = 0; i < dataSize; i++)
			sum += scores[i];
		average = sum / dataSize;
		
		// print the results
		System.out.printf("Sum\t= %d\nAverage\t= %.2f\nCount\t= %d\n", sum, average, dataSize);
		System.out.println("Id\tScore\tDiff");
		
		for (int i = 0; i < dataSize; i++) {
			
			double diff = scores[i] - average;
			System.out.printf("%d\t%d\t%.2f\n", ids[i], scores[i], diff);
		}
		
		// close scanner
		input.close();
		
	}
	
}

/*
 * Sample Output:

-----------(With given text file)---------------
 
Sum	= 5095
Average	= 242.00
Count	= 21
Id	Score	Diff
115	257	15.00
123	253	11.00
116	246	4.00
113	243	1.00
112	239	-3.00
104	239	-3.00
110	238	-4.00
218	243	1.00
208	242	0.00
222	223	-19.00
223	230	-12.00
213	229	-13.00
207	228	-14.00
203	224	-18.00
305	265	23.00
306	262	20.00
311	256	14.00
325	246	4.00
321	245	3.00
323	245	3.00
302	242	0.00

---------------(With the new file)---------------

Sum	= 5659
Average	= 269.00
Count	= 21
Id	Score	Diff
115	257	-12.00
203	453	184.00
136	246	-23.00
113	443	174.00
102	239	-30.00
104	239	-30.00
114	248	-21.00
218	253	-16.00
208	242	-27.00
262	223	-46.00
223	234	-35.00
203	259	-10.00
287	228	-41.00
203	224	-45.00
305	275	6.00
346	262	-7.00
311	296	27.00
225	246	-23.00
321	295	26.00
223	205	-64.00
302	292	23.00

 */
