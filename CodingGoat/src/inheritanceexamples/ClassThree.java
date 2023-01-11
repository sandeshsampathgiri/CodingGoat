package inheritanceexamples;

public class ClassThree {

	public static void main(String[] args) {
	
		//Case 1:
		ClassOne cone = new ClassOne();
		System.out.println(cone.a);
		cone.m1();
		cone.m2();
		//System.out.println(cone.bb);
		
		System.out.println("=================================================");
		
		//Case 2:
		ClassTwo ctwo =  new ClassTwo();
		System.out.println(ctwo.a);
		System.out.println(ctwo.b);
		System.out.println(ctwo.c);
		System.out.println(ctwo.bb);
		ctwo.m1();
		ctwo.m2();
		ctwo.m3();
		
		System.out.println("=================================================");
		
		//Case 3:
		ClassOne mixed = new ClassTwo();
		System.out.println(mixed.a);
		System.out.println(mixed.b);
		//System.out.println(mixed.bb);
		System.out.println(mixed.c);		
		mixed.m1();
		mixed.m2();
		//mixed.m3();
		
	}

}
