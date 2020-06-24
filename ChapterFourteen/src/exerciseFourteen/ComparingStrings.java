package exerciseFourteen;

//14.3 (Comparing Strings) Write an application that uses String method compareTo to compare
//two strings input by the user. Output whether the first string is less than, equal to or greater than
//the second.

import java.util.Scanner;
public class ComparingStrings {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string");
		String firstString = sc.nextLine();
		
		System.out.println("Enter second string");
		String secondString = sc.nextLine();
		
		System.out.printf("%nfirstString compares to secondString: %d", firstString.compareTo(secondString));
		System.out.printf("%nsecondString compares to firstString: %d", secondString.compareTo(firstString));
		
		sc.close();
	}
}
