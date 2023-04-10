package scanner;

import java.util.Scanner;

public class StaticAdd {
	
	static void add(int a,int b) {
		System.out.println("sum of " + a + " and "+ b + " = " +(a+b));
	}
	
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("enter the first number");
	  int a = scan.nextInt();
	  System.out.println("ener the second number");
	  int b = scan.nextInt();
	  StaticAdd.add(a, b);
	  
	  System.out.println(".......................");
	  Scanner scanner = new Scanner(System.in);

	  System.out.print("Enter a number: ");
	  String userInput = scanner.nextLine();

	  try {
	      int userNumber = Integer.parseInt(userInput);
	      System.out.println("You entered: " + userNumber);
	  } catch (NumberFormatException e) {
	      System.out.println("You entered: " + userInput);
	  }
	  scan.close();

	  scan.close();
	}

}
