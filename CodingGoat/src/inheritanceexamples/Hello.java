package inheritanceexamples;

public class Hello {

	// Instance block
	{
		show();
	}

	// Constructor
	Hello() {
		System.out.println("Hello Constructor");
		show();
	}

	void show() {
		System.out.println("Hello method");
	}

}
