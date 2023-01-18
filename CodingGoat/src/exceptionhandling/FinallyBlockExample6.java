package exceptionhandling;

public class FinallyBlockExample6 {

	public static void main(String[] args) {

		try {
			System.out.println("111");
			System.out.println(20 / 0);
			System.out.println("222");
		} catch (ArithmeticException e) {
			System.out.println("333");
		}

		finally {
			System.out.println(10 / 0);
		}

		System.out.println("555");
	}
}