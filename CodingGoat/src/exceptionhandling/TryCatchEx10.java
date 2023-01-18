package exceptionhandling;

public class TryCatchEx10 {

	public static void main(String[] args) {
		
		try 
		{ 
			String input = "Scientech Easy"; 
			int a = Integer.parseInt(input); 
			System.out.println("Value of a: "+a); 
		} 
		catch(NumberFormatException n) 
		{ 
			System.out.println(n.getMessage()+ "is not an integer."); 
		} 
	}
}