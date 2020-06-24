package EmployeeRecord;

public class Tenant {

	//The Instance variable or class variables
	private String name;
	private int room;
	private PaymentList payments;
	public static final int MAX = 12;

	//Constructor
	public Tenant(String aName, int aRoom)
	{
		name = aName;
		room = aRoom;
		payments = new PaymentList(MAX);
	}

	//Method to add a payment made by a tenant
	public void makePayment(Payment paymentIn)
	{
		payments.addPayment(paymentIn);
	}

	//Method to get the list of payments made
	public PaymentList getPayments()
	{
		return payments;
	}	
	
	//Get name method
	public String getName() {
		return name;
	}
	
	//Get room number
	public int getRoom() {
		return room;
	}
	
	//Return the string representation of the output
	@Override
	public String toString()
	{
		return name + " , " + room + ", "+ payments;
	}
	
}
