package scanner;

import java.util.Scanner;

public class SolutionPositiveNegative {
	public static void main(String[] args) {
		PositiveOrNegative p = new PositiveOrNegative();
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			 System.out.println("enter the value = ");
			int value = scan.nextInt();
			p.checkNumber(value);
		}
		scan.close();
	}

}
