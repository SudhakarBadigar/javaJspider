package bankApp;

import java.util.Scanner;

class AccountHolder{
	public static void main(String[] args){

		System.out.println("Welcome to American Express Bank");
		while(true) {
			
			Scanner scan = new Scanner(System.in);
			Atm a = new Bank();
			Bank b = (Bank) a;
			
			System.out.println("Enter Your Choice :\n1.deposit\n2.Withdraw \n3.Loan \n4.Checkbalance \n5.exit");
			System.out.println("....................................");
			int choice = scan.nextInt();
			//scan.nextLine();
			
			switch(choice) {
			
			case 1: 
				System.out.println("Enter the amount you want to deposit");
				double dep = scan.nextDouble();
				a.deposit(dep);
				a.checkBalance();
			//	System.out.println("............................");
				break;
				
			case 2: 	
				System.out.println("Enter the amount you want to withdraw ");
				double withdraw = scan.nextDouble();
				System.out.println("current balance :" +b.balance);
				a.withdraw(withdraw);
				a.checkBalance();
				//System.out.println(".....................");
				break;
				
			case 3:			
				System.out.println("Enter the Loan You Required");
				double ln = scan.nextDouble();
				a.Loan(ln);
				//System.out.println("................");
				break;

			case 4:
				a.checkBalance();
				break;
			
			case 5:
				System.out.println("Thank you for Banking");
				System.exit(0);
			
			default : 
				System.out.println("invalid Choice");
				
			}
			System.out.println(".......................");
			//scan.close();
		}
	}
}