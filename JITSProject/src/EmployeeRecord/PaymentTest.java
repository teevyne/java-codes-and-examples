package EmployeeRecord;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment pay = new Payment("January", 175.0);
		System.out.printf("%s = %.2f%n", pay.getMonth(), pay.getAmount());
		System.out.println(pay);
	}

}
