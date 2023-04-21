package abstraction;

public abstract class Person {
	void work() {
		
	}
	abstract void eat() ;{
		System.out.println("instance");
	}
	public static void main(String[] args) {
		System.out.println("start");
		// we cannot create an object to an abstract class.
		//Person p= new Person();
		System.out.println("end");
	}

}
