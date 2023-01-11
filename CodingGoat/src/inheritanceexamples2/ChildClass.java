package inheritanceexamples2;

public class ChildClass extends ParentClass{
	
	int x=100;
	int y=500;
	
	@Override
	public void msg()
	{
		System.out.println("Printing from child class");
	}
	
	public void childTest()
	{
		System.out.println("Child class specific method");
	}

}
