package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListOperations {

	public static void main(String[] args) {

		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		ArrayList<String> countries1 = new ArrayList<String>(Arrays.asList("India", "USA", "UK", "Australia", "Nepal"));

		// 1. Adding a new element to the ArrayList:
		numbers1.add(11);
		countries1.add("Bhutan");

		// Finding the size of the ArrayList:
		System.out.println(numbers1.size());
		System.out.println(countries1.size());

		// Removing an element from the ArrayList:
		numbers1.remove(4);
		countries1.remove(4);
		System.out.println(numbers1);
		System.out.println(countries1);

		// Cloning an ArrayList:
		ArrayList<Integer> numbers2 = (ArrayList<Integer>) numbers1.clone();
		ArrayList<String> countries2 = (ArrayList<String>) countries1.clone();

		System.out.println(numbers2);
		System.out.println(countries2);

		// Check if an element exists in the ArrayList:
		numbers2.contains(3);
		countries2.contains("India");
		numbers2.containsAll(numbers1);
		countries2.containsAll(countries1);

		// Remove the elements from an ArrayList based on a condition:
		numbers2.removeIf(ele -> ele % 2 == 0);
		System.out.println(numbers2);

		countries2.removeIf(ele -> ele.equalsIgnoreCase("Bhutan"));
		System.out.println(countries2);

		// Clear all the elements from an ArrayList:
		numbers2.clear();
		countries2.clear();

		// Adding all the elements of an ArrayList into another ArrayList:
		numbers2.addAll(numbers1);
		countries2.addAll(countries1);
		numbers2.addAll(numbers1);
		countries2.addAll(countries1);

		// Create a sublist from an existing ArrayList:
		List<Integer> numbers3 = numbers2.subList(2, 4);
		List<String> countries3 = countries2.subList(1, 4);
		System.out.println(numbers3);
		System.out.println(countries3);

		// Converting an array into an ArrayList:
		ArrayList<Integer> numbers4 = new ArrayList<Integer>(Arrays.asList(11, 22, 33, 44, 55));
		ArrayList<String> countries4 = new ArrayList<String>(
				Arrays.asList("Japan", "Korea", "Iceland", "Russia", "Poland"));

		// Converting an ArrayList into an array:
		Object[] numArray = numbers4.toArray();

		for (Object oo : numArray) {
			System.out.println((Integer) oo);
		}

		Object[] countriesArray = countries4.toArray();

		for (Object oc : countriesArray) {
			System.out.println((String) oc);
		}
	}

}
