package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistConstructor {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add("sudhi");
		l1.add(12.3);
		l1.add(true);
		l1.add(12.4f);
		
		System.out.println(l1);
		System.out.println("............");
		for(Object obj : l1) {
			System.out.println(obj);
		}
		
		System.out.println(".................");
		ArrayList l2 = new ArrayList(20);
		l2.add(20);
		l2.add("prabhu");
		System.out.println(l2);
		
		System.out.println("..............");
		
		ArrayList l3 = new ArrayList(l1);
		l3.add("krishna");
		System.out.println(l3);
		
		
	}

}
