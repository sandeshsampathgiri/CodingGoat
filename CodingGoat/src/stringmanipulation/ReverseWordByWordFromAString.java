package stringmanipulation;

import java.util.Scanner;

public class ReverseWordByWordFromAString {
	
	//Input: This is India
	//Output: India is This

	public static void main(String[] args) {

		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String reversedString = reverseWordByWord(str);
		System.out.println("Reversed string="+reversedString);
	}
	
	public static String reverseWordByWord(String str)
	{
		String[] newstr = str.split(" ");
		String rev="";
		//System.out.println(newstr);
		
		for(int i=newstr.length-1;i>=0;i--)
		{
			rev = rev + " " +newstr[i];
			
			//System.out.println(newstr[i]);
		}
		
		return rev;
	}
	
	

}
