//with arguments and without return statement
package Methods;

public class Method2 {
	
	void add(int a,int b){
		System.out.println(a);
		System.out.println(b);
		System.out.println("the sum of the two numbers is = " + (a+b));	
	}
	
	public static void main(String[] args) {
		int a=1;
		Method2 method = new Method2();
		method.add(10, 40);
		method.add(20, 50);
		System.out.println(a);
		
	}
	

}
