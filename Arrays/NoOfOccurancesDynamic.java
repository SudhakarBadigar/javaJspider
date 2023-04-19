package Arrays;

import java.util.Scanner;

public class NoOfOccurancesDynamic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements you want: ");
		int size = scan.nextInt();
		
		String[] names = new String[size];
		System.out.println("enter the elements ");
		
		
		for(int i =0;i<names.length;i++) {
			names[i] = scan.next();
		}
		
		System.out.println("Elements inside the arrays are : ");
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i] +" index is = " + i);
		}
		
		System.out.println("The Number of Appeance of element? which element you want to check: ");
		String element = scan.next();
		int count = 0;
		for(int i=0;i<names.length;i++) {
			if(element == names[i]) {
				count++;

			}
			
		}
		System.out.println(element + " Appeared : " +count);
		scan.close();
	}

}
