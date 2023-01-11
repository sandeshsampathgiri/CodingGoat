package stringmanipulation;
import java.util.Scanner;

public class ReverseString {
	
	//Input:sandesh
	//Output:hsednas

	public static void main(String[] args) {

		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String revString = reverseLogic(str);
		System.out.println("Reverse String=" + revString);

	}

	public static String reverseLogic(String str) {

		String reverseString = "";

		for (int i = str.length()-1; i >= 0; i--)

		{
			reverseString = reverseString + str.charAt(i);
		}

		return reverseString;

	}
}
