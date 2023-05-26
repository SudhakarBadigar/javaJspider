package map;

import java.util.HashMap;
import java.util.Set;

public class HashmapEx {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(1, "raj");
		h.put("java", 10);
		h.put(112.2,"king");
		h.put(1, "raj");
		
		System.out.println(h);
		System.out.println("..............");
		System.out.println(h.get(1));
		System.out.println("..............");
		System.out.println(h.containsKey("java"));
		System.out.println(h.containsKey(100));
		
		System.out.println("..............");
		System.out.println(h.containsValue("king"));
		System.out.println("..............");
		System.out.println(h);
	//	h.remove(112.2);
		System.out.println(h);
		System.out.println("..............");
		System.out.println(h);
	//	h.clear();
		System.out.println(h);
		System.out.println("..............");
		
		Set s = h.keySet();
		System.out.println(s);
		System.out.println("..........");
		for(Object obj: s) {
			System.out.println(obj +"--->" + h.get(obj));
			
		}
		
		
	}

}
