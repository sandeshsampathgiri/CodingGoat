package exceptionhandling;

public class TryReturnTest1 {
	
	int m1()
	{
		try {
			System.out.println("I am in try block");
			//return 50;
		}
		catch(Exception e)
		{
			System.out.println("I am in catch block");
		}
		return 50;
	}

	public static void main(String[] args) {
		
		TryReturnTest1 t = new TryReturnTest1();
		System.out.println(t.m1());
	}
}