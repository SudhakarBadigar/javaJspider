package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceEx1 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		List l2 = new ArrayList<>();
		l1.add(10);
		l1.add(10.2);
		l1.add(null);
		l1.add(l1);
		l1.add("java");
		l1.add(true);
		l1.add('c');
		l1.add("java");
		
		
		System.out.println(l1.get(2));
		
		System.out.println(l2.size());
		l2.add("AL");
		System.out.println(l2.size());
		//l2.addAll(l1);
		System.out.println(l1);
		System.out.println(".......................");
		System.out.println(l1.size());
		System.out.println("......................");
		System.out.println(l1.contains("java"));
		System.out.println("....................");
		System.out.println(l2);
		System.out.println("...................");
		//System.out.println(l2.addAll(l1));
		System.out.println("...........");
		System.out.println(l1.indexOf("java"));
		System.out.println("..............");
		System.out.println(l1.clone());
		System.out.println(".........");
		System.out.println(l1.isEmpty());
		System.out.println(l1.indexOf(100));
		System.out.println(l1.remove(l1));
		System.out.println(l1);
		System.out.println(l1.lastIndexOf("java"));
		System.out.println(l1.indexOf("java"));
}
	

}
