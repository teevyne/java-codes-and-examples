package supplementSolution;

/** Class used to record the details of a tenant
* @author Charatan and Kans
* @version 6th April 2018
*/

public class Employee {
	private String firstName;
	private String lastName;
	private int departmentID;
	private EarningList earnings;
	public static final int MAX = 12;

	public Employee (String firstName, String lastName, int departmentID)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentID = departmentID;
		earnings = new EarningList(MAX);
	}
	
	/** Records a payment for the tenant
	* @param earningIn: money earned by the employee
	*/

	public void lodgePayment(Earning earningIn)
	{
		earnings.addEarning(earningIn); // call EmployeeList method
	}

	/** Reads the  first name of the tenant
	* @return Returns the last name of the tenant
	*/

	public String getFirstName()
	{
		return firstName;
	}

	/** Reads the  last name of the tenant
	* @return Returns the last name of the tenant
	*/
	public String getLastName()
	{
		return lastName;
	}
	
	/** Reads the room of the tenant
	* @return Returns the room of the tenant
	*/
	public int getDepartmentID()
	{
		return departmentID;
	}
	/** Reads the payments of the tenant
	* @return Returns the earning for an employee
	*/
	public EarningList getEarnings()
	{
		return earnings;
	}
	
	@Override
	public String toString()
	{
		return String.format("Employee name: %s %s%nDepartment ID:\t%d", getFirstName(), getLastName(), getDepartmentID());
	}
}