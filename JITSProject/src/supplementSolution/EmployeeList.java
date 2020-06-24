package supplementSolution;
import java.util.ArrayList;

public class EmployeeList {
	
	/** Collection class to hold a list of tenants
	* @author Charatan and Kans
	* @version 6th April 2018
	*/
	private ArrayList<Employee> eList;
	public final int MAX;

	/** Constructor initialises the empty tenant list and sets the maximum list size
	* @param maxIn The maximum number of tenants in the list
	*/

	public EmployeeList(int maxIn)
	{
		eList = new ArrayList<>();
		MAX = maxIn;
	}

	/** Adds a new employee to the list
	* @param eIn The Employee to add
	* @return Returns true if the employee was added successfully and false otherwise
	*/

	public boolean addEmployee(Employee eIn)
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

	public boolean removeEmployee(int deptIDIn)
	{
		Employee findT = search(deptIDIn); 
		if (findT != null) 
		{
			eList.remove(findT); 
			return true;
		}
		else
		{
			return false; 
		}
	}

	public Employee search(int deptIDIn)
	{
		for(Employee currentEmployee: eList)
		{
			// find employee with department ID
			if(currentEmployee.getDepartmentID() == deptIDIn)
			{
				return currentEmployee;
			}
		}
		return null; // no tenant found with given room number
	}

	public Employee getTenant(int positionIn)
	{
		if (positionIn<1 || positionIn>getTotal()) //11"ejgem"hqt"xcnkf"rqukvkqp
		{
			return null; //11"pq"qdlgev"hqwpf"cv"ikxgp"rqukvkqp
		}
		else
		{
			return eList.get(positionIn -1);
		}
	}

	public boolean isEmpty()
	{
		return eList.isEmpty();
	}

	public boolean isFull()
	{
		return eList.size()== MAX;
	}

	public int getTotal()
	{
		return eList.size();
	}

	@Override
	public String toString()
	{
		return eList.toString();
	}
}
