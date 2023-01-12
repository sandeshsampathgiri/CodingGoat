package stringmanipulation;

public class DoubleEqualOperatorTest {

	public static void main(String args[]) {
		String s1 = "Cricket";
		String s2 = "Cricket";
		String s3 = new String("Cricket");
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
	}
}