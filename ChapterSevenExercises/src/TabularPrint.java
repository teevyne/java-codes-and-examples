import java.util.Scanner;

public class TabularPrint 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] myArray = new int[2][3];
		
		for (int i = 0; i < myArray.length; i++) 
		{
			for (int j = 0; j < myArray[i].length; j++) 
			{
				System.out.print("Enter a number for the array: ");
				myArray[i][j] = sc.nextInt();
			}	
		}
		
		System.out.printf("\t %d\t %d\t %d%n", 0,  1,  2);
		for ( int i = 0; i < myArray.length; i++ )
		{
			System.out.printf("%d |", i);
			for ( int j = 0; j < myArray[i].length; j++ ) 
			{
				System.out.printf("\t %d", myArray[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
