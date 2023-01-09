package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInAnArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 9, 10, 3, 4, 5, 7));
		ArrayList<String> names = new ArrayList<String>(
				Arrays.asList("Amar", "Akbar", "Sandesh", "Naveen", "Anthony", "Akbar", "Amar"));

		// Cloning the arraylist for future usage:
		ArrayList<Integer> clonedNumbers = (ArrayList<Integer>) numbers.clone();
		ArrayList<String> clonedNames = (ArrayList<String>) names.clone();

		System.out.println("Cloned Numbers=" + clonedNumbers);
		System.out.println("Cloned Names=" + clonedNames);

		ArrayList<Integer> finalNumbersList = removeDuplicateNumbers(clonedNumbers);
		ArrayList<String> finalStringList = removeDuplicateStrings(clonedNames);

		System.out.println("Final Number List=" + finalNumbersList);
		System.out.println("Final String List=" + finalStringList);

	}

	public static ArrayList<Integer> removeDuplicateNumbers(ArrayList alList) {
		Set<Integer> s1 = new LinkedHashSet<Integer>(alList);
		ArrayList<Integer> newList = new ArrayList<Integer>(s1);

		return newList;

	}

	public static ArrayList<String> removeDuplicateStrings(ArrayList alList) {
		Set<String> s1 = new LinkedHashSet<String>(alList);
		ArrayList<String> newList = new ArrayList<String>(s1);

		return newList;

	}

}
