package stringmanipulation;

public class CapacityTest {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		int length = sb.length();
		int capacity = sb.capacity();

		System.out.println("Before adding any character");
		System.out.println("Length=" + length); // length is 0
		System.out.println("Default Capacity=" + capacity); // Default capacity is 16

		sb.append("abcdefghijklmnop");

		System.out.println("After adding 16 characters");
		System.out.println("Length=" + sb.length()); // Now length is 16
		System.out.println("Capacity= " + sb.capacity()); // Capacity is 16

		sb.append("q");
		System.out.println("After adding 17th character");
		System.out.println("Length= " + sb.length()); // length is 17
		System.out.println("Capacity= " + sb.capacity()); // Capacity is (16+1)*2=34

		// Add 17 characters in the existing object.
		sb.append("abcdefghijklmnopq");
		// 17 characters. So total=34 characters.
		System.out.println("Length=" + sb.length()); // Now length is 34
		System.out.println("Capacity= " + sb.capacity()); // Capacity is 34

		sb.append("r");
		System.out.println("Length=" + sb.length()); // Now length is 35
		System.out.println("Capacity= " + sb.capacity()); // Capacity is 70(34+1)*2

	}
}








