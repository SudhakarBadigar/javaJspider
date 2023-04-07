package scanner;

import java.util.Scanner;

public class NextNextLine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name ");
		String word1 = scan.nextLine();
		System.out.println("you entered the name as = "+ word1);
		

		scan.close();
	}

}
