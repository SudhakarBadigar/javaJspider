package javaLibraries;

public class Laptop {
	int cost;
	String brand;
	String ram;
	String memory;
	
//	Laptop(int cost,String brand,String ram,String memory){
//		this.cost=cost;
//		this.brand=brand;
//		this.ram=ram;
//		this.memory=memory;
//      }
	
	
	public String toString() {
		return "Cost: " + this.cost+
				"\nBrand: " + this.brand+
				"\n Ram :" + this.ram+
				"\n Memory: " + this.memory;
	}
	
	//alt + shift + s 
	public Laptop(int cost, String brand, String ram, String memory) {
		super();
		this.cost = cost;
		this.brand = brand;
		this.ram = ram;
		this.memory = memory;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public static void main(String[] args) {
		Laptop l1= new Laptop(85000, "Dell", "8gb", "512ssd");
		Laptop l2= new Laptop(55000, "Lenovo", "6gb", "812ssd");
		Laptop l3= new Laptop(86000, "Acer", "4gb", "412ssd");
		Laptop l4= new Laptop(145000, "Apple", "16gb", "512ssd");
		Laptop l5= new Laptop(65550, "HP", "8gb", "512ssd");
		
//		Laptop[] e = new Laptop[5];
//		
//		e[0] = l1;
//		e[1] = l2;
//		e[2] = l3;
//		e[3] = l4;
//		e[4] = l5;
		
		Laptop[] l = {l1,l2,l3,l4,l5};
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
			System.out.println("..........");
		}
	}
}
