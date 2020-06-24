package codewar;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProduct {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		int totalProduct = 1;
		
		System.out.print("How many figures to multiply: ");
		int nums = input.nextInt();
		int[] arrayNums = new int[nums];
		
		for (int i = 0; i < arrayNums.length; i++)
		{
			System.out.print("Enter an integer: ");
			int num = input.nextInt();
			arrayNums[i] = num;
			totalProduct *= num;
		}
		//System.out.print("The numbers multiplied are: " + Arrays.toString(arrayNums));
		System.out.println("\nThe product of " + Arrays.toString(arrayNums) + " is: " + totalProduct);
		input.close();
	}
}
