package calculatorUsingAbstraction;

public class Solution  implements Calculator{

	@Override
	public void addition(double a,double b) {
		double sum = a+b;
		System.out.println("Addition of two numbers is  :" +sum);
		}

	@Override
	public void subtract(double a,double b) {
		double sub = a-b;
		System.out.println("Subtraction of two Numbers is :" +sub);
	}

	@Override
	public void multiplication(double a,double b) {
		double mul = a*b;
		System.out.println("Multiplication of two Numbers is: " + mul);
	}

	@Override
	public void division(double a, double b) {
		double div = a/b;
		System.out.println("Division of two numbers is : "+div);
		
	}

	@Override
	public void percentage(double percentage,double per1) {
		double p = (percentage / 100) * per1;
		System.out.println("Percentage is : " + p);
		
	}

	@Override
	public void exponential(double a) {
		double exp = a*a;
		System.out.println("Exponential is : "+ exp);
		
	}

	@Override
	public void modRemainder(double a,double b) {
		double mod = a % 2;
		System.out.println("Modulus is : "+mod);
		
	}

}
