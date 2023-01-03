package starpatternprograms;

public class PrintLeftTriangle {

	public static void main(String[] args) {
		
		int rows=5;
		
		//Outer loop to traverse through the list of rows
		for(int i=1;i<=rows;i++)
		{
			//Inner loop to print the list of decreasing spaces
			for(int j=rows;j>=i;j--)
			{
				System.out.print("  ");
			}
			
			//Inner loop to print the list of increasing stars
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
		}

	}

}
