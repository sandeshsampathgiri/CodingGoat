package starpatternprograms;

public class PrintPyramid {

	public static void main(String[] args) {

		int rows = 5;

		// Outer loop to traverse through the list of all the rows
		for (int i = 1; i <= rows; i++) {
			// Inner loop to traverse through the list of all the decreasing spaces
			for (int j = rows; j >= i; j--) {
				System.out.print(" ");
			}

			// Inner loop to traverse through the list of all the stars
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
