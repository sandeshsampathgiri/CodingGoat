package programs;

public class ExecutionOrder {

	// Non-static Variables
	String employeeName;
	int age;

	// Static Variable
	static boolean isIndian = true;

	public static void main(String[] args) {

		ExecutionOrder eo = new ExecutionOrder();
		eo.addTwoNumbersNonStatic();
		addTwoNumbersStatic();
	}

	// Static Block
	static {
		System.out.println("This is a static block");
	}
	
	//Instance Block
	{
		System.out.println("This is an instance block");
	}

	// Constructor
	ExecutionOrder() {
		System.out.println("This is a default constructor");
	}

	public static void addTwoNumbersStatic() {
		int a = 1, b = 2;
		int c = a + b;
		System.out.println("Addition from static method");
	}

	public void addTwoNumbersNonStatic() {
		int a = 1, b = 2;
		int c = a + b;
		System.out.println("Addition from non-static method");
	}

}
