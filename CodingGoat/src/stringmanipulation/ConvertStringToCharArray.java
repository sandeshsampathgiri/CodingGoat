package stringmanipulation;

import java.util.Scanner;

public class ConvertStringToCharArray {

	public static void main(String[] args) {

		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] chArray = ConvertStringToCharArray.convertStringIntoCharArray(str);

		// Printing the elements of the char array:
		for (int i = 0; i < chArray.length; i++) {
			System.out.print(chArray[i] + "\s");
		}

	}

	public static char[] convertStringIntoCharArray(String str) {

		char[] charArray = str.toCharArray();
		return charArray;
	}

}
