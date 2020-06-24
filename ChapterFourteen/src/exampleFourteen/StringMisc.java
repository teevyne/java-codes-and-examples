package exampleFourteen;

public class StringMisc {
	public static void main (String[] args){
		String s1 = "hello there";
		char[] charArray = new char[5];

		System.out.printf("s1: %s", s1);
		
		//test the length method
		System.out.printf("%nLength of s1: %d", s1.length());
		
		//loop through characters in s1 with chart and display reversed
		System.out.printf("%nThe string reversed is: ");
		for (int count = s1.length() - 1; count >= 0; count--)
			System.out.printf("%c ", s1.charAt(count));
		
	//	System.out.printf("%nThe character in position 3 is %s", s1.charAt(charArray[2]));
		System.out.println();
		// copy characters from string into charArray
		s1.getChars(0, 5, charArray, 0);
//		The first argument is the starting index from which characters are to be copied.
//		The second argument is the index that’s one past the last character to be copied from the
//		String. The third argument is the character array into which the characters are to be
//		copied. The last argument is the starting index where the copied characters are placed in
//		the target character array
		
		System.out.printf("%nThe character array is: ");

		for (char character : charArray)
			System.out.print(character);

		System.out.println();
	}
}

//String method length returns the length of a String, 
//charAt obtains the character at a specific location in a String
//getChars retrieves a set of characters from a String as a char array, respectively.
//String method getChars to copy the characters of a String into a character array.