package scanner;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter the two numbers");
		int n = scan.nextInt();
		int m = scan.nextInt();
		int result = n + m;
		System.out.println("the value is = " + result );
		scan.close();
		
	}

}
