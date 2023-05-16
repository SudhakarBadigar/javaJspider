package exceptionHanling;

import java.util.Scanner;


public class Atm {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int balance = 10000;
		
		System.out.println("Balance Amount is :" + balance);
		System.out.println("Entere the amount to withdraw:");
		int amt = scan.nextInt();
		
		if(amt <= balance) {
			System.out.println("sufficient balance to withdraw upto : " + balance);
			System.out.println("Withdraw amount :" + amt);
			int remainingBalance = balance - amt;
			System.out.println("Balance amount: " + remainingBalance);
			
		}
		else {
//			try {	
//				throw new InSufficientBalanceException();
//			    }
//			catch(InSufficientBalanceException e) {
//				System.out.println("No sufficient Balance");
//			}
			
			throw new InSufficientBalanceException();
		}
		
		
		//scan.close();
	}

}
