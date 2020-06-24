package exerciseFourteen;

import java.util.Scanner;
//import java.util.StringTokenizer;

public class PigLatin 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		String sentence = sc.nextLine();
		
		String[] splitSentence = sentence.split(" ");
		for (String word : splitSentence) 
		{
			String newWord = word + "ay";
			System.out.printf("%s ", newWord);
		}
		sc.close();
	}
}



