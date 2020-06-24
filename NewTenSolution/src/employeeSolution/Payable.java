package employeeSolution;

import exceptionClass.PayableException;

public interface Payable {
	double getPaymentAmount() throws PayableException;
}
