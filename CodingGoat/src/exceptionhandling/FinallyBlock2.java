package exceptionhandling;

public class FinallyBlock2 {

	void m1() {
		int a = 20, b = 0;
		try 
		{
			System.out.println("I am in try block");
			System.exit(0);
			int c = a / b;
			System.out.println("Result: " + c);
		} 
		catch (ArithmeticException ae) 
		{
			System.out.println("I am in catch block");
		} finally 
		{
			System.out.println("I am in finally block");
		}
		System.out.println("Statement after finally block");
	}

	public static void main(String[] args) {
		FinallyBlock2 obj = new FinallyBlock2();
		obj.m1();
	}
}