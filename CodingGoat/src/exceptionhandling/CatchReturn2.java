package exceptionhandling;

public class CatchReturn2 {

	int m1() {
		try {
			System.out.println("I am in try block");
			int x = 20 / 0;
			System.out.println("Result=" + x);
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block");
			return 30;
		}

		return 100;
	}

	public static void main(String[] args) {

		CatchReturn2 cr = new CatchReturn2();
		System.out.println(cr.m1());
	}
}