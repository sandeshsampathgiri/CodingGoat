package exceptionhandling;

public class TryCatchEx6 {

	public static void main(String[] args) {
		try {
			System.out.println("111");
			System.out.println("222");
		} catch (ArithmeticException ae) {
			System.out.println("333");
		}

		System.out.println("444");
	}
}