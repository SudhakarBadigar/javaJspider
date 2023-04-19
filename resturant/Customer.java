package resturant;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("******");
		System.out.println("1.Breakfast");
		System.out.println("2.Lunch");
		System.out.println("3.Snacks");
		System.out.println("4.Dinner");
		System.out.println("5.Coffee");
		System.out.println("*********");
		System.out.println("Hello please give your order");
		
		
		Hotel h = new Hotel();
		Food obj = h.orderfood(scan.nextInt());
		if(obj instanceof Breakfast) {
			System.out.println("ordered Breakfast");
		}
		else if (obj instanceof Lunch) {
			System.out.println("ordered Lunch");
		}
		else if(obj instanceof Snacks) {
			System.out.println("ordered snacks");
		}
		else if (obj instanceof Dinner) {
			System.out.println("ordered Dinner");
		}
		else if(obj instanceof Coffee) {
			System.out.println("ordered only coffee");
		}
		else {
			System.out.println("Hope you get Hungry soon!");
		}
			
	
	}

}
