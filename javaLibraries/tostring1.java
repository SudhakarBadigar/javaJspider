package javaLibraries;

public class tostring1 {
	
	String name;
	
	public tostring1(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	void printing(){
	  System.out.println(this.name);	
	}
	public static void main(String[] args) {
		tostring1 t = new tostring1("jai Hanuman");
		tostring1 t1 = new tostring1("jai");
		System.out.println(t.name);
		System.out.println(t1.name);
		System.out.println(t);
		System.out.println(t1);
		System.out.println("...........");
		t.printing();
		t1.printing();
	}

}
