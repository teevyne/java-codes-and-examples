package EmployeeRecord;

import java.util.ArrayList;

public class TenantList
{
	private ArrayList<Tenant> tList;
	public final int MAX;

	//Constructor
	public TenantList(int maxIn)
	{
		tList = new ArrayList<>();
		MAX = maxIn;
	}
	
	public Boolean addTenant(Tenant tIn) {
		if(!isFull()) {
			tList.add(tIn);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean removeTenant(int roomIn){
		Tenant findT = search(roomIn);
		if (findT != null){
			tList.remove(findT);
			return true; //room given to the tenant
		}
		else{
			return false; //The room isnt given
		}
	}

	public Tenant search(int roomIn)
	{
		for(Tenant currentTenant: tList)
		{
			// find tenant with given room number
			if(currentTenant.getRoom() == roomIn)
			{
				return currentTenant;
			}
		}
		return null; // no tenant found with given room number
	}

	public Tenant getTenant(int positionIn)
	{
		if (positionIn<1 || positionIn>getTotal()) 
		{
			return null; 
		}
		else
		{
			return tList.get(positionIn -1);
		}
	}

	public boolean isEmpty()
	{
		return tList.isEmpty();
	}

	public boolean isFull()
	{
		return tList.size() == MAX;
	}

	public int getTotal()
	{
		return tList.size();
	}


	public String toString()
	{
		return tList.toString();
	}
}
