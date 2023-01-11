package abstractionconcept;

public class AbsTest extends AbstractClass {

	AbsTest() {
		System.out.println("AbsTest class constructor");
	}

	@Override
	void msg() {
		System.out.println("Hello Java");
	}

	public static void main(String[] args) {

		AbsTest t = new AbsTest();
		t.msg();
		t.m1();
		t.m2();
		t.m3();
		System.out.println("x=" + t.x);

	}

}