package Module9;

/*
 * Author: Ethan Fisher
 * Date: 1/10/2021
 * 
 * Implements an Employee class
 */

public class Employee {
	
	// instance variables
	private int id;
	private double payRate;
	private int hours;
	private double gross;
	
	/**
	 * Normal Constructor for the Employee object.
	 */
	public Employee(int id, double payRate, int hours) {
		// initialize instance variables
		this.id = id;
		this.payRate = payRate;
		this.hours = hours;
		
		calculatePay();
	}
	
	/**
	 * calculates gross pay
	 */
	public void calculatePay() {
		
		// temporary variable for number of hours
		int hours = this.hours;
		
		// pay up to 40 hours
		gross = hours * payRate;
		hours -= 40;
		
		// calculate 40+ hours pay
		if (hours > 0) {
			gross += 0.5 * hours * payRate;
			
			hours -= 10;
			
			// calculate 50+ hours pay
			if (hours > 0) {
				gross += 0.5 * hours * payRate;
			}
		}
	}
	
	/**
	 * @return a string containing information about the employee
	 */
	public String toString() {
		return String.format("ID: %d, Pay Rate: $%.2f, "
				+ "Hours Worked: %d, Gross Pay: $%.2f", 
				id, payRate, hours, gross);
	}
	
	/*********************** Accessors (getters) *********************/
	
	public int getId() { return id; }
	public double getPayRate() { return payRate; }
	public double getGross() { return gross; }
	public int getHours() { return hours; }
	
	/*********************** Mutators (setters) **********************/
	
	public void setId(int id) { this.id = id; }
	public void setPayRate(double payRate) { this.payRate = payRate; }
	public void setHours(int hours) { this.hours = hours; }
	
}
