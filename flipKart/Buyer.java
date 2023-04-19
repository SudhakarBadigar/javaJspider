package flipKart;

import java.util.Scanner;

public class Buyer {
	public static void main(String[] args) {
		Flipkart f = new Flipkart();
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your order");
		int	n = scan.nextInt();
		Electronics obj = f.orders(n);
		System.out.println("Your Order is : ");
		if(obj instanceof Laptop) {
			System.out.println("Laptop");
		}
		else if(obj instanceof Mobile) {
			System.out.println("Mobile");
		}
		else if(obj instanceof Watch) {
			System.out.println("Watch");
		}
		else if(obj instanceof WashingMachine) {
			System.out.println("Washing Machine");
		}
		else {
			System.out.println("order unavailable");
		}
	   scan.close();	
	}
	
}
