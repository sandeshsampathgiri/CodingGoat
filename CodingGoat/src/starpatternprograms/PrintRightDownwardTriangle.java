package starpatternprograms;

public class PrintRightDownwardTriangle {

	public static void main(String[] args) {

		int rows=5;
		
		//Outer loop to traverse through the list of rows
		for(int i=1;i<=rows;i++)
		{
			//Inner loop to print the list of stars on each row
			for(int j=rows;j>=i;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
