package setinterface;
import java.util.LinkedHashSet;

public class RemoveDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> set1 = new LinkedHashSet<String>();

		// Adding elements in the linked hash set.
		set1.add("A");
		set1.add("G");
		set1.add("Y");
		set1.add("B");
		set1.add("O");
		set1.add(null);

		System.out.println("Elements in set: " + set1);

		// Remove a string element from linked hash set.
		set1.remove(null);
		System.out.println("Elements in set after removing: " + set1);
		System.out.println(set1.size() + " elements in set1");

		// Create another linked hash set of String type.
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("S");
		set2.add(null);
		System.out.println("Elements in set2: " + set2);
		System.out.println(set2.size() + " elements in set2");

		System.out.println("Is S in set2? " + set2.contains("S"));
		set1.addAll(set2);
		System.out.println("Elements in set1 after adding: " + set1);

		set1.removeAll(set2);
		System.out.println("Elements in set1 after removing set2: " + set1);

		set1.retainAll(set2);
		System.out.println("After removing common elements in set2 " + "from set1, set1 is " + set1);
	}
}