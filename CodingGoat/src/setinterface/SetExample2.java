package setinterface;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();

		// Check set is empty or not.
		boolean check = s.isEmpty(); // Return type of this method is an boolean.
		System.out.println("Is Set empty: " + check);

		s.add("Orange");
		s.add("Red");
		s.add("Blue");
		if (s.isEmpty()) {
			System.out.println("Set is empty.");
		} else {
			System.out.println("Elements in the Set are:" + s);
		}

		// Remove an element from set.
		s.remove("Blue");
		System.out.println("Set elements after removing" + s);

		// Get the total number of set elements.
		int size = s.size();
		System.out.println("Total number of elements: " + size);
	}
}