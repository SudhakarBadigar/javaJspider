package exceptionHanling;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the nuber a:");
		int a = scan.nextInt();
		System.out.println("enter the nuber b:");
		int b = scan.nextInt();
		System.out.println(a*b);
		
		int max = Integer.MAX_VALUE;
		int result = max + 10;
		System.out.println(result);//integer overflow 

		int x=-5;
		System.out.println(Math.sqrt(x));
		
		
		
		
		
		scan.close();
	}	

}
