package exceptionhandling;

public class TryCatchReturn2 {

	int m1() {
		try {
			System.out.println("I am in try block");
			return 50;
		} catch (Exception e) {
			System.out.println("I am in catch block");
			return 30;
		}

		//System.out.println("Method at end"); // Unreachable code. So, compile time error will occur.

	}

	public static void main(String[] args) {

		TryCatchReturn2 t = new TryCatchReturn2();
		System.out.println(t.m1());
	}
}