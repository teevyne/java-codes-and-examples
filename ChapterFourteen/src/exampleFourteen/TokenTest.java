package exampleFourteen;

import java.util.Scanner;
import java.util.StringTokenizer;
public class TokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringTokenizer object used to tokenize strings.
		
		// get sentence
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence and press Enter");
		String sentence = scanner.nextLine();
		
		// process user sentence
		String[] tokens = sentence.split(" ");
		System.out.printf("Number of elements: %d%nThe tokens are:%n",
		tokens.length);
		for (String token : tokens)
			System.out.println(token);		
	}
} // end class TokenTest
