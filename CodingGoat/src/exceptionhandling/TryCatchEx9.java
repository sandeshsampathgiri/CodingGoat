package exceptionhandling;

public class TryCatchEx9 {

	public static void main(String[] args) {

		try {
			Class c = Class.forName("ArithmeticException");
			// This method returns the Class object associated with the class or interface
			// with the given string name.
		} catch (ClassNotFoundException cn) {
			System.out.println(cn.getMessage());
		}
	}
}