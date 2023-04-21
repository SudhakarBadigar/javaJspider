package polymorphism;
public class CTPolymorphism {
	void m1(int ProductId){
		System.out.println("Id" + ProductId);
	}
	void m1(int ProductId,String ProductName) {
		System.out.println("Id, ProductName:" + ProductId+" "+ ProductName );
	}
	void m1(String ProductName,int cost) {
		System.out.println("ProdName , cost " + ProductName +" "+ cost);
	}
	void m1(String ProductName) {
		System.out.println("ProdName " + ProductName);
		
	}
	
	public static void main(String[] args) {
		CTPolymorphism c = new CTPolymorphism();
		c.m1(101);
	     c.m1(102, "mi Head phones");
		c.m1("Headphones");
		c.m1("Sony", 103);
	}

}
