package Arrays;

import java.util.Scanner;

public class DynamicInput {
	public static void main(String[] args) {
		// String[] names = new String[size];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number of elements you need in this Array: ");
		int elements = scan.nextInt();
		String[] names = new String[elements];
		
		System.out.println("Please input the Elements: " + elements);
		for (int i = 0; i < names.length; i++) {
			names[i] = scan.next();
		}
		
		System.out.println("Array elements are: ");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("which element you want to find the number of occurance? :");
	    String ele = scan.next();
		int count = 0;
		for (int i = 0; i < names.length; i++) {

			if (ele == names[i]) {
				count++;
			}
		}
		System.out.println("No of occurences of " + ele + " is : " + count);
	}
}
