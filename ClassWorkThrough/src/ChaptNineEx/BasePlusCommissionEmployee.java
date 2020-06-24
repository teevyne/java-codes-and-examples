package ChaptNineEx;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;

	public BasePlusCommissionEmployee(String name, String surname, String social, double sales, double earnings, double baseEarning) {
		super(name, surname, social, sales, earnings);
		baseSalary = baseEarning;	
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
}
