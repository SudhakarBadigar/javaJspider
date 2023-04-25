package bankApp;

public interface Atm {
	void deposit(double amt);

	void withdraw(double amt);

	void checkBalance();

	default void Loan(double loan) {
		double roipm = (5.0 / 100.0) * loan;
		double roipy = ((12.0 * 5.0) / 100) * loan;
		System.out.println("Rate of interest for the Loan per Month is: " + roipm);
		System.out.println("Rate of interest for the Loan per Year is: " + roipy);
	}
}
