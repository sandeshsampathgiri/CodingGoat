package programs;

import java.util.Scanner;

public class Iterate1DArrayForward {

	public static void main(String[] args) {

		System.out.println("Enter the number of elements of the array");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int nums[] = new int[num];

		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < num; i++) {
			Scanner sc2 = new Scanner(System.in);
			nums[i] = sc2.nextInt();
		}

		System.out.println("Array elements are:");
		for (int i = 0; i < num; i++) {
			System.out.print(nums[i] + "\s");

		}

	}

}
