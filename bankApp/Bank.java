package bankApp;

public class Bank implements Atm {

	double balance = 10000;
	@Override
	public void deposit(double amt) {
		System.out.println("Previous Balance:"+balance);
		balance += amt;
		System.out.println("Amount deposited :" +amt);
		
	}
	
	@Override
	public void withdraw(double amt) {
		balance -= amt;
		System.out.println("Withdraw Amount is : "+amt);
		
		}
	
	@Override
	public void checkBalance() {
		System.out.println("Available Balance = " + balance);
		
	}
	
	
	
	

}
