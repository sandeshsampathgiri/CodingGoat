package starpatternprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintNumberOfOccurences {

	public static void main(String[] args) {

		System.out.println("Enter the text");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		findOccurences(str);

	}

	public static void findOccurences(String str) {
		String[] strArray = str.split(" ");
		int length = strArray.length;
		
		//Convert the string array into ArrayList
		ArrayList<String> list = (ArrayList<String>) Arrays.asList(strArray);

		
		LinkedHashSet<String> set = new LinkedHashSet<String>(list);
		
		int listSize = list.size();
		System.out.println("List Size="+listSize);
		int setSize = set.size();
		System.out.println("Set Size="+setSize);
		
		for(int i=0;i<setSize;i++)
		{
			for(int j=0;j<listSize;j++)
			{
				if(set.equals(list.get(j)))
				{
					
				}
			}
		}
		
		
		
	}

}
