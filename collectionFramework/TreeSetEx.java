package collectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Set<String> t = new TreeSet<String>();
		t.add("java");
		t.add("java");
		t.add("python");
		t.add("javascript");
		t.add("react");
		t.add("Apple");
		t.add("windows");
		for(Object obj : t) {
			System.out.println(obj);
		}
	}

}
