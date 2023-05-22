package collectionFramework;

import java.util.LinkedList;

public class LinkedConstructor {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add("sunny");
		l1.add(12.3);
		System.out.println(l1);
		
		l1.add(33);
		LinkedList l2 = new LinkedList(l1);
		l2.add("list2");
		System.out.println(l2);
	}

}
