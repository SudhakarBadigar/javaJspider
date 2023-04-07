package scanner;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	for(int i =1;i<=3;i++) {
    		System.out.println("enter the age");
        	int age = scan.nextInt();
        	System.out.println("yoour age is " + age);
        	System.out.println(".................");
        	
    	}
    	scan.close();
	}
}
