package exercises;

// Fig. 16.6: Sort1.java
// Collections method sort.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
//import java.util.LinkedList;

public class Sort1
{
	public static void main(String[] args)
	{
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

		// Create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits);
		//LinkedList<String> newList = new LinkedList<String>(Arrays.asList(suits));
		System.out.printf("Unsorted array elements: %s%n", list);

		Collections.sort(list);
		System.out.printf("Sorted array elements: %s%n", list);
	}
} // end class Sort1
