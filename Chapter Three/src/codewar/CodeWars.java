package codewar;

import java.util.Scanner;
public class CodeWars 
{
	public static void main (String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the number of integers: ");
 		int num = input.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) 
		{
			System.out.println("Enter any number: ");
			int value = input.nextInt();
			sum += value;
		}
		System.out.println(sum);
		input.close();
	}
}
