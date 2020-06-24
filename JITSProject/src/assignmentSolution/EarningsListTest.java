package assignmentSolution;

import java.util.Scanner;

import assignmentSolution.Earnings;
import assignmentSolution.EarningsList;

public class EarningsListTest 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		int response;
		System.out.println("Maximum number of employee details to put in this time");
		int amount = sc.nextInt();
		EarningsList eList = new EarningsList(amount);
		
		System.out.print("Press 1 to work on the Employee Record or -1 to exit ");
		response = sc.nextInt();
		
		if (response == 1) 
		{
			//int amount = sc.nextInt();
			//eList 
			
			int counter = 0;
			
			while (response != -1) 
			{
				System.out.println();
				System.out.println("[1] ADD NEW EMPLOYEE RECORD");
				System.out.println("[2] DISPLAY EMPLOYEE RECORD");
				System.out.println("[3] CHECK IF RECORD IS FULL");
				System.out.println("[4] GET PAYMENT FOR A PARTICULAR EMPLOYEE");
				System.out.println("[5] GET TOTAL NUMBER OF EMPLOYEES");
				System.out.println("[6] CALCULATE TOTAL PAID TO EMPLOYEES");
				System.out.println("[-1] Quit");
				System.out.println();
				System.out.print("Enter a choice [1-7]: ");
				response = sc.nextInt();
				System.out.println();
				
				switch(response) {
					case 1: 
						option1(eList); 
						break;
					case 2: 
						option2(eList); 
						break;
					case 3: 
						option3(eList); 
						break;
					case 4: 
						option4(eList); 
						break;
					case 5: 
						option5(eList); 
						break;
					case 6: 
						option6(eList); 
						break;
					case 7: 
						System.out.println("TESTING COMPLETE"); 
						break;
					default: 
						System.out.print("1-7 only");
				}
			}
		}
		else 
		{
			System.out.println("You opted to take the exit!");
		}
	}
			
	public static void option1(EarningsList earnIn) 
	{	
		System.out.print("Enter Month: ");
		String month = sc.next();
	//	String month;
		double salary = 0, taxFee, insureFee;
		
		taxFee = salary * 0.09;
		insureFee = salary * 0.14;
		
		// prompt for payment details
		
		System.out.println("Enter Amount: ");
		salary = sc.nextDouble();
		
		// create new Earnings object from input
		Earnings p = new Earnings(month, salary, taxFee, insureFee);
		
		// attempt to add earning to list
		boolean ok = earnIn.addEarning(p); // value of false sent back if unable to add
		if (!ok)// check if item was not added
		{
			System.out.println("ERROR: list full");
		}
	}
			
	// DISPLAY
	public static void option2 (EarningsList earnIn)
	{
		System.out.println("ITEMS ENTERED");
		System.out.println(earnIn); // calls toString method of PaymentList
	}
	
	// IS FULL
	public static void option3(EarningsList earnIn)
	{
		if (earnIn.isFull())
		{
			System.out.println("list is full");
		}
		else
		{
			System.out.println("list is NOT full");
		}
	}
	
	// GET PAYMENT
	public static void option4(EarningsList earnIn)
	{
		// prompt for and receive payment number
		System.out.print("Enter payment number to retrieve: ");
		int num = sc.nextInt();
		
		// retrieve Payment object form list
		Earnings p = earnIn.getEarning(num); // returns null if invalid position
		if (p != null)// check if Payment retrieved
		{
			System.out.println(p); // calls toString method of Payment
		}
		else
		{
			System.out.println("INVALID PAYMENT NUMBER"); // invalid position error
		}
	}
	
	// GET TOTAL
	public static void option5(EarningsList earnIn)
	{
		System.out.print("TOTAL NUMBER OF PAYMENTS ENTERED: ");
		System.out.println(earnIn.getEarnList());
	}
	
	// GET TOTAL PAID
	public static void option6(EarningsList earnIn)
	{
		System.out.print("TOTAL OF PAYMENTS MADE SO FAR: ");
		System.out.println(earnIn.calculateTotalEarnings());
	}
}

