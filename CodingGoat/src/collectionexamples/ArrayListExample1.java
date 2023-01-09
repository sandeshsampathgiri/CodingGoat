package collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);

		// Accessing the elements of the ArrayList using for loop:
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=====================================================");
		// Accessing all the elements of the ArrayList using for each loop:
		for (Integer i : al) {
			System.out.println(i);
		}

		System.out.println("=====================================================");
		// Accessing all the elements of the ArrayList using iterator:
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("=====================================================");
		// Accessing the elements of the ArrayList using lambda:
		al.stream().forEach(ele -> System.out.println(ele));

	}

}
