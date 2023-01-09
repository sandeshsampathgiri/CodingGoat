package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintCommonElementsInAnArrayList {

	public static void main(String[] args) {
		ArrayList<String> names1 = new ArrayList<String>(Arrays.asList("One", "Two", "Three", "Four", "Six", "Seven"));
		ArrayList<String> names2 = new ArrayList<String>(Arrays.asList("One", "Two", "Nine", "Three", "Six", "Eight"));
		printCommonElements(names1,names2);
		System.out.println("Common elements are:"+names1);

	}
	
	public static ArrayList<String> printCommonElements(ArrayList<String> names1,ArrayList<String> names2)
	{
		names1.retainAll(names2);
		return names1;
	}

}
