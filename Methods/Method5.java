//with arguments and with return type.
package Methods;

public class Method5 {
	int findsquare(int n){
		return n*n;
	}
	public static void main(String[] args) {
		Method5 m = new Method5();
		int square = m.findsquare(5);
		int square1 = m.findsquare(4);
		int square2 = m.findsquare(6);
		System.out.println("the square of n is "+ square );
		System.out.println("the square of n is "+ square1 );
		System.out.println("the square of n is "+ square2 );
				
	}

}
