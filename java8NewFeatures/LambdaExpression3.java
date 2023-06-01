package java8NewFeatures;

import java.util.Scanner;

@FunctionalInterface
interface SquareIt{
	public abstract int m1 (int num);
}

//class Demo3 implements SquareIt{
//	@Override
//	public int m1(int n){
//		return n*n;
//		
//	}


//}
public class LambdaExpression3  {

	public static void main(String[] args) {
		SquareIt d =num->num*num; //(num)->System.out.println("Square of the number "+ num +" is "+ return num * num);
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		int square = d.m1(num);
	//	int num = d.m1(5);
		System.out.println("Square of the number "+ num +" is "+ square);
	//	System.out.println(square);
		scan.close();
	}
}
