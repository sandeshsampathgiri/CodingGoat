package exceptionhandling;

public class CatchReturn1 {

	int m1() {
		try {
			System.out.println("I am in try block");
		} catch (Exception e) {
			System.out.println("I am in catch block");
			return 30;
		}

		return 100;
	}

	public static void main(String[] args) {
		
		CatchReturn1 c = new CatchReturn1();
		System.out.println(c.m1());
	}
}