package setinterface;
import java.util.LinkedHashSet;

public class LinkedHashSetCustomObject {

	String name;
	String sName;
	int id;

	public LinkedHashSetCustomObject(String name, String sname, int id) {
		this.name = name;
		this.sName = sname;
		this.id = id;
	}

	public static void main(String[] args) {

		LinkedHashSetCustomObject lhso1 = new LinkedHashSetCustomObject("Sandesh", "Sandy", 1);
		LinkedHashSetCustomObject lhso2 = new LinkedHashSetCustomObject("Amar", "Amar", 2);
		LinkedHashSetCustomObject lhso3 = new LinkedHashSetCustomObject("Anthony", "Anty", 3);

		LinkedHashSet<LinkedHashSetCustomObject> ref1 = new LinkedHashSet<LinkedHashSetCustomObject>();
		ref1.add(lhso1);
		ref1.add(lhso2);
		ref1.add(lhso3);

		for (LinkedHashSetCustomObject l : ref1) {
			System.out.println(l.name + "\t" + l.sName + "\t" + l.id);
		}
	}
}