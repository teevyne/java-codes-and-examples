package question14;

public abstract class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private Date birthday; 
	
//	public Employee(String firstName, String lastName, String socialSecurityNumber) {
//		this.birthday = null;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.socialSecurityNumber = socialSecurityNumber;
//	}

	public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthday) {
		//this.birthday = null;
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthday = birthday;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public String toString() {
		return String.format("%s %s%nSSN: %s%nBirth date: %s", getFirstName(), getLastName(), getSocialSecurityNumber(), birthday);
	}
	
	//Asbtract method for the abstract class Employee
	public abstract double earnings();
}
