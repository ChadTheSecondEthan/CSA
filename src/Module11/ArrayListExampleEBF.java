package Module11;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Author: Ethan Fisher
 * Date: 2/25/2021
 * School: Franklin Academy HS
 * Array List Example Program
 * 
 * Description: Make some array lists and iterators
 */

public class ArrayListExampleEBF {
	
	public static void main(String[] args) {
		
		// create an ArrayList of type string and populate the list
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Sample string");
		arrayList.add(0, "Another sample string");
		arrayList.add("One more sample string");
		
		// make an iterator from the ArrayList and print the first value
		Iterator<String> iterator = arrayList.iterator();
		String s = iterator.next();
		System.out.println(s + "\n\n");
		
		// remove the second element
		arrayList.remove(1);
		
		// print the full array
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));
	}
	
}

/*
 * Sample Output:

Another sample string


Another sample string
One more sample string

 */