package abstractionconcept;

public class Engineer extends Employee {

	public Engineer(String name, int id) {
		super(name, id);
	}

	public static void main(String[] args) {

		Engineer e = new Engineer("Deep", 10202);
		e.m1();
	}
}