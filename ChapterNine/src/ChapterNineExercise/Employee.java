package ChapterNineExercise;

//Implement the Employee class and CompensationModel hierarchy discussed in this exercise. In addition to the firstName, lastName,
//socialSecurityNumber and CompensationModel instance variables, class Employee should provide:
//1. A constructor that receives three Strings and a CompensationModel to initialize the instance variables.
//2. A set method that allows the client code to change an Employee’s CompensationModel.
//3. An earnings method that calls the CompensationModel’s earnings method and returns its result.

public class Employee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private CompensationModel compensation;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.compensation = compensation;
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

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public CompensationModel getCompensation() {
		return compensation;
	}

	public void setCompensation(CompensationModel compensation) {
		this.compensation = compensation;
	}
	
	public double earnings() {
		return compensation.earnings();
	}
	
}
