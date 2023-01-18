package collectionexamples;

import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class HashMapExample3 {

	public static HashMap<String, String> map2;

	static {
		map2 = new HashMap<String, String>();
	}

	public static void main(String[] args) {

		// 1. Creating a HashMap using the normal way:
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("India", "New Delhi");
		map1.put("USA", "Washington DC");
		map1.put("UK", "London");

		// 2. Creating the hashmap within a static block:

		map2.put("India", "New Delhi");
		map2.put("USA", "Washington DC");
		map2.put("UK", "London");

		// 3. Creating a HashMap with a single entry only:

		HashMap<String, String> map3 = new HashMap<String, String>(Collections.singletonMap("India", "New Delhi"));
		map3.put("India", "New Delhi");
		map3.put("USA", "Washington DC");
		map3.put("UK", "London");

		// 4. Creating a HashMap using stream:

		/*
		 * HashMap<String,String> map4 = Stream.of(new String[][] {
		 * {"India","New Delhi"},{"USA","Washington DC"},{"Russia","Moscow"}})
		 * .collect(data->data[0],data->data[1]);
		 */

	}

}
