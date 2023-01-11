package abstractionconcept;

public class BB implements AA {

	@Override
	public void m1() {
		System.out.println("m1-AA");

	}

	public static void main(String[] args) {
		AA obj = new BB();
		obj.m1();
		obj.m2();
	}
}