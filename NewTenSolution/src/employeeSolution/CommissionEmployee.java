package employeeSolution;

public class CommissionEmployee extends Employee {
	
	public CommissionEmployee(String fname, String lname, String social) {
		super(fname, lname, social);
	} 

	@Override
	public double getPaymentAmount() {
		return 0;
	}

}
