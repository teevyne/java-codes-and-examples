package supplementSolution;

/** Class used to store details of a single earning in the corporation
* @author Tolu and Victor
* @version 2 4 April 2020
*/

public class Earning
{
	private String month;
	private double amount;
	private double taxAmount;
	private double insuranceAMount;
	private double netIncome;

	/**Constructor initialises the payment month and the amount earned
	*@param month: month of earning
	*@param amount: amount earned
	*/
	
	//Constructor overload, but not really necessary as I have a constructor housing all the 
	//needed instance variables
	public Earning(String month, double amount)
	{
		this.month = month;
		this.amount = amount;
	}

	public Earning(String month, double amount, double taxAmount) {
		this.month = month;
		this.amount = amount;
		this.taxAmount = taxAmount;
	}
	
	public Earning(String month, double amount, double taxAmount, double insuranceAmount) {
		this.month = month;
		this.amount = amount;
		this.taxAmount = amount * 1.09;
		this.insuranceAMount = insuranceAmount;
	}
	
	/**Reads the month for which earning was paid in 
	*@return returns the month for which payment was made
	*/
	public String getMonth()
	{
		return month;
	}

	/**Reads the amount earned for a month
	*@return returns the amount that was earned
	*/
	public double getAmount()
	{
		return amount;
	}
	
	public double getTaxAmount() {
		taxAmount = amount * 0.09;
		return taxAmount;
	}
	
	public double getInsuranceAMount() {
		insuranceAMount = amount * 0.014;
		return insuranceAMount;
	}
	
	public double getNetIncome() {
		netIncome = getAmount() - (getTaxAmount() + getInsuranceAMount());
		return netIncome;
	}

	@Override
	public String toString()
	{
		return String.format("Month:\t\t%s%nGross Pay:\t%.2f%nTax Charge:\t%.2f%nIns. Charge:\t%.2f%nNet Salary:\t%.2f%n",
				getMonth(), getAmount(), getTaxAmount(), getInsuranceAMount(), getNetIncome());
	}
}