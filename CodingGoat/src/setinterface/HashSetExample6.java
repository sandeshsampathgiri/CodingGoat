package setinterface;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample6 {

	String name, sName;
	int id;

	public HashSetExample6(String name, String sName, int id) {

		this.name = name;
		this.sName = sName;
		this.id = id;
	}

	public static void main(String[] args) {

		Set<HashSetExample6> s1 = new HashSet<HashSetExample6>();
		HashSetExample6 hs1 = new HashSetExample6("Sandesh", "Sandy", 17);
		HashSetExample6 hs2 = new HashSetExample6("Amar", "Amar", 27);
		HashSetExample6 hs3 = new HashSetExample6("Anthony", "Anty", 34);

		s1.add(hs1);
		s1.add(hs2);
		s1.add(hs3);

		// Iterating the elements of the HashSet:
		Iterator<HashSetExample6> it = s1.iterator();
		while (it.hasNext()) {

			HashSetExample6 text = it.next();
			System.out.println(text.name + "\t" + text.sName + "\t" + text.id);
		}
	}
}







