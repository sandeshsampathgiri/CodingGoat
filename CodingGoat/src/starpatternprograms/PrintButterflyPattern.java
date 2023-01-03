package starpatternprograms;

public class PrintButterflyPattern {

	public static void main(String[] args) {

		int rows = 4;

		// Outer loop to traverse through all the rows of the 1st rectangle
		for (int i = 1; i <= rows; i++) {

			// 1. Inner loop to print the stars at increasing order of the 1st triangle at
			// each row
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// 2. Inner loop to print spaces at each row(related to 1st triangle)
			for (int j = rows; j >= i; j--) {
				System.out.print("  ");
			}

			// 3. Inner loop to print spaces in the decreasing order of the 3rd triangle at
			// each row
			for (int j = rows; j >= i; j--) {
				System.out.print("  ");
			}

			// 4. Inner loop to print stars in the increasing order of the 3rd triangle at
			// each row
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}

		for (int i = 1; i <=rows; i++) {

			// 1. Inner loop to traverse through the list of all the stars at each row:
			for (int j = rows; j >= i; j--) {
				System.out.print("* ");
			}

			// 2. Inner loop to print through the list of spaces near the 3rd triangle:
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}

			// 3.Inner loop to print through the list of spaces near the 3rd triangle:
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}

			// 4. Inner loop to print through the list of stars near the 4th triangle:
			for (int j = rows; j >= i; j--) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}

}
