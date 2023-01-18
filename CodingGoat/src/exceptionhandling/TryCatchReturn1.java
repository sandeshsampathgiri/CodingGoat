package exceptionhandling;

public class TryCatchReturn1 {

	int m1() {
		try {
			System.out.println("I am in try block");
			return 50;
		} catch (Exception e) {
			System.out.println("I am in catch block");
			return 30;
		}
	}

	public static void main(String[] args) {

		TryCatchReturn1 t = new TryCatchReturn1();
		System.out.println(t.m1());
	}
}