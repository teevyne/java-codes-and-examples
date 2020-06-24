package question14;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthday, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, birthday);
		
		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
			
		if ((hours < 0.0) || (hours > 168.0)) // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
			
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		this.hours = hours;
	}
	
	@Override
	public double earnings() {
		if (getHours() <= 40) // no overtime
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s%nWorker wage: %,.2f%nWorked hours: %.1f", "Hourly-paid Employee", super.toString(), getWage(), getHours());
	}
	
}
