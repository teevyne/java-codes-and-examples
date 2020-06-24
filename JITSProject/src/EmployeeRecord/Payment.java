package EmployeeRecord;

public class Payment
{
	private String month;
	private double amount;

	public Payment(String aMonth, double anAmount)
	{
		month = aMonth;
		amount = anAmount;
	}

	public void setMonth(String aMonth) {
		month = aMonth;
	}

	public void setAmount(double anAmount) {
		amount = anAmount;
	}

	public String getMonth()
	{
		return month;
	}

	public double getAmount()
	{
		return amount;
	}

	@Override
	//Why are we overriding just yet
	public String toString()
	{
		return "(" + month + ", " + amount + ")";
	}
}
