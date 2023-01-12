package stringmanipulation;

public class SubstringTest {

	public static void main(String[] args) {
		String s = new String("SachinTendulkar");
		s.substring(5);	

		System.out.println(s);
		String s2 = s.substring(6, 15);
		System.out.println(s2);
		String s3 = s2.substring(3);
		System.out.println(s3);
	}
}