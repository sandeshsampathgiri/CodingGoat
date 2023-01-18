package exceptionhandling;

public class TryCatchEx4 {

	public static void main(String[] args) {

		int x = 100, y = 0;

		try {
			System.out.println("111");
			int z = x / y;
			System.out.println("Result of z: " + z);
		} catch (ArithmeticException ae) {
			System.out.println("Hello Java");
		}
		
		System.out.println("333");
	}
}