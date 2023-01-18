package exceptionhandling;

public class FinallyReturn1 {
	
	int m1()
	 {
	 try {
	   System.out.println("I am in try block");
	   return 30;
	} finally {
		System.out.println("I am in finally block");
		return 50;
	  }
	 }

	public static void main(String[] args) {
		
		FinallyReturn1 fr = new FinallyReturn1();
		System.out.println(fr.m1());
			}
}