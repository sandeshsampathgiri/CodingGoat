package setinterface;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class IterateSetEx1 {

	public static void main(String[] args) {

		Set<String> countries = new HashSet<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");

		Iterator<String> it = countries.iterator();
		while (it.hasNext()) {
			Object countryName = it.next();
			System.out.println(countryName.toString());

			if (countries.contains("UK")) {
				it.remove();
			}

		}
	}
}