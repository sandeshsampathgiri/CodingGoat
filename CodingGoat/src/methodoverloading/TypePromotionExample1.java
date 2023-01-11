package methodoverloading;

public class TypePromotionExample1 {

	static void m1(double a) {
		System.out.println("double-arg");
	}

	static void m1(int a) {
		System.out.println("int-arg");
	}

	public static void main(String[] args) {

		m1(2);
		m1(1.5f);

	}
}
