package exceptionhandling;

public class CheckedExceptionEx2 {

	public static void main(String[] args) {

		System.out.println("Hello Java");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}