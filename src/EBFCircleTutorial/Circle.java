package EBFCircleTutorial;

public class Circle {
	
	// makes a circle that can return
	// area and perimeter with a given radius
	
	// radius of circle
	private double radius;
	
	public Circle(double r) {
		// set the radius
		radius = r;
	}
	
	// returns area
	public double area() {
		return radius * radius * Math.PI;
	}
	
	// returns circumference
	public double circumference() {
		return 2 * Math.PI * radius;
	}
	
	// returns diameter
	public double diameter() {
		return radius * 2;
	}
	
	// sets the radius
	public void setRadius(double r) {
		radius = r;
	}

}
