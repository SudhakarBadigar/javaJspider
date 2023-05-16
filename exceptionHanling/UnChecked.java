package exceptionHanling;

public class UnChecked {

	void m1() throws ArithmeticException {
		System.out.println(10/0);
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		UnChecked u = new UnChecked();
		try {
			u.m1();		
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("..........");
			System.out.println(e.getMessage());
			System.out.println("..........");
			System.out.println(e);
		}
		System.out.println("end");
	}
	
}
