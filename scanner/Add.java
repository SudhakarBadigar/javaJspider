package scanner;

import java.util.Scanner;

public class Add {
	
	void addition(int a, int b){
		int sum= a+b;
		System.out.println("the addition of " + a + " and " + b + " is = " + sum);
	}
	
	public static void main(String[] args) {
		Add a = new Add();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number");
		int num1 = scan.nextInt();
		System.out.println("enter the second number");
		int num2 = scan.nextInt();
		a.addition(num1,num2);
		scan.close();
	}

}
