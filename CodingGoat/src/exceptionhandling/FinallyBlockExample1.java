package exceptionhandling;

public class FinallyBlockExample1 {

	public static void main(String[] args) {

		int a = 20, b = 30;
		try {
			int sum = a + b;
			System.out.println("Sum=" + sum);
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("Finally block must be executed");

		}

		System.out.println("Hello Java");
	}
}