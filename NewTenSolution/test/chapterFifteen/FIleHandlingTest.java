package chapterFifteen;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileHandlingTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		String filename = "C://Users//user//champs.txt";
		Path path = Paths.get(filename);
		assertTrue(Files.exists(path));
	}

}
