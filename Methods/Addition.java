//create a method which will add two numbers 
//without return statement without arguments
package Methods;

public class Addition {
	
	void add(){
		int x = 10;
		int y = 20;
		int sum = x+y;
		System.out.println("Addition of "+ x +" and "+ y+" is  = " + sum );
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		Addition a = new Addition();
		a.add();
		System.out.println("end");
		
	}

}
