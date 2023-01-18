package collectionexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import abstractionconcept.A;

public class HashMapExample1 {

	public static void main(String[] args) {

		// 1. Creating a HashMap:

		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("Sri Lanka", "Colombo");

		// Fetching an element from the HashMap:
		String capitalName = capitalMap.get("India");
		System.out.println("Capital of the country is " + capitalName);

		// 2. Iterate the elements of the HashMap:

		// a. Using keySet():

		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("Key=" + key +"\t Value=" + capitalMap.get(key));
		}

		System.out.println("==============================================");

		// b. Using EntrySet:

		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();

		while (it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			String key1 = entry.getKey();
			String value1 = entry.getValue();
			System.out.println("Key=" + key1 + "\t Value=" + capitalMap.get(key1));

		}

		System.out.println("==============================================");

		// c. Using lambda function:

		capitalMap.forEach((k, v) -> System.out.println("Key=" + k + "Value=" + v));

		// 3. Removing an element from HashMap:
		capitalMap.remove("Sri Lanka");

	}

}
