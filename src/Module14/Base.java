package Module14;

/*
 * Author: Ethan Fisher
 * Date: 3/29/2021
 * School: Franklin Academy HS
 * Base Program
 * 
 * Description: Inheriting and modifying classes and superclasses
 * Difficulties: Accessing the superclasses' methods
 * Learned: You can use the super keyword to access the superclasses' methods
 */

public abstract class Base {
	
	public void methodOne() {
		System.out.print("A");
		methodTwo();
	}
	
	public void methodTwo() {
		System.out.print("B");
	}
	
	public static void main(String[] args) {
		
		Base b = new Derived();
		b.methodOne();
		
	}

}

/**
 * The overriden methods methodOne and methodTwo use
 * the keyword super to execute the superclass's methodOne
 * and methodTwo before adding its own implementation
 */
class Derived extends Base {
	
	public Derived() {}
	
	@Override
	public void methodOne() {
		super.methodOne();
		System.out.print("C");
	}
	
	@Override
	public void methodTwo() {
		super.methodTwo();
		System.out.print("D");
	}
	
}

/**
 * Sample Output:
 * 
 * ABDC
 * 
 */
