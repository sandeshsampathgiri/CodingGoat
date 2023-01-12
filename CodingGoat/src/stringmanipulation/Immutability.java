package stringmanipulation;

public class Immutability {

	public static void main(String[] args) {
		
		//Creates a String object in the String constant pool if "Hello" is not already present
		String str = "Hello";
		
		//Creates another Object in the String constant pool if "World is not already present
		//str.concat("World");
		
		//A String object with the modified content "HelloWorld" is created in the heap memory
		//But it is not referenced by any variable and hence will be removed by garbage collector
		
		System.out.println(str);
		
		str = str.concat("World");
		System.out.println(str);
		

	}

}
