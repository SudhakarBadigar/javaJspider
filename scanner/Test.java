package scanner;

public class Test {

	int y=10;
	public static void main(String[] args) {
		Test t1 = new Test();
		int x = t1.y;
		System.out.println(x);
		Test t2 = new Test();
		System.out.println(t2.y);
		Test t3 = t1;
		System.out.println(t3.y);
	}
}
