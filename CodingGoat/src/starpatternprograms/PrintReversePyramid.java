package starpatternprograms;

public class PrintReversePyramid {

	public static void main(String[] args) {
		
		int rows = 5;
		
		//Outer loop to traverse through the list of all the rows
		for(int i=1;i<=rows;i++)
		{
			//1. Inner loop to print spaces at each row
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			//2. Inner loop to print stars at each row
			for(int j=rows;j>=i;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
