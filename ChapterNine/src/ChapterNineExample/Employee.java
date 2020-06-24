package ChapterNineExample;

//The common attributes and behaviors for all Employees are firstName, lastName, socialSecurityNumber,
//getFirstName, getLastName, getSocialSecurityNumber and a portion of method
//toString.

public class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
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
	
	public String toString() {
		return String.format(
				"%s: %s %s%n%s%s","The employee in consideration", firstName, lastName, "Social security number: ", socialSecurityNumber);
	}
}
