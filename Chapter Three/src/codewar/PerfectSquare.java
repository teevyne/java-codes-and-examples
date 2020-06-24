package codewar;
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to check: ");
		int num = input.nextInt();
		
		if (num % Math.sqrt(num) == 0) 
		{
			System.out.println(num + " is a perfect sqaure");
		}
		else 
		{
			System.out.println(num + " is not a perfect square");
		}
		
		input.close();
	}

}
