package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set s = new HashSet();
		HashSet hs = new HashSet<>(20);
		//insertion order is not maintained.
		//not index based.
		//Duplicates are not considered.
		s.add(10);
		s.add(20);
		s.add(20);
		s.add(null);
		s.add("java");
		s.add(21.1);
		s.add(true);
		s.add(12.3f);
		s.add(30);
		
		for(Object obj:s) {
			System.out.println(obj);
			
		}
		System.out.println(s+ " size is= " +s.size());
	}
}
