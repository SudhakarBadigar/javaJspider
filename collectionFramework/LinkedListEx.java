package collectionFramework;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		System.out.println(l1);
		l1.add(10);
		l1.add(10);
		l1.add(null);
		l1.add("java");
		l1.add("object");
		
		System.out.println(l1);
		System.out.println(".........");
		for(int i = 0; i<=l1.size()-1;i++) {
			System.out.print(l1.get(i) + " ");
		}
		
	}
}
