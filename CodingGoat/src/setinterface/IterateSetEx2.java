package setinterface;

import java.util.HashSet;
import java.util.Locale.IsoCountryCode;
import java.util.Set;

public class IterateSetEx2 {

	public static void main(String[] args) {

		Set<String> countries = new HashSet<>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");

		// Iterate the elements of the HashSet using enhanced for loop:
		for (String s : countries) {
			System.out.println(s);
		}

		// Removing an element from the HashSet based on a condition:
		if (countries.contains("UK")) {
			countries.remove("UK");
		}

		System.out.println("Final collection=" + countries);
	}

}