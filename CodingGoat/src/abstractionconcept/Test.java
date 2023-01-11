package abstractionconcept;

public interface Test {

	void m1(); // Normal abstract method

	default void m2() // Default method
	{
		// Default implementation
		// Note: default keyword is not same as the default method
	}
}