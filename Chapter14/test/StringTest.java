import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		String name = "Tolu";
		
//		char[] toluName = { 'T', 'o', 'l', 'u' }; 
		name = "Tolulope";
//		char[] toluLongName = {  'T', 'o', 'l', 'u', 'l', 'o', 'p', 'e' };
				
		assertEquals(8, name.length());
		assertEquals('l', name.charAt(2));
		assertEquals("lope", name.substring(4));
		assertEquals("olu", name.substring(1, 4));
		assertEquals("TOLULOPE", name.toUpperCase());
		assertEquals("tolulope", name.toLowerCase());
		
		String fullName = "Tolulope";
		assertTrue(name == fullName);
		
		String tolu = "tolulope";
		assertFalse(fullName == tolu);
		assertTrue(name.equalsIgnoreCase(tolu));
		
		String mathematician = new String("Tolulope");
		assertFalse(fullName == mathematician);
		assertTrue(fullName.equals(mathematician));
	}
	
	@Test
	void stringConcatenation() {
		String name = "Tolu";
		String surname = "Ayemobola";
		
		String fullName = name + " " + surname;
		assertEquals("Tolu Ayemobola", fullName);
	}
	
	@Test
	void StringBuilder() {
		StringBuilder nameBuilder = new StringBuilder();
		nameBuilder.append("Tolu");
		nameBuilder.append(" ");
		nameBuilder.append("Ayemobola");
		
		assertEquals("Tolu Ayemobola", nameBuilder.toString());		
	}
	
	@Test
	void tokenisation() {
		String fullname = "Tolu Ayemobola";
		StringTokenizer tokenizer = new StringTokenizer(fullname);
//		tokeniz
		
		assertEquals(2, tokenizer.countTokens());
		//By default, delimiter is empty space
		
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	}
	
	@Test
	void regExMatching() {
		String pattern = "[aeiou]";
		String theExpression = "APP";
		assertFalse(pattern.matches(theExpression));
		
		assertTrue(theExpression.matches(pattern));
		theExpression = "i";
		assertTrue(Pattern.matches(pattern, theExpression));
	}

//	@Test
//	void regExMatchingZeroOrMore() {
//		String pattern 
//	}
	
	@Test
	void compareStrins() {
		String name = "Tolu";
		String surname = "Ayemobola";
		
		int result = name.compareTo(surname);
		System.out.println(result);
		assertTrue(result > BigInteger.ONE.intValue());
		if (result == BigInteger.ONE.intValue()) {
			System.out.println("Zero");
		}
		else if (result > BigInteger.ONE.intValue()) {
			System.out.println("False");
		}
		else System.out.println("True");
	}
}