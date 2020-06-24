package ChaptNineEx;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String name, String surname, String social, double sales, double earnings) {
		super(name, surname, social);
		commissionRate = earnings;
		grossSales = sales;
	}
	
	public double earnings() {
		return commissionRate * grossSales;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
}
