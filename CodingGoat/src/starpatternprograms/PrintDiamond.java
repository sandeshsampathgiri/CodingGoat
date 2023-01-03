package starpatternprograms;

public class PrintDiamond {

	public static void main(String[] args) {

		int rows = 4;
		int i, j = 0;

		// Outer loop to print the spaces
		for (i = 1; i <= rows; i++) {
			// 1. Inner loop to print the spaces in the decreasing order
			for (j = rows; j >= i; j--) {
				System.out.print(" ");
			}

			// 2. Inner loop to print the stars in the increasing order
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}

		for (i = 1; i <= rows; i++) {
			// Inner loop to print the spaces at each row:
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			
			// Inner loop to print the stars at each row:
			for (j = rows; j >=i; j--) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}
	
}

