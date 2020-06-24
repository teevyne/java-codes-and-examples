package employeeSolution;

import java.math.BigInteger;

public class HourlyEmployee extends Employee {
	
	private double hours;
	private double wage;
	
	public HourlyEmployee(String fname, String lname, String social) {
		super(fname, lname, social);
	}

	@Override
	public double getPaymentAmount() {
		double result = BigInteger.ZERO.doubleValue();
		
		if (hours > BigInteger.ZERO.intValue() && wage > BigInteger.ZERO.intValue()) {
			return getHours() * getWage();
		}
		return result;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
}
