package exceptionHanling;

public class FinallyBlockEx {
	public static void main(String[] args) {
		System.out.println("starts");
		try {
			System.out.println(10/0);
		}
//		catch(Exception e) {
//			
//		}
		
		//finally block always execute either you handle the exception or not but you cannnot
		//use finally block without try (or) try/catch block.
		finally{	
			System.out.println("finallyBlock");
		}
		System.out.println("ends");
		
	}

}
