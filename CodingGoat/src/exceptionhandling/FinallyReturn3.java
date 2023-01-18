package exceptionhandling;

public class FinallyReturn3 {

	@SuppressWarnings("finally")
	int m1() {
		int a = 20, b = 0;
		try {
			System.out.println("I am in try block");
			int c = a / b;
			System.out.println("Result: " + c);
		} catch (ArithmeticException ae) {
			System.out.println("I am in catch block");
			return 40;
		} finally {
			System.out.println("I am in finally block");
			return 50;
		}
		//System.out.println("Statement after finally block");
	}

	public static void main(String[] args) {
		FinallyReturn3 obj = new FinallyReturn3();
		System.out.println(obj.m1());
	
	}
}