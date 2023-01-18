package exceptionhandling;

public class TryReturnTest3 {

	int m1() {
		try {
			System.out.println("I am in try block");
			return 50;
		} catch (Exception e) {
			System.out.println("I am in catch block");
		}

		return 20;
		//System.out.println("Statement after return");

	}

	public static void main(String[] args) {

		TryReturnTest3 t = new TryReturnTest3();
		System.out.println(t.m1());

	}
}