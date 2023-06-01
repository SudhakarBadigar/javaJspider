package fileHandling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LeapYear {	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE YEAR in yyyy format");
		int year = scan.nextInt();
		if(year%4 == 0) {
			System.out.println("IT IS A LEAP YEAR");
		}
		else {
			System.out.println("it is Not a Leap year");
			
		}
		
		
	}

}
