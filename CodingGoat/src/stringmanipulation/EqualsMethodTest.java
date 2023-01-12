package stringmanipulation;

public class EqualsMethodTest {

	public static void main(String args[]) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Good bye");
		String s4 = new String("Hello");
		System.out.println(s1.equals(s2)); // true because content and case is same.
		System.out.println(s1.equals(s3)); // false because content is different.
		System.out.println(s1.equals(args)); // false.
		System.out.println(s1.equals(null)); // false.
		if (s2.equals(s4)) {
			System.out.println("Both strings are equal");
		} else
			System.out.println("Both strings are not equal");
	}
}