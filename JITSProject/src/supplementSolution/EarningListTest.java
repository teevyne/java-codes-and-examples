package supplementSolution;

import java.util.Scanner;
public class EarningListTest {
	private static final Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int size;
		EarningList list; // declare PaymentList object to test
		
		// get size of list
		System.out.print("Size of list? ");
		size = sc.nextInt();
		list = new EarningList(size); // create object to test
		// menu
		do
		{
			// display options
			System.out.println();
			System.out.println("[1] ADD");
			System.out.println("[2] DISPLAY");
			System.out.println("[3] IS FULL");
			System.out.println("[4] GET PAYMENT");
			System.out.println("[5] GET TOTAL");
			System.out.println("[6] CALCULATE TOTAL PAID");
			System.out.println("[7] Quit");
			System.out.println();
			System.out.print("Enter a choice [1-7]: ");
			// get choice
			choice = sc.nextInt();
			System.out.println();
			// process choice
			switch(choice)
			{
				case 1: option1(list); break;
				case 2: option2(list); break;
				case 3: option3(list); break;
				case 4: option4(list); break;
				case 5: option5(list); break;
				case 6: option6(list); break;
				case 7: System.out.println("TESTING COMPLETE"); break;
				default: System.out.print("1-7 only");
			}
		} while (choice != '7');
	}
		// ADD
	private static void option1(EarningList listIn)
	{
		// prompt for payment details
		System.out.print("Enter Month: ");
		String month = sc.next();
		
		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();
		
		double taxAmount = amount * 0.09;
		double insuranceAmount = amount * 0.014;
		//double netIncome = amount - (taxAmount + insuranceAmount);
		
		// create new Payment object from input
//		Earning e = new Earning(month, amount);
		Earning e = new Earning(month, amount, taxAmount, insuranceAmount);
		
		// attempt to add payment to list
		boolean ok = listIn.addEarning(e); // value of false sent back if unable to add
		
		if (!ok)// check if item was not added
		{
			System.out.println("ERROR: list full");
		}
	}
	
	// DISPLAY
	public static void option2(EarningList listIn)
	{
		System.out.println("ITEMS ENTERED");
		System.out.printf("%s%n", listIn); // calls toString method of EarningList
	}
	// IS FULL
	static void option3(EarningList listIn)
	{
		if (listIn.isFull())
		{
			System.out.println("list is full");
		}
		else
		{
			System.out.println("list is NOT full");
		}
	}
	
	// GET PAYMENT
	static void option4(EarningList listIn)
	{
		// prompt for and receive payment number
		System.out.print("Enter payment number to retrieve: ");
		int num = sc.nextInt();
		
		// retrieve Payment object form list
		Earning e = listIn.getEarning(num); // returns null if invalid position
		if (e != null)// check if Payment retrieved
		{
			System.out.println(e); // calls toString method of Earning
		}
		else
		{
			System.out.println("INVALID PAYMENT NUMBER"); // invalid position error
		}
	}
	// GET TOTAL
	public static void option5(EarningList listIn)
	{
		System.out.print("TOTAL NUMBER OF PAYMENTS ENTERED: ");
		System.out.println(listIn.getTotal());
	}
		
	// GET TOTAL PAID
	public static void option6(EarningList listIn)
	{
		System.out.print("TOTAL OF PAYMENTS MADE SO FAR: ");
		System.out.println(listIn.calculateTotalEarned());
	}
}
