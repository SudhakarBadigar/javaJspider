package javaLibraries;

public class Person {

	String name = "Anand";
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p.name.toString());
		System.out.println(p.name.charAt(2));
		System.out.println(p.name.codePointCount(0, 4));
		System.out.println(p.name.concat(" Kumar"));
		System.out.println(p.name.hashCode() );
		
	}
}
