package codewar;

import java.util.Scanner;
import java.util.Arrays;
public class ArraySum 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		double average = 0;
		
		System.out.print("Enter the number of integers to sum: ");
		int values = input.nextInt();
		int[] numbers = new int[values];
		
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print("Enter a number: ");
			int num = input.nextInt();
			numbers[i] = num;
			total += num;
		}
		System.out.println("The array of numbers is " + Arrays.toString(numbers));
		System.out.println("The total is " + total);
		
		average = total / numbers.length;
		System.out.printf("The average is %.2f", average);
		input.close();
	}
}
