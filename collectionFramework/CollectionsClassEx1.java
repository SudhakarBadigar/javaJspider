package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassEx1 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
//		l.add("java");
//		l.add("php");
//		l.add("oracle");
		l.add(10);
		l.add(40);
		l.add(20);
//		l.add(3.2);
		
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);
		
		
		
		
	}

}
