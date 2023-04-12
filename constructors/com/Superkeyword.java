package constructors.com;

class parent{
	int age = 50;
}

class child extends parent{
	int age = 30;
	
	void display() {
		int age = 10;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
	}
}


public class Superkeyword {
	public static void main(String[] args) {
		child c = new child();
		c.display();
	}

}
