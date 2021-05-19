package Module15;

public class Cereal {
	
	private String name;
	private int sugar;
	private float fiber;

	public Cereal(String name, int sugar, float fiber) {
		this.name = name;
		this.sugar = sugar;
		this.fiber = fiber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public float getFiber() {
		return fiber;
	}

	public void setFiber(float fiber) {
		this.fiber = fiber;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Sugar: " + sugar + " grams, Fiber: " + fiber + " grams";
 	}

}
