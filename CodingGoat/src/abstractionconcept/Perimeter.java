package abstractionconcept;

public interface Perimeter {

	void msg();

	static int peri(int a, int b) {
		return 2 * (a + b);
	}
}
