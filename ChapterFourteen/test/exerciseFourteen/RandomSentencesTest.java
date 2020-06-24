package exerciseFourteen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RandomSentencesTest {
	
	RandonSentences wordGenerator;

	@BeforeEach
	void setUp() {
		wordGenerator = new RandonSentences();
	}

	@Test
	void  testObjectReference() {
		assertNotNull(wordGenerator);
	}
	
	@Test
	void testArticleArrayElements() {
		assertNotNull(wordGenerator.getArticle());
		assertEquals("the", wordGenerator.getArticle()[0]);
		assertEquals("A", wordGenerator.getArticle()[1]);
	}
}
