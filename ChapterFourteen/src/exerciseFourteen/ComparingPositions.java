package exerciseFourteen;

//14.4 (Comparing Portions of Strings) Write an application that uses String method region-
//Matches to compare two strings input by the user. The application should input the number of characters
//to be compared and the starting index of the comparison. The application should state
//whether the strings are equal. Ignore the case of the characters when performing the comparison.

import java.util.Scanner;
public class ComparingPositions {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first sentence");
		String firstWord = sc.nextLine();
		
		System.out.println("Enter a second sentence");
		String secondWord = sc.nextLine();
		
		System.out.printf("%s: %d characters%n%s: %d characters", "First word length", firstWord.length(), 
				"Second word length", secondWord.length());
		
		System.out.print("\nEnter number of characters to be compared: ");
		int n = sc.nextInt();
		
		// test regionMatches (ignore case)
		if (firstWord.regionMatches(true, 0, secondWord, 0, n))
			System.out.println("First " + n + " characters of first word and second word match with case ignored");
		else
			System.out.println("First " + n + " characters of first word and second word do not match");
		
		sc.close();
	}
}
