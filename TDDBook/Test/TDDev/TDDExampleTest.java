package TDDev;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TDDExampleTest {

	Dollar five;
	Franc fiver; //Step One: Create an object of the class in question

	@BeforeEach
	void setUp() throws Exception {
		five = new Dollar(5);
		fiver = new Franc(5); // Step Two: Initialise the object with new return type value of the class in question 
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test 
	void fiveIsNotNull(){
		assertNotNull(five);
		assertNotNull(fiver); //Step Three: Assert that the object exists
	}
	
	@Test
	void testMultiplication(){
		//five = new Dollar(5);
		//five = new Dollar (5);
		Money five = Money.dollar(5); //What exactly happened here? Reference to Dollar has to disappear
		//Dollar product = five.times(2);II
		//assertEquals(10, product.amount); I
		//assertEquals(new Dollar(10), product); II
		//assertEquals(Money.dollar(10), five.times(2));umcomment
		//product = five.times(3); II
		//assertEquals(15, product.amount); I
		//assertEquals(new Dollar(15), product);II
		//assertEquals(Money.dollar(15), five.times(3)); uncomment
	}
	
	@Test
	void testFrancMultiplication(){
		Money fiver = Money.franc(5); 
//		assertEquals(Money.franc(10), fiver.times(2)); uncomment
//		assertEquals(Money.franc(15), fiver.times(3)); uncomment
	}
	
	@Test
	void testEquality() { 
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		//assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5))); //Step Six: Assert that the values are equal.. 5 is infact a 5; 6 isn't a 6 
//		assertFalse(Money.franc(5).equals(Money.franc(6)));
//		assertFalse(Money.franc(5).equals(Money.franc(6))); //Book says fail but it passed. Guess Dollar = Franc here and the classes are the same also. 
														 //But why did it pass?
	}
	
	@Test
	void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
	@Test
	void testSimpleAddition() {
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);
	}
	
	@Test
	void testPlusReturnSum() {
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);
	}
	
	@Test
	void testReduceSum() {
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
		Bank bank = new Bank();
		Money result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(7), result);
	}
	
	@Test
	void testReduceMoney() {
		Bank bank = new Bank();
		Money result = bank.reduce(Money.dollar(1), "USD");
		assertEquals(Money.dollar(1), result);
	}
	
	@Test
	void testReduceMoneyDifferenceCurrency() {
		Bank bank = new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result = bank.reduce(Money.franc(2),  "USD");
		assertEquals(Money.dollar(1), result);
	}
	
	@Test
	void testArrayEquals() {
		assertEquals(new Object[] {"abc"}, new Object[] {"abc"});
	}
	
	@Test
	void testIdentityRate() {
		assertEquals(1, new Bank().rate("USD", "USD"));
	}
}
