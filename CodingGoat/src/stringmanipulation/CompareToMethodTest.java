package stringmanipulation;

public class CompareToMethodTest {

	public static void main(String args[]) {
		String s1 = "mumbai";
		String s2 = "mumbai";
		String s3 = "ranchi";
		String s4 = "pune";
		String s5 = ""; // Empty string.
		System.out.println(s1.compareTo(s2)); // 0 because both are equal.
		System.out.println(s1.compareTo(s3)); // -5 because ‘m’ is 5 times lower than ‘m’.
		System.out.println(s1.compareTo(s4)); // -3 because ‘m’ is 3 times lower than ‘p’.
		System.out.println(s3.compareTo(s4)); // 2 because ‘r’ is 2 times greater than ‘p’.
		System.out.println(s4.compareTo(s5)); // 4 because there is 4 characters in pune whereas empty string has no
												// characters.
	}
}