package exceptionhandling;

public class TryReturnTest4 {

	int m1() {
		try {
			System.out.println("I am in try block");
			int x = 10 / 0;
			return 50;
		} catch (ArithmeticException ae) {
			System.out.println("I am in catch block");
		}
		return 20;
	}

	public static void main(String[] args) {

		TryReturnTest4 t = new TryReturnTest4();
		System.out.println(t.m1());
	}
}