package coreJava;

public class Forloop {

	public static void main(String[] args) {
		// print hello 10 times
		
		for(int i =1; i<=10;i++) {
			System.out.println( i + ".Hello world");
		}
		System.out.println("....................");
		// print 146 147 148 149 150
		
		for( int j = 146;j<= 150 ;j++ ) {
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println(".........................");
		///print 5 4 3 2 1 
		
		for (int k=5;k>=1;k--) {
			System.out.println(k + " ");
		}
		System.out.println("................");
		
		//print 2 4 6 8 10
		
		for(int a = 2;a<=10 ; a+=2) {
			System.out.println(a);
		}
		System.out.println("....................");

		//print 1 3 5 7 9
		
		for (int b=1; b<=9;b=b+2) {
			System.out.println(b);
		}
	}

}
