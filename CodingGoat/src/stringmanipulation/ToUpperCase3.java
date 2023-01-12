package stringmanipulation;

import java.util.Locale;

public class ToUpperCase3 {

	public static void main(String[] args) {
		String s = new String("country");
		String german = s.toUpperCase(Locale.forLanguageTag("gr"));
		String english = s.toUpperCase(Locale.forLanguageTag("en"));
		System.out.println(german);
		System.out.println(english);
	}
}