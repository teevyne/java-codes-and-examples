package ChapterNineExamples;

public class Employee {
	private String firstName;
	private String lastName;
	private String ssNumber;
	private CompensationModel commission;
	
	public Employee() {}

	public Employee(String firstName, String lastName, String ssNumber, CompensationModel commission) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssNumber = ssNumber;
		this.commission = commission;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsNumber() {
		return ssNumber;
	}

	public void setSsNumber(String ssNumber) {
		this.ssNumber = ssNumber;
	}

	public CompensationModel getCommission() {
		return commission;
	}

	public void setCommission(CompensationModel commission) {
		this.commission = commission;
	}	
	
	public double earning() {
		return commission.earning();
	}
}
