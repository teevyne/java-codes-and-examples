package Interfaces;

public class Invoice implements Payable {
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		
		if (quantity < 0) // validate quantity
			throw new IllegalArgumentException("Quantity must be >= 0");
			
		if (pricePerItem < 0.0) // validate pricePerItem
			throw new IllegalArgumentException("Price per item must be >= 0");
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}
	
	public void setQuantity(int  quantity) {
		if (quantity < 0) // validate quantity
			throw new IllegalArgumentException("Quantity must be >= 0");
		this.quantity = quantity;
	}
	
	public void setPricePerItem(double pricePerItem){
		if (pricePerItem < 0.0) // validate pricePerItem
			throw new IllegalArgumentException("Price per item must be >= 0");
		this.pricePerItem = pricePerItem;
	}
	
	@Override
	public String toString() {
		return String.format("%n%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "An Invoice", "Part Number", getPartNumber(), getPartDescription(), "Quantity", getQuantity(), "Price per item", getPricePerItem());
	}
	
	// method required to carry out contract with interface Payable
	@Override
	public double getPaymentAmount()
	{
		return getQuantity() * getPricePerItem(); // calculate total cost
	}
}
