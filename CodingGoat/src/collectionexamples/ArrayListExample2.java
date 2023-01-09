package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		ArrayList<Integer> num1 = new ArrayList();
		num1.add(1);
		num1.add(2);
		num1.add(3);

		// Cloning an ArrayList:
		ArrayList<Integer> newList = (ArrayList<Integer>) num1.clone();

		newList.stream().forEach(ele -> System.out.println(ele));

		// Cloning an ArrayList of the type String:
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("India", "USA", "UK"));

		List<String> countries = (List<String>) names.clone();

		// Iterating the elements of the ArrayList using for loop:
		for (int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i));
		}
		
		System.out.println("================================================================================");

		// Iterating the elements of the ArrayList using for each loop:
		for (String c : countries) {
			System.out.println(c);
		}
		
		System.out.println("================================================================================");

		// Iterating the elements of the ArrayList using Iterator:
		Iterator<String> it = countries.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("================================================================================");

		// Iterating the elements of the ArrayList using Lambda:
		countries.stream().forEach(ele -> System.out.println(ele));
		
		Object[] abc = countries.toArray();
		System.out.println(Arrays.toString(abc));

	}

}
