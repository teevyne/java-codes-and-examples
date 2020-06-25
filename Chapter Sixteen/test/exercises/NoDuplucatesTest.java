package exercises;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sun.source.tree.AssertTree;

class NoDuplucatesTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		String firstName = "Tolu";
		String fName = "Philemon";
		String anotherFirstName = "Chinedu";
		String anotherFName = "Chinedu";
		
		Set<String> firstNames = new HashSet<String>();
		firstNames.add(firstName);
		firstNames.add(fName);
		firstNames.add(anotherFirstName);
		firstNames.add(anotherFName);
		
		assertEquals(3, firstNames.size());
		assertTrue(firstNames.contains(firstName));
		assertFalse(firstNames.contains("Zidani"));
		
		String findChinedu = "";
		Iterator<String> namesIterator = firstNames.iterator();
		while(namesIterator.hasNext()) {
			String currentName = namesIterator.next();
			if(currentName.equals("Chinedu")) {
				findChinedu = currentName;
				break;
			}
		}
		assertEquals(findChinedu, anotherFirstName);
		
	}

}
