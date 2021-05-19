package Module14;

public class Employee extends Person {

	private static int nextId = 1;
	private int id;

	public Employee(String theName) {
		super(theName);
		id = nextId;
		nextId++;
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Mark ");
		System.out.print(emp.getName());
		System.out.println(emp.getId());
	}
}
