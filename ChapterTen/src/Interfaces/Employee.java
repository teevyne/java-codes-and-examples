package Interfaces;

public abstract class Employee implements Payable {
		private final String firstName;
		private final String lastName;
		private final String socialSecurityNumber;
		
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
			return String.format("%s %s%nSSN: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
		}
		
		//The method getPaymentAmount which is present in the Payable interface from which class Employee realises, therefore
		//this class must be made abstract. This is because, a class realising an interface must either provide implementation 
		//for all the classes stated in the interface it is realising or be declared abstract
		//We cannot calculate payment to be made to a generic employee. We have to know the specifics.
}
