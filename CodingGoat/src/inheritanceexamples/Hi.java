package inheritanceexamples;

public class Hi extends Hello{
	
	//Constructor
	Hi()
	{
		System.out.println("Hi constructor");
	}
	
	@Override
	void show()
	{
		System.out.println("Hi method");
	}

}
