package accounts;

public class Account {
	private double balance;
	private String firstName;
	private String lastName;
	
	public Account () {}
	
	public Account (String firstName, String surname, double amount) {
		this.firstName = firstName;
		lastName = surname;
		this.balance = amount;
	}
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String aLastName) {
		this.lastName = aLastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setBalance(double amount) {
		this.balance = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void processAccount(int task, double amount) {
		if (task == 1) { //deposit
			this.balance += amount;
		} else if (task == 2) {
			this.balance -= amount;
		}
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
}
