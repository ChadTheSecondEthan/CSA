package Module10;

/*
1. for (int index = 0; index < egArray.length; index++)

2. for (int index = egArray.length - 1; index >= 0; index--)

3.
	a. for (int index = 0; index < array.length; index++)
	b. for (int index = 0; index < array.length; index++)

4. array = new int[size];

5. 
	a. 27
	b. I looked at all of the numbers and saw that 27 was bigger than the rest

6. max = array[0];
7.
	a. The program will find the correct maximum with the original array
	b. The program will not run correctly when the maximum is the last number in the array
	c. Not unless the maximum is at the end of the array

8. Each weekly pay is added to sum

9. 
	a. min = array[0];
	b. if (array[index] < min) {
		min = array[index];
	}

10.
*/

public class ArraysPracticeEBF {
	
	public static void main(String[] args) {

		double[] array = { 1,  4, 32, 234, 2, 76, 394, 2 };
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}	

		double average = sum / array.length;
		
		System.out.println("Average: " + average);
	}

}