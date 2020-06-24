package EmployeeRecord;

import java.util.ArrayList;

public class PaymentList {
	
	//Attributes
	private ArrayList<Payment> pList;
	public final int MAX;
	
//	my constructor	
//	public PaymentList(ArrayList<Payment> pList, int mAX) {
//		super();
//		this.pList = pList;
//		MAX = mAX;
//	}
	
	//Their constructor
	public PaymentList(int maxIn)
	{
		pList = new ArrayList<>(); //Initialising an empty payment list
		MAX = maxIn;
	}
	
	//Check if the payment list is full
	public boolean isFull() {
		return pList.size() == MAX;
	}
	
	//Get the total of the payments made
	public int getTotalNumberOfItems() {
		return pList.size();
	}
	
	//Add payment. Check if the list is full or not. Full return false, otherwise, return true
	public boolean addPayment(Payment payIn) 
	{
		if(!isFull()) {
			pList.add(payIn);
			return true;
		}
		else {
			return false;
		}
	}
	
	//Check and fetch a payment in a particular position
	public Payment getPayment(int paymentPosition)
	{
		if (paymentPosition < 1 || paymentPosition > getTotalNumberOfItems())
		{
			return null;
		}
		else
		{
			return pList.get(paymentPosition - 1);
		}
	}
	
	//Calculate the total payments made, in the list
	public double calculateTotalPaid()
	{
		double totalPaid = 0;
		for (Payment p : pList)
		{
			totalPaid = totalPaid + p.getAmount();
		}
		return totalPaid;
	}

	@Override
	public String toString()
	{
		return pList.toString();
	}
	
	//Instance variable
	//Constructor
	//Full list checker
	//Total payments made
	//Add new payment if space dey
	//Fetch payment from a position
	//Calculate individual payment by a tenant
}
