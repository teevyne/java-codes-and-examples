package exercises;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CollectionsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void countLetters() {
		String text = "Hello There";
		text = text.toUpperCase();
		Map<String, Integer> letterCounted = new HashMap<String, Integer>();
		
		StringTokenizer tokenizer = new StringTokenizer(text);
		assertEquals(2, tokenizer.countTokens());
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			for (int i = 0; i < token.length(); i++) {
				String letter = String.valueOf(token.charAt(i));
				if(letterCounted.containsKey(letter)){
					int count = letterCounted.get(letter);
					count++;
					letterCounted.put(letter, count);
				}
				else {
					letterCounted.put(letter, 1);
				}
			}
		}
		
		Iterator<String> keys = letterCounted.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			StringBuilder entry = new StringBuilder(key);
			entry.append(", ");
			entry.append(letterCounted.get(key));
			System.out.println(entry.toString());
		}
	}
}
