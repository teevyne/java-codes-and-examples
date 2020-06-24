package question14;

public class CommissionEmployee extends Employee {
	private double commissionRate;
	private double grossSales;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthday, double commissionRate,
			double grossSales) {
		super(firstName, lastName, socialSecurityNumber, birthday);
		
//		if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
//			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

		if (grossSales < 0.0) // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
			
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
//		if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
//			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		return commissionRate;
	}

	public double getGrossSales() {
		if (grossSales < 0.0) // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		return grossSales;
	}
	
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s%nCommission Rate: %.2f%nGross Sales: %.2f, Earnings: %,.2f", "Commission Employee", 
				super.toString(), getCommissionRate(), getGrossSales(), earnings());
	}
}
