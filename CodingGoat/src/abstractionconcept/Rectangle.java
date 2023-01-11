package abstractionconcept;

public class Rectangle implements Perimeter {

	@Override
	public void msg() {

		System.out.println("Perimeter of rectangle");

	}

	public static void main(String[] args) {
		Perimeter p = new Rectangle();
		p.msg();
		int perimeter = Perimeter.peri(20, 30);
		System.out.println(perimeter);
	}
}