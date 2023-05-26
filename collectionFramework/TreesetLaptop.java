package collectionFramework;

import java.util.TreeSet;

public class TreesetLaptop {

	public static void main(String[] args) {
		LaptopSort l1 = new LaptopSort("Dell",76000.34,"16gb");
		LaptopSort l2 = new LaptopSort("Lenovo",76000.22,"4gb");
		LaptopSort l3 = new LaptopSort("Acer",76000.04,"4gb");
		LaptopSort l4 = new LaptopSort("Apple",122000.84,"32gb");
		LaptopSort l5 = new LaptopSort("Hp",66000.14,"8gb");
		LaptopSort l6 = new LaptopSort("Thinkpad MI",33000.24,"6gb");

		
		//System.out.println(l1);
		ComparatorLaptopSort cost = new ComparatorLaptopSort();
		TreeSet<LaptopSort> t = new TreeSet<LaptopSort>(cost);
		t.add(l1);
		t.add(l2);
		t.add(l3);
		t.add(l4);
		t.add(l5);
		t.add(l6);
		
		for(LaptopSort s: t) {
			System.out.println(s);
		}
		
	}
	
	
	
}
