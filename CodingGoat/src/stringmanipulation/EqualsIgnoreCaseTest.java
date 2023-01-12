package stringmanipulation;

public class EqualsIgnoreCaseTest {

	public static void main(String args[]) {
		String s1 = "GOOD BYE";
		String s2 = new String("Good bye");
		System.out.println(s1.equals(s2)); // false because content is same but case is different.
		System.out.println(s1.equalsIgnoreCase(s2)); // true.
	}
}