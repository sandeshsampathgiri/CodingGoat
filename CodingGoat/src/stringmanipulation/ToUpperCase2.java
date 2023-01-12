package stringmanipulation;

public class ToUpperCase2 {

	public static void main(String[] args) {
		String s = new String("science");
		String s2 = "science";
		String s3 = s.toUpperCase();
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
	}
}