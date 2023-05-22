package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Wrapperclass {

	public static void main(String[] args) {
		int a =10;
		
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(a);//internally AutoBoxing happening    al.add(new Integer(10));
		System.out.println(al);
		
		System.out.println("....................");
		System.out.println("Generics");
		LinkedList< String> ll = new LinkedList<String>();
		ll.add("madan");
		ll.add("virat");
		ll.add("ravi");
		ll.add("Aditya");
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println("....");
		for(String l:ll) {
			System.out.println(l);
		}
		
		System.out.println("..............");
		LinkedList<Character> ll1 = new LinkedList<Character>();
		ll1.add('a');
		ll1.add('b');
		ll1.add('c');
		ll1.add('d');
		ll1.add('d');
		System.out.println(ll1);
		for(char c : ll1) {
			System.out.println(c);
		}
		
		System.out.println(".........");
		
		LinkedList ll2 = new LinkedList<>();
		ll2.add(10);
		ll2.add("madhava");
		ll2.add(12.3);
		ll2.add(true);
		
//		for(int k=0;k<ll2.size();k++) {
//			System.out.println(ll2.get(k));
//		}
		
		for(Object e:ll2) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
