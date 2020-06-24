package employeeSolution;

public abstract class Employee implements Payable {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee(String fname, String lname, String ssn) {
		firstName = fname;
		lastName = lname;
		socialSecurityNumber = ssn;
	}
}