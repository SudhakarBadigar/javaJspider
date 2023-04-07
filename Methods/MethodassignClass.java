package Methods;

public class MethodassignClass {
	public static void main(String[] args) {
		MethodAssign ma1 = new MethodAssign();
		ma1.m1();
		ma1.m2(25);
		String company = ma1.m3();
		System.out.println(company);
		System.out.println(ma1.m3());
		System.out.println(".................");
		int squareroot = ma1.m4(6);
		System.out.println(squareroot);
		System.out.println(ma1.m4(7));
	}

}
