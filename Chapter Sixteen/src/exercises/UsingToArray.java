package exercises;

// Fig. 16.4: UsingToArray.java
// Viewing arrays as Lists and converting Lists to arrays.
import java.util.LinkedList;
import java.util.Arrays;

public class UsingToArray
{
	// creates a LinkedList, adds elements and converts to array
	public static void main(String[] args)
	{
		String[] colors = {"black", "blue", "yellow"};

		LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
		// Clearly I can view arrays as list and do all my manipulations and convert back to array upon finishing
		//with method asList()
		links.addLast("red"); // add as last item
		links.add("pink"); // add to the end
		links.add(3, "green"); // add at 3rd index
		links.addFirst("cyan"); // add as first item
		// get LinkedList elements as an array
		colors = links.toArray(new String[links.size()]);
		//Method toArray converts list to array

		System.out.println("colors: ");

		for (String color : colors)
			System.out.println(color);
	}
} // end class UsingToArray