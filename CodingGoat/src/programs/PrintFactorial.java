package programs;

import java.util.Scanner;

public class PrintFactorial {

	public static void main(String[] args) {

		PrintFactorial pf = new PrintFactorial();

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Entered num is " + num);

		if (num < 0) {
			System.out.println("Number entered is invalid");
		}

		else if (num == 0) {
			System.out.println("Factorial of 0 is 1");
		}

		else if (num > 0) {

			long fact = pf.printFactorial(num);
			System.out.println("Factorial of " + num + " is " + fact);
		}

	}

	public long printFactorial(int num) {
		long fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;

		}
		return fact;
	}

}
