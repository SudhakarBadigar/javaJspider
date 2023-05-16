package exceptionHanling;

public class CheckedException {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			System.out.println(i);
			try {		
				Thread.sleep(0);
			    }
			catch(InterruptedException e) {
				System.out.println(e);
				System.out.println("...........");
				e.printStackTrace();
				System.out.println("...........");
				System.out.println(e.getMessage());	
			}
		}
	}
}
