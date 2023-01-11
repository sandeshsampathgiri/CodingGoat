package encapsulationconcept;

public class Mensuration {

	public double x, y, r;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double areaRec() {
		double area = x * y;
		return area;
	}

	public double perRec() {
		double per = 2 * (x + y);
		return per;
	}

	public double areaCircle() {
		double area = 3.14 * r * r;
		return area;
	}

	public double circumCircle() {
		double circumference = 2 * 3.14 * r;
		return circumference;
	}

}
