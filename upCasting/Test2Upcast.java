package upCasting;
class Vehicle{
	int wheel;
	String color;
	double cost;
}
class Bike extends Vehicle{
	int wheel=2;
	String color = "green";
	double cost = 120499.49;
}
class Car extends Vehicle{
	int wheel=4;
	String color="grey";
	double cost = 1050000.00;
}
class Test2Upcast {
public static void main(String[] args) {
	Vehicle v = new Bike();
	
	System.out.println(v.wheel);
	System.out.println(v.color);
	System.out.println(v.cost);
	System.out.println("..............");
	Bike b = (Bike)v;
	System.out.println("Bike specification");
	System.out.println("Number of wheels: "+b.wheel);
	System.out.println("color: "+b.color);
	System.out.println("Bike cost:"+b.cost);
	System.out.println("..........");
	Vehicle v1 = new Car();
	Car c = (Car) v1;
	System.out.println("Car specification");
	System.out.println("Number of wheels:"+c.wheel);
	System.out.println("Color: "+c.color);
	System.out.println("car cost: "+c.cost);
	System.out.println("..........");
	System.out.println(c instanceof Car);
	System.out.println(c instanceof Vehicle);
	System.out.println(b instanceof Bike);
	System.out.println(b instanceof Vehicle);
	System.out.println(v instanceof Vehicle);
	System.out.println(v1 instanceof Vehicle);
}
}
