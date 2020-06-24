package ChapterNineExample;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
		
		System.out.println("Employee information obtained by get methods:");
		System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is", employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %s%n", "Gross sales is", employee.getGrossSales());
		System.out.printf("%s %s%n", "Commission rate is", employee.getCommissionRate());
		
		employee.setGrossSales(5000);
		employee.setCommissionRate(.1);
		System.out.printf("%n%s:%n%n%s%n",
		"Updated employee information obtained by toString", employee);
	} // end main
		
}