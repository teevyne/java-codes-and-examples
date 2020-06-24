package exercise7_10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalesCommissionTest {
	SalesCommission nta;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		nta = new SalesCommission();
	}
	
	@Test
	void test() {
		assertNotNull(nta);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testArrayMethods() {
		assertEquals(3000, nta.getGrossSales(5));
	}
	
	@Test
	void testGetSalaryMethod() {
		assertEquals(384, nta.getSalary(0));
	}
}
