package Arrays;

import java.util.Scanner;

public class DynamicIputInt {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many Elements you want to create :");
		int size = scan.nextInt();
		//Array creation
		int[] certificates= new int[size];
		
		//Array insertion
		System.out.println("insert the elements in the Array : ");
		
	     	for(int i=0;i<certificates.length;i++) 
	     	{
		    	certificates[i]= scan.nextInt();
					
		    }
	     	
	     	//Display array elements
	     	System.out.println("Array elements are : ");
	     	
	     	for(int i = 0;i<certificates.length;i++)
	     	{
	     		System.out.println(certificates[i]);
	     	}
	     	
	     	//to find the element that has occurred the no of times
	     	
	     	System.out.println("which element you want to know how many times it has occurred? : ");
	     	int element = scan.nextInt();
	     	int count =0;
	     	for(int i =0;i<certificates.length;i++) {
	     		if(element==certificates[i]) {
	     			count++;
	     		}
	     	}
	     	System.out.println("The Number of times " + element+ " has occured: "+count);
	     	
	     	
	     	
	}
}
