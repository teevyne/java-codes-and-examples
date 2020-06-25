package exercises;

//import static org.junit.jupiter.api.Assertions.*;

//import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeSetSortingTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void treeSetSort() {
		String text = "This response is one to God as if you love God you "
				+ "will give to the saints all that the Lord has given to you";
		
		String[] newText = text.split(" ");
		
//		for (String word : newText) {
//			System.out.println(word);
//		}
		
		SortedSet<String> newTree = new TreeSet<>(Arrays.asList(newText));
		System.out.println(newTree);
	}
}
