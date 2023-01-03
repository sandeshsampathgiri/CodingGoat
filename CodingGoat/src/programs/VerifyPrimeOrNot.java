package programs;

import java.util.Scanner;

public class VerifyPrimeOrNot {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int counter = verifyPrimeOrNot(num);

		if (counter > 0) {
			System.out.println("Entered number is not a prime number");
		}

		else if (counter == 0) {
			System.out.println("Entered number is a prime number");
		}
		
		sc.close();

	}

	public static int verifyPrimeOrNot(int num) {

		int counter = 0;
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				counter++;
				break;
			}
		}
		return counter;
	}

}
