package methodoverloading;

public class TypePromotionExample2 {

	public void m1(double a) {
		System.out.println(a * a);
	}

	public void m1(float a) {
		System.out.println(a * a);
	}

	public static void main(String[] args) {

		TypePromotionExample2 tpe = new TypePromotionExample2();
		tpe.m1(2);
	}
}
