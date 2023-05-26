package collectionFramework;

import java.util.TreeSet;

class StudentData implements Comparable<StudentData>{
	
	int rollno;
	String name;
	
	StudentData(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "rollno: " + rollno +" Name: " + name;
	}
	
	//sort on based on RollNo
	@Override
	public int compareTo(StudentData a) {
		return this.rollno - a.rollno;
		
	}
}
	
	
	
	
	
//	@Override
//	//sorting names(alphabets) in reverse order
//	public int compareTo(StudentData c) {
//		return c.name.compareTo(this.name);
//	}
//}

public class TreesetEx4 {
	public static void main(String[] args) {
		StudentData s1 = new StudentData(101, "Ravi");
		StudentData s2 = new StudentData(104, "Madan");
		StudentData s3 = new StudentData(105, "Aditya");
		StudentData s4 = new StudentData(102, "Zian");
		StudentData s5 = new StudentData(107, "Carol");
		StudentData s6 = new StudentData(106, "Pushpa");
		StudentData s7 = new StudentData(103, "David");
		
		
		System.out.println("..............");
		TreeSet<StudentData> t = new TreeSet<StudentData>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		t.add(s6);
		t.add(s7);
		
		for(StudentData data : t) {
			System.out.println(data);
		}	
	}
}


