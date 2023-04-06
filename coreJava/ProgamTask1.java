package coreJava;

import java.util.Scanner;

public class ProgamTask1 {
	public static void main(String[] args) {
		
		//print even numbers from 1 to 10.
		for(int i = 0; i<=10; i+=2) {
		
			System.out.println(i);
		}
		
		System.out.println("...............");
		
		//print odd numbers from 1 to 10.
		
		for(int j = 1;j<=10; j+=2) {
			System.out.println(j);
		}
		System.out.println(".................");
		//print multiples of 3 from 1 to 15. 
		
		for(int k =1;k<=15;k++) {
			System.out.println("3 * " + k + " = " + k*3);
		}
		System.out.println("...........");
		
		//sum of n natural numbers
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		int n;
		System.out.println("enter the number to sum:");
		n = scanner.nextInt();
		for(int a = 1;a<=n; a++) {
//		 System.out.println(a);
		 
		 sum = sum + a;
		}
		System.out.println(sum);
		System.out.println("...............");
		int c = 3;
		System.out.println(c++ * 8);
				

		
		System.out.println("........................");
		
		int d = 5;
			do {
			System.out.println(d);
			d++;
		}while(d<=10);
		
		System.out.println(d);
		System.out.println("........................");
//print 5 4 3 2 1 using while loop
		int e = 5;
		while (e>=1) {
			System.out.println(e);
			e--;
		}
		
		System.out.println("-----------------");
		//print 5 4 3 2 1 in do-while loop
		
		int f = 5;
		do {
			System.out.println(f);
			f--;
		}while(f>=1);
		
		
		
}}







