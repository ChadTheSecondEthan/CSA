package Module5;

/*
 * Author: Ethan Fisher
 * Program name: Ulam Hypothesis
 * Date: 9/1/2020
 * Description: This program tests Ulam's Hypothesis for numbers 1-25 
 * Numbers 1-25 converge to 1 by these rules: If odd, multiply by 3 and add 1. If even, divide by 2.
 * Difficulties: The while loop went infinitely because I put incorrect code in
 * Learned: For statements can be used to easily increment variables
 */

public class EBFUlamHypothesis {

    public static void main(String args[]) {

        //Variables
        int num;
        int print;
        
        //Counting loop to repeat for 2-25
        for (num = 1; num <= 25; num++) {
            
            //Reset print to num
            print = num;
            
            //Print the first number of the sequence.
            System.out.print(print + ":  ");
            
            //Result controlled loop: keeps doing calculations and printing the sequence until 1 is reached
            do {
            	
            	if (print % 2 == 1) {
            		// if odd, multiply by three and add one
            		print *= 3;
            		print++;
            	} else {
            		// if even, divide by two
            		print /= 2;
            	}
            	
            	// print with a space
            	System.out.print(print + " ");
                    
            } while (print != 1);
            
            //Start the next line
            System.out.println();
            
        }

    }

}

/*
 * Sample Output:
 * 
 * 1:  4 2 1 
 * 2:  1 
 * 3:  10 5 16 8 4 2 1 
 * 4:  2 1 
 * 5:  16 8 4 2 1 
 * 6:  3 10 5 16 8 4 2 1 
 * 7:  22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 * 8:  4 2 1 
 * 9:  28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 * 10:  5 16 8 4 2 1 
 * 11:  34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 * 12:  6 3 10 5 16 8 4 2 1 
 * 13:  40 20 10 5 16 8 4 2 1 
 * 14:  7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 * 15:  46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
 * 16:  8 4 2 1 
 * 17:  52 26 13 40 20 10 5 16 8 4 2 1 
 * 18:  9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 * 19:  58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 * 20:  10 5 16 8 4 2 1 
 * 21:  64 32 16 8 4 2 1 
 * 22:  11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 * 23:  70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
 * 24:  12 6 3 10 5 16 8 4 2 1 
 * 25:  76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 * 
 */
