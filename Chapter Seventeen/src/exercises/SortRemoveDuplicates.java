package exercises;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortRemoveDuplicates 
{	
	public static void main(String[] args) 
	{
		SecureRandom random = new SecureRandom();
		
		//char[] randomChar = new char[26];
		List<Character> characters = new ArrayList<Character>();
		
		for (int i = 0; i <= 30; i++) 
		{
			char aChar = (char) (random.nextInt(26) + 97);
			characters.add(aChar);
			//System.out.printf("%c ", aChar);
		}
		System.out.println(characters);
		
		System.out.printf("%nSort the list in ascending order:%n");
		characters.stream().sorted().forEach(val -> System.out.printf("%c ", val));
		
//		System.out.printf("%nSort the list in descending order:%n");
//		characters.stream().sorted(String.CASE_INSENSITIVE_ORDER).reversed().forEach(System.out::println);
		Collections.sort(characters, Collections.reverseOrder());
		System.out.println("\nSort the list in descending order  : \n" + characters);
		//the solution is unacceptable for lambdas - lines 28 - 31
		
		System.out.printf("%nSort the list in ascending order with removed duplicates:%n");
		characters.stream().distinct().sorted().forEach(val -> System.out.printf("%c ", val));
		
//		for (int i = 0; i <= 10; i++) {
//			int num = random.nextInt(10) + 1;
//			System.out.println(num);
//		}
	}

}
