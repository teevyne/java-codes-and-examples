package com.cohortThree;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NewTelevisionTest {
	Television lg;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		lg = new Television();
	}

	@AfterEach
	void tearDown() throws Exception {
		lg = null;
	}
	
	@Test
	void turnOnTest() {
		assertTrue(lg.turnTvOn());
	}

	

}
