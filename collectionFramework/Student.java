package collectionFramework;

import java.util.ArrayList;

public class Student {
	int age;
	String name;

	Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Age:"+ age + "\nName:" + name; 
	}

	
	public static void main(String[] args) {
		Student s1 = new Student(22,"Tom Hank");
		Student s2 = new Student(23,"Tim cook");
		Student s3 = new Student(24,"Brad pitt");
		Student s4 = new Student(23,"cooper");
		Student s5 = new Student(23,"steve smith");
		Student s6 = new Student(23,"Ricky roon");
		Student s7 = new Student(23,"david boon");
		Student s8 = new Student(23,"pushpa raj");
		Student s9 = new Student(23,"sunder patil");
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		al.add(s9);
		//al.add(10);
		for(Student i :al) {
			System.out.println(i);
			System.out.println(".........................");
		}
		
		
		
	}
}
