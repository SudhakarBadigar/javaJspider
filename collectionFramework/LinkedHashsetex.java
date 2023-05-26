package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashsetex {
	public static void main(String[] args) {
		//linkedHashSet allows insertion order
		//Duplicates not considered
		//Not index based
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(null);
		ls.add("java");
		ls.add(10);
		ls.add(12.3);
		ls.add(20);
		ls.add(true);
		ls.add(10);
		ls.add("java");
		System.out.println(ls);
		System.out.println("............");
		System.out.println(ls.size());
		System.out.println("..............");
		for(Object obj:ls)
		{
			System.out.println(obj);
		}
		
	}

}
