package exerciseFourteen;

//14.19 (Printing Dates in Various Formats) Dates are printed in several common formats. Two of
//the more common formats are
//04/25/1955 and April 25, 1955
//Write an application that reads a date in the first format and prints it in the second format.

import java.util.Scanner;
import java.util.Arrays;
public class PrintingDates
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String[] months = { "January", "February", "March", "April", "May", "June", 
				"July", "August", "September", "October", "November", "December" };		

		System.out.println("Enter the day, month and year");
		int month = sc.nextInt();
		int day = sc.nextInt();
		int year = sc.nextInt();
		
		System.out.printf("%n%s: %02d/%d/%d", "The date, as entered, is", month, day, year);
		System.out.println("\nConverted to second format: ");
		
		System.out.printf("  %s %d, %d", months[month - 1], day, year);

		sc.close();
	}
}