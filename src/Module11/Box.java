package Module11;

public class Box {
	
	private double length, height, depth;

	public Box(double length, double height, double depth) {
		this.length = length;
		this.height = height;
		this.depth = depth;
	}

	public double volume() {
		return length * height * depth;
	}

	// compare this Box to another Box
	int compareTo(Box other) {

		// the difference of the volumes multiplied by 1000
		// so volumes close together won't appear equal
		return (int)((volume() - other.volume()) * 1000);
	}

	public String toString() {
		return ("length: " + length + ",  height: " + height + ",  depth: " + depth + ",  volume: " + volume());
	}

}