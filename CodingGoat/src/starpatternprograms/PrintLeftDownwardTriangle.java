package starpatternprograms;

public class PrintLeftDownwardTriangle {

	public static void main(String[] args) {
		
		int rows=5;
		
		//Outer loop to traverse through the list of rows
		for(int i=1;i<=rows;i++)
		{
			//Inner loop to print the decreasing spaces through each row
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			
			//Inner loop to print the stars through each row
			for(int j=i;j<=rows;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
