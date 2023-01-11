package inheritanceexamples;

public class Test extends Hi {

	public static void main(String[] args) {

		Hi obj = new Hi();
		obj.show();
		System.out.println("==============================================");
		Hello obj1 = new Hi();
		obj1.show();

	}

}
