package collectionFramework;

import java.util.Vector;

public class VectorClassex {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add("sud");
		v.add(12.2);
		System.out.println(v);
		System.out.println("..........");
		
		Vector v1 = new Vector(20);
		v1.add(12);
		System.out.println(v1);
		System.out.println("............");
		
		Vector v2 = new Vector(25,5);
		v2.add("third");
		System.out.println(v2);
		System.out.println("............");
		
		Vector v3 = new Vector(v);
		v3.add("four");
		System.out.println(v3);
		
	}
	

}
