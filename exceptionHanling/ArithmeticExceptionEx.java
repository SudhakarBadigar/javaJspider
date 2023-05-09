package exceptionHanling;

import java.util.Scanner;

public class ArithmeticExceptionEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a:");
		int a = scan.nextInt();
		System.out.println("enter b:");
		int b = scan.nextInt();
		

		//Arithmetic exception cant divide by zero
		try {			
			System.out.println(a/b);
		    }
		
		catch(ArithmeticException e){
			System.out.println("Dont divide by zero");
			}
		

		
	
		int x =Integer.MAX_VALUE;
		try {
			System.out.println(Math.addExact(x, 1));
			
		}
		catch(ArithmeticException e) {
			
			System.out.println("integer overfow occurs" + e.getMessage());
			
		}
		
		//invalid argument int y = -5

		double  y = -5.0;
		try {
			double result = Math.sqrt(y);
			System.out.println(result);
		}
		catch(ArithmeticException e1) {
			System.out.println("negative numbers cant produce squareroot" + e1.getMessage());
		}
	
	}

}
