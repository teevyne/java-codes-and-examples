package abstractClassExample;

public class PayrollSystemTest {
	public static void main (String[] args) {
		SalariedEmployee salariedEmployee = new SalariedEmployee("James", "Anthony", "111-101-222", 1090);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Steve", "Jobs", "222-202-333", 15.76, 43);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Savee", "Anderson", "333-313-444", 0.15, 34763.57);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Abiodun", "Scoapee", "444-424-555", 0.13, 42214.00, 9000);
		PieceWorker pieceWorker = new PieceWorker("Femi", "Akala", "212-323-000", 19.90, 48);
	
		System.out.println("Employees processed individually:");
		
		System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", pieceWorker, "earned", pieceWorker.earnings());
		
		//Creating a four-element array of Employee
		Employee[] employees = new Employee[5];
		
		// initialize array with Employees
		employees[0] = salariedEmployee; //first element in the array is object SalariedEmployee
		employees[1] = hourlyEmployee;	 //second element of the lot is object HourlyEmployee
		employees[2] = commissionEmployee;	//third is an object of CommissionEmployee
		employees[3] = basePlusCommissionEmployee;	//Last is an object of BasePlusCommissionEmployee
		employees[4] = pieceWorker; //Newly-introduced object of PiecWorker
		
		System.out.printf("Employees processed polymorphically:%n%n");
		
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee);
			
			if (currentEmployee instanceof BasePlusCommissionEmployee){ //If element is an instance of BasePlusCommissionEmployee
				// downcast Employee reference to BasePlusCommissionEmployee reference
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee; //..and then Store the present employee in the array in a variable of BasePlusCommEmp
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
			} // end if	
			
			System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
		} // end for
		
		// get type name of each object in employees array
		for (int j = 0; j < employees.length; j++)
			System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
	}
}
