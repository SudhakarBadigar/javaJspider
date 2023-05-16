package stringpool;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
		String newstring = " t";
		char c;
//		System.out.println("enter the String you want to reverse");
		String s = "Mysore";
//		scan.nextLine();
//		scan.nextLine();
		//System.out.println(c);
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			newstring = c +newstring;
		}
		
		System.out.println("Reverse order :" + newstring);
//		scan.close();
	}

}
