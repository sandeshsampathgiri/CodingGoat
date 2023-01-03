package programs;

public class PrintEventNumbersFromOneToFifty {

	public static void main(String[] args) {

		System.out.println("List of even numbers are: ");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i+"\s");
			}
		}

	}

}
