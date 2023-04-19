package Arrays;

public class SumOfArrays {
	public static void main(String[] args) {
		int[] marks= {88,92,78,89,67,88,90};
		
		int sum=0;
		for(int i =0;i<marks.length;i++) {
			
			sum = sum + marks[i];
			System.out.println("sum in loop: " + sum);
		}
		System.out.println("sum of loop outside loop: " + sum);
		System.out.println("Average of marks: " + sum/marks.length);
		
		String[] names;
	    names = new String[4];
	    
	    		
	}

}
