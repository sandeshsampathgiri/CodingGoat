package collectionexamples;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample2 {

	public static void main(String[] args) {

		HashMap<String, String> capitalMap1 = new HashMap<String, String>();
		capitalMap1.put("India", "New Delhi");
		capitalMap1.put("USA", "Washington DC");
		capitalMap1.put("UK", "London");

		HashMap<String, String> capitalMap2 = new HashMap<String, String>();
		capitalMap2.put("India", "New Delhi");
		capitalMap2.put("USA", "Washington DC");
		capitalMap2.put("UK", "London");
		capitalMap2.put("Sri Lanka", "Colombo");

		HashMap<String, String> capitalMap3 = new HashMap<String, String>();
		capitalMap3.put("India", "New Delhi");
		capitalMap3.put("USA", "Washington DC");
		capitalMap3.put("UK", "London");
		capitalMap3.put("India", "Mumbai");
		capitalMap3.put("Sri Lanka", "Colombo");

		// 1. Compare two hashmaps based on keys:

		System.out.println(capitalMap1.keySet().equals(capitalMap2.keySet()));

		System.out.println("===");

		System.out.println(capitalMap1.values());
		System.out.println(capitalMap2.values());

		System.out.println("===");

		// 2. Compare two HashMaps based on values:
		System.out.println(capitalMap1.values().equals(capitalMap2.values()));
		System.out.println(capitalMap1.values().equals(capitalMap3.values()));
		System.out.println(capitalMap2.values().equals(capitalMap3.values()));

		System.out.println("===");

		// 3. Find out the extra key:

		HashSet<String> hashSet = new HashSet<String>(capitalMap1.values());
		hashSet.addAll(capitalMap3.values());
		hashSet.removeAll(capitalMap1.values());
		System.out.println(hashSet);

	}

}
