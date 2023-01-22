package setinterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>(); // An empty hash set.

		// Adding elements to HashSet.
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fifth");

		set.add("First");
		set.add("Third");

		set.add(null);
		set.add(null); // Ignored.
		System.out.println("Unordered and No Duplicate HashSet Elements");
		System.out.println(set);
	}
}