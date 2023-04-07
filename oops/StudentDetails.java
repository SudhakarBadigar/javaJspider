// write a java program to store 2 student details which has name and marks.
package oops;

public class StudentDetails {

	String name;
	double marks;

	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails();
		StudentDetails s2 = new StudentDetails();
		System.out.println(s1.name + " has got " + s1.marks + " marks.");
		System.out.println(s2.name + " has got " + s2.marks + " marks.");

		s1.name= "Ram";
		s1.marks = 98;
		s2.name ="Krishna";
		s2.marks = 100;
		System.out.println(s1.name + " has got " + s1.marks + " marks.");
		System.out.println(s2.name + " has got " + s2.marks + " marks.");
		
		
		
	 	
	}

}
