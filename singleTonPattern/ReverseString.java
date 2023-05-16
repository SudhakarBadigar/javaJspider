package singleTonPattern;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		
		String s = scan.next();
		
		char[] c = s.toCharArray();
		
		System.out.println("Reversed String is :");
		for(int i= c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
		
		
		
		
		scan.close();
	}

}
