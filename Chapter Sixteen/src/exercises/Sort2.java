package exercises;

//Fig. 16.6: Sort1.java
//Collections method sort.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
//import java.util.LinkedList;

public class Sort2
{
	public static void main(String[] args)
	{
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

		// Create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits);
		//LinkedList<String> newList = new LinkedList<String>(Arrays.asList(suits));
		System.out.printf("Unsorted array elements: %s%n", list);

		// sort in descending order using a comparator
		Collections.sort(list, Collections.reverseOrder());
		System.out.printf("Sorted array elements: %s%n", list);
	}
} // end class Sort1

//public class Sort2 {
//	public static void main(String[] args) {
//		String[] list = { "Human", "Mammals", "Avians", "Amphibians" };
//		
//		for(int i = list.length - 1; i >= 0; i--) {
//			System.out.printf("%s ", list[i]);
//		}
//	}
//}
