package interfaceKeyword;

interface ReserveBank{
	void deposit();
}

interface SbiBank extends ReserveBank{
	//2 abstract methods available here. 
	String accountHolderName="Harry";
	void withdraw();
}
public class AccountHolder implements SbiBank {
	
	@Override
	public void deposit (){
			System.out.println("Reserve bank deposit");
	}
	
	@Override
	public void withdraw() {
			System.out.println("Sbi bank Withdraw");
	}
	
	public static void main(String[] args) {
		System.out.println(SbiBank.accountHolderName);
		AccountHolder a = new AccountHolder();
		a.deposit();
		a.withdraw();
	}
	

}
