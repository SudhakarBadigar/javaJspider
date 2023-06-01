package java8NewFeatures;

@FunctionalInterface
interface work{
	public abstract void m1();
	public static void m2() {
		System.out.println("static m2 method");
	}
	
	public default void m3() {
		System.out.println("default m3 method");
	}
}
public class Lambdaexp1 implements work{

	
	public static void main(String[] args) {
		System.out.println("hello");
		
		
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}
