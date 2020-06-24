package abstractClassExample;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weekelySalary) {
		super(firstName, lastName, socialSecurityNumber);
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		this.weeklySalary = weekelySalary;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double earnings() {
		return getWeeklySalary();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s%nWeekly Earnings: %,.2f", "Salaried Employee", super.toString(), earnings());
	}
}
