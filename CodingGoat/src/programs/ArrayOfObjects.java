package programs;

public class ArrayOfObjects {

	int a;
	String countryName = "India";

	ArrayOfObjects() {
		System.out.println("Hello Java");
	}

	public static void main(String[] args) {

		ArrayOfObjects[] aoo = new ArrayOfObjects[3];

		for (int i = 0; i < 3; i++) {
			aoo[i] = new ArrayOfObjects();
		}

	}
}