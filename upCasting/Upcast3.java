package upCasting;

class Father1 {
	int age = 55;
	static String name = "Krishna";
}

class Son1 extends Father1 {
	int age = 22;
}

class Daughter1 extends Father1 {
	int age = 20;
	static String name="parvathi";
}

public class Upcast3 {
	public static void main(String[] args) {
		Father1 f = new Son1();
		System.out.println(f.age);
		System.out.println(Father1.name);
		System.out.println(Daughter1.name);
		System.out.println(f instanceof Father1);
		System.out.println(f instanceof Son1);
		System.out.println(f instanceof Daughter1);
		System.out.println(new Son1() instanceof Father1);
		System.out.println(new Son1() instanceof Son1);
		

	}
}
