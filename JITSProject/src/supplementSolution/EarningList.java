package supplementSolution;

import java.util.ArrayList;
/**Collection class to hold a lst of Earning objects
*@author Victor and Tolu
*@version 2 4 April 2020
*/

public class EarningList
{
	//Attributes
	private ArrayList<Earning> eList;
	public final int MAX;

	/**COnstructor initialises the empty earning lisr and sets the maximum list size
	*@param max: the maximum number of earnings in the list
	*/

	public EarningList(int max)
	{	
		eList = new ArrayList<>();
		MAX = max;
	}		

	/** Checks if the payment list is full
	* @return Returns true if the list is full and false otherwise
	*/

	public boolean isFull()
	{
		return eList.size()== MAX;
	}

	/** Gets the total number of payments
	* @return Returns the total number of payments currently in the list
	*/

	public int getTotal()
	{
		return eList.size();
	}

	/** Adds a new payment to the end of the list
	* @param eIn: The payment to add
	* @return Returns true if the object was added successfully and false otherwise
	*/

	public boolean addEarning(Earning eIn)
	{
		if(!isFull())
		{
			eList.add(eIn);
			return true;
		}
		else
		{
			return false;
		}
	}

	/** Reads the payment at the given position in the list
	* @param positionIn: The logical position of the payment in the list
	* @return Returns the payment at the given logical position in the list
	* or null if no payment at that logical position
	*/

	public Earning getEarning(int positionIn)
	{
		//check for valid logical position
		if (positionIn <1 || positionIn > getTotal())
		{
			// no object found at given position
			return null;
		}
		else
		{
			// take one off logical position to get ArrayList position
			return eList.get(positionIn - 1);
		}
	}

	/** Calculates the total monies earned by an employee
	* @return Returns the total value of earnings recorded
	*/

	public double calculateTotalEarned()
	{
		double totalEarned = 0; // initialize totalPaid
		// loop through all payments
		for (Earning e: eList)
		{
			// add current payment to running total
			totalEarned = totalEarned + e.getAmount();
		}
		return totalEarned;
	}

	@Override
	public String toString()
	{
		//return eList.toString();
		return String.format("%s%n", eList.toString());
	}
}