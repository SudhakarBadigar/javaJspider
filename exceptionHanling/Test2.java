package exceptionHanling;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("start");
		int[] a = {10,20,30};
		
		try {
		System.out.println(a[100]);
		}
//		finally int b = 10;
		catch(ArithmeticException e) {
			System.out.println("arithmetc ex");
		}
		catch(NullPointerException e ) {
			System.out.println("Nullpointer");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("invalid array number: "+ e.getMessage());
			//System.out.println(e);
		}
		
		catch (Exception e) {
			System.out.println("Exception");
		}
		
		
		System.out.println("end");
	}

}
