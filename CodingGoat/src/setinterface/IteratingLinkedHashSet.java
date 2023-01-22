package setinterface;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratingLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("New York");
		lhs.add("Dhanbad");
		lhs.add("Sydney");
		lhs.add("Cape Town");
		lhs.add("London");

		System.out.println("Iteration using iterator");
		Iterator<String> it = lhs.iterator();
		while (it.hasNext()) {
			String cityName = it.next();
			System.out.print(cityName+"\t");
		}
		
		System.out.println();
		System.out.println("Iterating the elements of the LinkedHashSet using enhanced for loop:");
		for (String city : lhs) {
			System.out.print(city+"\t");
		}
	}
}