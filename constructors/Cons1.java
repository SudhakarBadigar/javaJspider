package constructors;
class Test{
	Test(int age){
		System.out.println("super");
	}
}

public class Cons1 extends Test{
	
	int age;
	Cons1(int age){
		super(10);
		this.age = age;
		System.out.println(age);
		}
	
	public static void main(String[] args) {
		System.out.println("start");
		Cons1 c1 = new Cons1(22);
		System.out.println("end");
		
	}

}
