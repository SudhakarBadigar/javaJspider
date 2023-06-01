package java8NewFeatures;

import java.util.Scanner;

//@FunctionalInterface
interface interf{
	public abstract void add(int a,int b);
	
    //void m2();
}

//class Demo2 implements interf{
//
//	@Override
//	public void add(int a, int b) {
//		int sum = a+b;
//		System.out.println("sum = " + sum );
//	}
//	
//}

public class LambdaExpression2 {
	public static void main(String[] args) {
		interf d = (a,b)->System.out.println("sum = " +(a+b));
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a =scan.nextInt();
		int b=scan.nextInt();
		d.add(a, b);
		scan.close();
	}

	
}
