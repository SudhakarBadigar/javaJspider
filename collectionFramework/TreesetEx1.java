package collectionFramework;

import java.util.TreeSet;

public class TreesetEx1 {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("java");
		t.add("javascript");
		t.add("html");
		t.add("css");
		t.add("springboot");
		System.out.println(t);
		System.out.println("..........");
		for(String course: t) {
			System.out.println(course);
		}
		
		
		
		
		
		
	}
	

}
