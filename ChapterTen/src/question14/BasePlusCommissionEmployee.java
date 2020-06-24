package question14;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthday,
			double commissionRate, double grossSales, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, birthday, grossSales, commissionRate);
		if (baseSalary < 0.0) // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s%nBase Salary: %,.2f%nEarnings: %,.2f", "Base Commission Employee", 
				super.toString(), getBaseSalary(), earnings());
	}
}
