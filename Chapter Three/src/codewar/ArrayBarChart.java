package codewar;
import java.util.Scanner;
public class ArrayBarChart {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		//Scanner input = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int len = input.nextInt();
		int[] arrayLen = new int[len];
		
		for (int i = 0; i < arrayLen.length; i++)
		{
			System.out.print("Enter a value for your barchart: ");
			int value = input.nextInt();
			arrayLen[i] = value;
			arrayLen[i] = arrayLen[i] / 10;
		}
		
		for (int i = 0; i < arrayLen.length; i++)
		{
			if (i == 10)
			{
				System.out.printf("%5d: ", 100);
			}
			else
			{
				System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
			}

			for (int stars = 0; stars < arrayLen[i]; stars++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
	}

}
