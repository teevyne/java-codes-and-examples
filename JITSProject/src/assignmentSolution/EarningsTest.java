package assignmentSolution;

import java.util.Scanner;
public class EarningsTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a month: ");
		String theMonth = sc.nextLine();
		
		System.out.print("Enter the salary: ");
		double theSalary = sc.nextDouble();
		
		double taxFee = theSalary * 0.09;
		double insureFee = theSalary * 0.14;
		
		Earnings earns = new Earnings(theMonth, theSalary, taxFee, insureFee);
		
		System.out.println(earns);
		
		sc.close();
	}

}
