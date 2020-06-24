package ChapterNineExercise;

//1. CommissionCompensationModel—For Employees CompensationModel subclass would contain grossSales and commissionRate instance variables, and would define
//earnings to return grossSales * commissionRate.

public class CommissionCompensationModel extends CompensationModel {
	private double grossSales;
	private double commissionRate;
	
	public CommissionCompensationModel() {}
	
	public CommissionCompensationModel(double grossSales, double commissionRate) {
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
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
	
	@Override
	public double earnings() {
		return grossSales * commissionRate;
	}

}
