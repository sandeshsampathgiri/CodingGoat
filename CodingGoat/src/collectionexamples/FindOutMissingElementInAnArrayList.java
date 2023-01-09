package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class FindOutMissingElementInAnArrayList {

	public static void main(String[] args) {

		ArrayList<String> names1 = new ArrayList<String>(Arrays.asList("One", "Two", "Three", "Four", "Six", "Seven"));
		ArrayList<String> names2 = new ArrayList<String>(Arrays.asList("One", "Two", "Nine", "Three", "Six", "Eight"));
		// findExtraElementInAnArayList(names1,names2);
		findExtraElementInAnArayList2(names1, names2);

	}

	public static void findExtraElementInAnArayList(ArrayList<String> names1, ArrayList<String> names2) {
		names1.removeAll(names2);
		System.out.println(("Names1=" + names1));
	}

	public static void findExtraElementInAnArayList2(ArrayList<String> names1, ArrayList<String> names2) {
		names2.removeAll(names1);
		System.out.println(("Names1=" + names2));
	}

}
