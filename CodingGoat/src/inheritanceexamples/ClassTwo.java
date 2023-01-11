package inheritanceexamples;

public class ClassTwo extends ClassOne{
	
	int a=30;
	int bb=400;
	
	@Override
	public void m1()
	{
		System.out.println("Child Class-m1");
	}
	
	public void m3()
	{
		System.out.println("Child class-m3");
	}

}
