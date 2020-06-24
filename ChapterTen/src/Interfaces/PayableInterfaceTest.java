package Interfaces;

public class PayableInterfaceTest {
	public static void main (String[] args) {
		
		//Create a four-element array of Payable
		Payable[] payableObjects = new Payable[4];
		
		//Now populate array with objects that implement or realises Payable
		payableObjects[0] = new Invoice("A102", "Black Honda Door", 3, 250.98);
		payableObjects[1] = new Invoice("A103", "Red volks seatcover", 10, 100.50);
		payableObjects[2] = new SalariedEmployee("Femi", "Shobowale", "SSN-1239560", 2500.50);
		payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);
		
		System.out.println("Invoices and Employee processed polymorpically");
		
		double total = 0;
		for(Payable currentPayable : payableObjects) {
			//System.out.println(currentPayable);
			
			// output currentPayable and its appropriate payment amount
			System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), // could invoke implicitly
			"Payment Due", currentPayable.getPaymentAmount());
			
			total += currentPayable.getPaymentAmount();	
		}
		System.out.printf("%n%nThe total monies due payment is %,.2f", total);
	}
}
