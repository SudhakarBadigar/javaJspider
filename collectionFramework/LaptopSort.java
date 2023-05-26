package collectionFramework;

import java.util.Comparator;

public class LaptopSort{

	String brand;
	Double cost;
	String ram;
	
	LaptopSort(String brand, double cost, String ram) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "Laptop [ Brand: " + this.brand + ", cost: " + this.cost + " ,Ram: " +this.ram +" ]";
		
	}
	
}
	
	
	
	
	
	
	