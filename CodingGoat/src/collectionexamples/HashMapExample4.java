package collectionexamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample4 {

	public static void main(String[] args) {

		// Convert a HashMap into an ArrayList:
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("India", "New Delhi");
		hm1.put("USA", "Washington DC");
		hm1.put("UK", "London");

		ArrayList<String> keysList = new ArrayList<String>(hm1.keySet());
		ArrayList<String> valuesList = new ArrayList<String>(hm1.values());

		// Iterating the elements of the ArrayList:

		Iterator<String> keysIterator = keysList.iterator();
		while (keysIterator.hasNext()) {
			String key = keysIterator.next();
			System.out.println(key);
		}

		System.out.println("===");
		for (int i = 0; i < valuesList.size(); i++) {
			System.out.println(keysList.get(i));
		}

	}

}
