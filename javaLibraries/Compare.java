package javaLibraries;

import java.util.Scanner;

public class Compare {
	int age;
	String name;
	String location;
	
	Compare(int age,String name,String location){
		super();	
		this.age = age;
		this.name = name;
		this.location = location;
	}
	
    public boolean equals(Compare c){
    	return this.age == c.age;
		//System.out.println(".........");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Age");
		int age = scan.nextInt();
		System.out.println("enter Name");
		String name = scan.nextLine();
		scan.nextLine();
		System.out.println("enter Location");
		String location = scan.nextLine();
		//scan.nextLine();
		
		Compare c1 = new Compare(age,name,location);
		Compare c2 = new Compare(23,"Krishna","Udupi");
		
		System.out.println(c1 == c2);
		if(c1.equals(c2)){
			System.out.println("............");
			System.out.println("contents are same ");
		}
		else
		{
			System.out.println("..............");
			System.out.println("contents are different");
		}
	}
	
	

}
