package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//import chapterExercises.Employee;

public class DuplicateWordRemoval 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String word = input.nextLine();
		
		String[] newWord = word.split(" ");
		
//		for (String aWord : newWord) 
//		{
//			System.out.println(aWord);
//		}
		
		//System.out.printf("Original strings: %s%n", Arrays.asList(newWord));
		
		List<String> alist = Arrays.asList(newWord);
		
		System.out.printf("%nUnique words in the sentence:%n");
		alist.stream().map(String::toLowerCase).distinct().sorted().forEach(System.out::println);
		
		input.close();
	}

}
