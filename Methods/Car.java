package Methods;


public class Car {

	int cost = 10000;
	String BrandName = "Hyundai";
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println(c1.BrandName +" price is " + c1.cost);
		System.out.println(c2.BrandName + " price is "+ c2.cost);
		c2.BrandName = "Mahindra xuv 700";
		c2.cost = 200000;
		System.out.println("....................");
		System.out.println(c1.BrandName + " price is " + c1.cost);
		System.out.println(c2.BrandName + " price is " + c2.cost);
		
	}
	
}
