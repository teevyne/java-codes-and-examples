package ChapterNineExamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void compensationEarningTest() {
		CompensationModel commTwo = new BasePlusCommissionCompensationModel(25000, 0.01, 500);
		CompensationModel commOne = new CommissionCompensationModel(250000, 0.1);
		
		
		Employee Tolu = new Employee("James", "John", "Quyom", commOne);
		Employee Tola = new Employee("Phil", "Jay", "Yous", commTwo);
		assertEquals(Tolu.earning(), 25000);
		assertEquals(Tola.earning(), 750);
	}
}
