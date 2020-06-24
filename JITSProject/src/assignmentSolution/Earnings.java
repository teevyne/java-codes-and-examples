package assignmentSolution;

/*
 * The local group requires a program to manage 
 * one of its subsidiaries, which holds a number of 
 * employee, each of whom earns a single income as gross 
 * (and less deductions for tax and insurance, earn a net 
 * salary). The program must keep a record of employees and 
 * their earnings. Details of the employee would be their name,
 *  department, ID, and monies paid and collected from the employee. 
 *  The program should let user delete and add employees as needed, 
 *  to display a list of all employees, record details for a particular 
 *  employee and display the earnings history of the employee.

The two core classes required would be Emplyee class to record 
details of an employee and Earnings class to store details of 
a payment.

Task 1
Implement a system that keeps details of a company's employees, 
and records their monthly wage payments and deductions for tax 
and national insurance. The system must be able to provide a 
series of reports, for example displaying pay slips for individual 
employees, including net pay and gross pay.
 * */

public class Earnings {

	private String month;
	private double salary;
	private double taxCharge;
	private double insuranceCharge;
	
	public Earnings(String aMonth, double aSalary, double taxCharge, double insuranceCharge) {
		month = aMonth;
		salary = aSalary;
		this.taxCharge = taxCharge;
		this.insuranceCharge = insuranceCharge;
	}
	
	public String getMonth() {
		return month;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double getTaxCharge() {
		taxCharge = taxCharge * 0.09;
		return taxCharge;
	}
	
	public double getInsuranceCharge() {
		insuranceCharge = insuranceCharge * 0.014;
		return insuranceCharge;
	}
	
	public double getNetSalary() {
		return getSalary() - (getTaxCharge() + getInsuranceCharge());
	}
	
	public String toString() {
		return "Salary for " + month + " is " + salary + " and Net Salary is " + getNetSalary();
	}
}