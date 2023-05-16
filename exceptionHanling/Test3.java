package exceptionHanling;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			 System.out.println(e.getMessage());
		}
		finally{
			System.out.println("finally block");
		}
		
		System.out.println("end");
	}
}
