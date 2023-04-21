package abstraction;
abstract class P{
	abstract void work();
}

public class Person2 extends P{
	@Override
	void work(){
		
		System.out.println("overiden work");
	}
	
	public static void main(String[] args) {
		Person2 p1 = new Person2();
		p1.work();
	}

}
