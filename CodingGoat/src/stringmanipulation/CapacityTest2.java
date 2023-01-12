package stringmanipulation;

public class CapacityTest2 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Tech");
		int length = sb.length();
		int capacity = sb.capacity();

		System.out.println("Length=" + length);
		System.out.println("Capacity=" + capacity);

	}
}