package programs;

import java.util.Scanner;

public class Iterate1DArrayReverse {

	public static void main(String[] args) {

		System.out.println("Enter the array size");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();

		int[] nums = new int[num];

		System.out.println("Enter the array elements");

		for (int i = 0; i < num; i++) {
			Scanner sc2 = new Scanner(System.in);
			nums[i] = sc2.nextInt();

		}

		System.out.println("Array elements are:");

		for (int i = num; i >= 1; i--) {

			System.out.print(nums[i-1]+"\s");

		}

	}

}
