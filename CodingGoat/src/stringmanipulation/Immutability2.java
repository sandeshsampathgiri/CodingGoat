package stringmanipulation;

public class Immutability2 {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = "Hello";

		str3 = "World";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("===============================");
		
		int a=10,b=10,c=10,d=10;
		
		d++;
		System.out.println(a);
		
		
		
	}

}
