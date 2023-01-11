package abstractionconcept;

public interface AA {
	
	void m1();
	
	default void m2()
	{
		System.out.println("Default method");
	}
}