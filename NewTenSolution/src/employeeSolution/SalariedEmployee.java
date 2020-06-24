package employeeSolution;

import java.math.BigDecimal;

public class SalariedEmployee extends Employee {
	
	public SalariedEmployee(String fname, String lname, String social) {
		super(fname, lname, social);
	}

	@Override
	public double getPaymentAmount() {
		return BigDecimal.ZERO.doubleValue();
	}
}
