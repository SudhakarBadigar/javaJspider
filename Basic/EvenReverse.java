//print even numbers in reverse order i.e: 10 8 6 4 2 

package Basic;

public class EvenReverse {

	public static void main(String[] args) {
	
		for (int i = 10; i>=0;i-=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("...........................");
		
		int j =10;
		while (j>=0) {
			System.out.print(j + " ");
			j-=2;
		}
		System.out.println();
		System.out.println(".....................");
		
		int k = 10;
		do {
			System.out.print(k + " ");
			k-=2;
		}while(k>=0);
		
			
	}

}
