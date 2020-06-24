
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice object1 = new Invoice("A350", "Red Honda Door", 3, 4);
		
		System.out.printf("%s\t%s\t%d\t%.2f\t%.2f", object1.getPartNumber(), object1.getPartDescription(), object1.getItemQuantity(), object1.getPricePerItem(), object1.getInvoiceAmount());
	}

}
