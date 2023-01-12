package stringmanipulation;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicateWordsInAString {

	public static void main(String[] args) {

		System.out.println("Enter the text");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		List<String> duplicates = findDuplicates(str);
		System.out.println("List of duplicate elements are:");
		for (String list : duplicates) {
			System.out.println(list);
		}
	}

	public static List<String> findDuplicates(String str) {
		String[] strArray = str.split(" ");
		List<String> dupList = new ArrayList<String>();
		System.out.println("String length=" + strArray.length);

		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length - 1; j++) {
				if (strArray[i].equals(strArray[j])) {
					dupList.add(strArray[i]);
				}
			}
		}

		return dupList;
	}

}
