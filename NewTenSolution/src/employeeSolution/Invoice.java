package employeeSolution;

import java.math.BigInteger;

import exceptionClass.PayableException;

public class Invoice implements Payable {
	
	private final String partNumber;
	private final String partDescription;
	private final int quantity;
	private double pricePerItem;
	
	public Invoice(String part, String desc, int quant, double price) {
		partNumber = part;
		partDescription = desc;
		quantity = quant;
		pricePerItem = price;
	}

	@Override
	public double getPaymentAmount() throws  PayableException {
		//double result = BigInteger.ZERO.doubleValue();
		if(quantity < BigInteger.ZERO.intValue() || pricePerItem < BigInteger.ZERO.intValue()) {
			throw new PayableException("There is a problem somewhere");
		}
		//return result;
		return pricePerItem * quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
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
}
