package setinterface;

import java.util.HashSet;
import java.util.Set;

public class SetExample5 {

	public static void main(String[] args) {
		
		Set<String> fruits1 = new HashSet<String>();
		fruits1.add("Banana");
		fruits1.add("Orange");
		fruits1.add("Apple");
		
		Set<String> fruits2 = new HashSet<String>();
		fruits2.add("Banana");
		fruits2.add("Orange");
		fruits2.add("Mango");
		
		//a. What are the elements of set1 and set2 after executing set1.addAll(set2)?
		fruits1.addAll(fruits2);
		//Ans: Banana, Orange,Apple, Mango
		
		//b. What are the elements of set1 and set2 after executing set1.add(set2)
		//fruits1.add(fruits2);
		//Ans: It will give a compilation error
		
		//c. What are the elements of set1 and set2 after executing set1.removeAll(set2)
		fruits1.removeAll(fruits2);
		//Ans: Apple
		
		//d. What are the elements of set1 and set2 after executing set1.remove(set2)
		fruits1.remove(fruits2);
		//Ans: No idea
		
		//e.  What are elements of set1 and set2 after executing set1.retainAll(set2)
		fruits1.retainAll(fruits2);
		//Ans: Banana, Orange
		
		//f. What is the size of set1 after executing set1.clear()
		fruits1.clear();
		//Ans: 0
		
		//What is the size of set2 after executing set2.add(“Mango”)
		fruits2.add("Mango");
		//Ans: 3
	}

}
