package programs;

import java.util.*;

public class AddTwoNumbers {

	public static void main(String[] args) {

		System.out.println("Enter the first number");
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();

		System.out.println("Enter the second number");
		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();

		AddTwoNumbers atn = new AddTwoNumbers();
		int sum = atn.addTwoNumbers(num1, num2);
		
		System.out.println("Sum of two numbers is "+sum);
		
	}

	public int addTwoNumbers(int a, int b) {

		int sum = a + b;
		return sum;
	}

}
