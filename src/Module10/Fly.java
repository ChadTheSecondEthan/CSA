package Module10;

/*
 * A class for implementing a fly
 */
public class Fly {
	
	// instance variables
	private double x, y, z;
	private boolean alive;
	
	// a constructor for making a new fly
	public Fly() {
		
		// initialize each variable to a random number from -10 to 10
		x = Math.random() * 20 - 10;
		y = Math.random() * 20 - 10;
		z = Math.random() * 20 - 10;
		
		alive = true;
	}
	
	// moves the fly a certain distance
	public void move() {
		
		// add a random number from -1 to 1 to each
		x += Math.random() * 2 - 1;
		y += Math.random() * 2 - 1;
		z += Math.random() * 2 - 1;
		
		clampLocation();
		
	}
	
	// checks the distance from all flies in the array
	public void checkDistance(Fly[] flies) {
		
		for (int i = 0; i < flies.length; i++) {
			
			// check if the other fly is alive and the flies are different and if the 
			// square distance to the other fly is less than one
			if (flies[i].isAlive() && flies[i] != this && flies[i].sqrDistanceTo(this) < 1) {
				
				System.out.println("A fly has died");
				
				alive = false;
				return;
			}
		}
	}
	
	// returns the square of the distance to another fly 
	// (to reduce time since taking the square root of a number is very slow)
	double sqrDistanceTo(Fly other) {
		double sqrX = Math.pow(other.x - x, 2);
		double sqrY = Math.pow(other.y - y, 2);
		double sqrZ = Math.pow(other.z - z, 2);
		return sqrX + sqrY + sqrZ;
	}
	
	// clamps the location to -20 to 20 so it doesn't fly super far away
	void clampLocation() {
		x = clamp(x, -20, 20);
		y = clamp(y, -20, 20);
		z = clamp(z, -20, 20);
	}
	
	// clamps a value between a min and a max
	double clamp(double value, double min, double max) {
		if (value > max) return max;
		if (value < min) return min;
		return value;
	}
	
	// getters
	public boolean isAlive() { return alive; }
	public String getLocationAsString() {
		return String.format("X: %.2f, Y: %.2f, Z: %.2f", x, y, z);
	}

}
