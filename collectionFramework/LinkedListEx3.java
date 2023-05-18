package collectionFramework;

import java.util.LinkedList;

public class LinkedListEx3 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add("java");
		l.add(10);
		
		
		System.out.println(l);
		System.out.println("..........");
		l.add(1, 60);
		System.out.println(l);
		l.set(1, "php");
		System.out.println(l);
	}
}
