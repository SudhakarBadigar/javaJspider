package java8NewFeatures;

@FunctionalInterface
interface AA{
	 void m1();//public abstract is default in abstract methods inside interface.
}

// class Demo implements AA{
//
//	@Override
//	public void m1() {
//		System.out.println("Hello this is old one");
//	}
//	
//}
public class LambdaExpressionEx1 {
	public static void main(String[] args) {
		AA d = ()->System.out.println("this is Lambda Expression");
		d.m1();
	}

}
