package programs;

import java.util.Scanner;

public class PrintSquareRoot {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int sqrt = (int) Math.sqrt(number);
		System.out.println("Square root of " + number + " is " + sqrt);

	}

}
