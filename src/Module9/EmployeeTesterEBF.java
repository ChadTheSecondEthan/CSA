package Module9;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * Author: Ethan Fisher
 * Date: 1/10/2021
 * School: Franklin Academy HS
 * Employee Tester Program
 * 
 * Description: Calculate pay for employees
 * Difficulties: calculating pay after 40 and 50 hours for each employees
 * Learned: Abstracting gross pay calculation to the employee class makes the tester class more simple
 */

public class EmployeeTesterEBF {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// initialize scanner
		File file = new File("employees.txt");
		Scanner input = new Scanner(file);
		
		// the first three lines are the header
		for (int i = 0; i < 3; i++)
			input.nextLine();
		
		while(input.hasNext()) {
			
//			// read the information from the file
			int id = input.nextInt();
			input.nextLine();
			
			double payRate = input.nextDouble();
			input.nextLine();
			
			int hours = input.nextInt();
			input.nextLine();
			
			// create an employee object
			Employee emp = new Employee(id, payRate, hours);
			
			// print the specs
			System.out.println(emp.toString());
		}
		
		// close scanner
		input.close();
		
	}
	
}

/*
 * Sample Output:
 * 
	ID: 213, Pay Rate: $10.50, Hours Worked: 50, Gross Pay: $577.50
	ID: 217, Pay Rate: $11.50, Hours Worked: 30, Gross Pay: $345.00
	ID: 344, Pay Rate: $10.00, Hours Worked: 40, Gross Pay: $400.00
	ID: 324, Pay Rate: $12.30, Hours Worked: 60, Gross Pay: $922.50
	ID: 335, Pay Rate: $15.00, Hours Worked: 30, Gross Pay: $450.00
	ID: 434, Pay Rate: $14.25, Hours Worked: 25, Gross Pay: $356.25
	ID: 343, Pay Rate: $10.00, Hours Worked: 12, Gross Pay: $120.00
	ID: 532, Pay Rate: $10.00, Hours Worked: 34, Gross Pay: $340.00
	ID: 453, Pay Rate: $8.50, Hours Worked: 55, Gross Pay: $552.50
	ID: 323, Pay Rate: $7.25, Hours Worked: 29, Gross Pay: $210.25
	ID: 528, Pay Rate: $10.75, Hours Worked: 56, Gross Pay: $720.25
	ID: 432, Pay Rate: $40.00, Hours Worked: 43, Gross Pay: $1780.00
	ID: 323, Pay Rate: $32.00, Hours Worked: 25, Gross Pay: $800.00
	ID: 530, Pay Rate: $9.75, Hours Worked: 10, Gross Pay: $97.50
	ID: 245, Pay Rate: $8.50, Hours Worked: 30, Gross Pay: $255.00
	ID: 443, Pay Rate: $10.25, Hours Worked: 60, Gross Pay: $768.75
	ID: 123, Pay Rate: $10.00, Hours Worked: 60, Gross Pay: $750.00
 * 
 */
