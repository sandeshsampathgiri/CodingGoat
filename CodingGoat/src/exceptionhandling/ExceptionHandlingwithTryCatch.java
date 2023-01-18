package exceptionhandling;

public class ExceptionHandlingwithTryCatch {

	public static void main(String[] args) {

		System.out.println("One");
		System.out.println("Two");
		try {
			System.out.println("Before divide");
			int a = 1 / 0;
			System.out.println("After divide");
		}

		catch (ArithmeticException e) {
			System.out.println("A number cannot be divided by zero.");
			// User-friendly message
		}

		System.out.println("Three");
		System.out.println("Four");
	}

}