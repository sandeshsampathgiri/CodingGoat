package exceptionhandling;

public class CheckedExceptionEx1 {

	public static void main(String[] args) {

		System.out.println("Hello Java");
		// Here, main thread paused for specified amount of time. 
		// Compilation error.
		//Thread.sleep(1000);
	}
}