package setinterface;
import java.util.LinkedHashSet;

public class AddTest {

	public static void main(String[] args) {

		// Create a Linked hash set of generic type.
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		// Checking the size of LinkedHashSet before adding elements.
		int size = lhs.size();
		System.out.println("Size of LinkedHashSet before adding elements: " + size);

		// Adding elements in the linked hash set.
		lhs.add("Red"); // lhset.size() is 1.
		lhs.add("Green"); // lhset.size() is 2.
		lhs.add("Yellow"); // lhset.size() is 3.
		lhs.add("Blue"); // lhset.size() is 4.
		lhs.add("Orange"); // lhset.size() is 5.

		System.out.println("Elements in Set: " + lhs);
		int size2 = lhs.size();
		System.out.println("Size of LinkedHashSet after adding elements: " + size2);

		// Adding duplicate elements that already exist in set.
		lhs.add("Red"); // lhset.size() is still 5.
		lhs.add("Yellow"); // lhset.size() is still 5.

		// Create another set of String type.
		LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
		lhs1.add("Brown");
		lhs1.add(null);

		// Adding elements of set2 into set1.
		lhs.addAll(lhs1);
		System.out.println("Elements in Set after adding: " + lhs);
	}
}