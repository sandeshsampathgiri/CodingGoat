package encapsulationconcept;

public class MyTest {

	public static void main(String[] args) {

		Mensuration mens = new Mensuration();
		mens.setX(20.5);
		mens.setY(30.5);
		mens.setR(12.5);

		double areaRec = mens.areaRec();
		double perRec = mens.perRec();
		double areaCircle = mens.areaCircle();
		double circumCircle = mens.circumCircle();

		System.out.println("Area of rectangle=" + areaRec);
		System.out.println("Perimeter of rectangle=" + perRec);
		System.out.println("Area of circle=" + areaCircle);
		System.out.println("Circumference of circle=" + circumCircle);

	}
}