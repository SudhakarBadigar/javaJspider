package map;

import java.util.LinkedHashMap;
import java.util.Set;

 
public class LinkedHahMapex {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(10, "java");
		lhm.put(20, "javascript");
		lhm.put(30, "web");
		lhm.put(40, "sql");
        lhm.put(10, "java");
        
        System.out.println(lhm);
        
        Set<Integer> s = lhm.keySet();
        
        for(Integer i : s) {
        	System.out.println(i + "--->"+ lhm.get(i));
        }
        
		
	}
}
