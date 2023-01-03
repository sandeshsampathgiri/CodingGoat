package starpatternprograms;

public class PrintRightTriangle {

	public static void main(String[] args) {

		int rows = 5;

		// Outer loop for traversing through all the rows
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
