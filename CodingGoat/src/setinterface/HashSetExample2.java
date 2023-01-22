package setinterface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");

		// Adding duplicate elements.
		al.add("Monday");
		al.add("Friday");
		System.out.println("Original Elements Order ");
		System.out.println(al);

		HashSet<String> hset = new HashSet<String>();

		hset.addAll(al);
		System.out.println("Unordered HashSet Elements without Duplicate elements");
		System.out.println(hset);
	}
}