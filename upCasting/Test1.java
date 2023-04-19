package upCasting;

class Vehicle2{
	String Brand = "Audi";
}

class Car12 extends Vehicle2{
	String fuel ="petrol";
}

class Bike12 extends Vehicle2{
	int cost = 5000;
}

public class Test1 {
	public static void main(String[] args) {
		Car12 c1 = new Car12();
		System.out.println(c1.Brand);
		System.out.println(c1.fuel);

	}
}
